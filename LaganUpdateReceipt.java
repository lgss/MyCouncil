package uk.gov.selfserve;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
//import lagan.api.auth.*;
import lagan.api.main.*;
//import org.apache.axis.EngineConfiguration;
//import org.apache.axis.configuration.FileProvider;
import org.apache.axis.client.Stub;
import org.apache.axis.message.SOAPHeaderElement;

public class LaganUpdateReceipt extends HttpServlet
   {

   public void doGet(HttpServletRequest request,
                     HttpServletResponse response) 
                    throws ServletException, IOException
      {
	  //System.getProperties().put("http.proxyHost", "localhost");
	  //System.getProperties().put("http.proxyPort", "8888");
	  String laganSystem = getServletConfig().getInitParameter("laganSystem");
	  String errorEmailTo = getServletContext().getInitParameter("errorEmailTo");
	  String emailFrom = getServletContext().getInitParameter("emailFrom");
	  String smtpHost = getServletContext().getInitParameter("smtpHost");
      String reference=request.getParameter("CallingApplicationTransactionReference");
      String receipt=request.getParameter("IncomeManagementReceiptNumber");
	  String[] strErrorEmailTo = { errorEmailTo };
	  String[] strErrorEmailBCC = new String[0];
      response.setContentType("text/html");
      PrintWriter webPageOutput=null;
      webPageOutput=response.getWriter();
	  LaganLogIn laganLogIn = new LaganLogIn();
	  LogIn objLogIn = laganLogIn.logIn(laganSystem,
		                                getServletContext().getRealPath("/WEB-INF/mycouncil.wsdd"),
										strErrorEmailTo,
										strErrorEmailBCC,
										emailFrom,
										smtpHost);
	  if (objLogIn.getSuccess())
	  {
		  lagan.api.main.FLWebService webService = new lagan.api.main.FLWebServiceLocator(objLogIn.getConfig());
		  org.apache.axis.client.Stub webStub = null;
		  try
		    {
			  lagan.api.main.FLWebInterface webInterface = webService.getFL();
			  webStub = (Stub)webInterface;
			  SOAPHeaderElement[] respHdrs = objLogIn.getStub().getResponseHeaders();
			  for (int i = 0; i < respHdrs.length; i++)
			  {
				  webStub.setHeader(respHdrs[i]);
			  }
		      lagan.api.main.FWTCaseEventNew caseEvent = new lagan.api.main.FWTCaseEventNew(reference, "Payment Confirmation", "Receipt Number : " + receipt,"","");
		      webInterface.addCaseEvent(caseEvent);
		    }
		  catch (Exception e)
		    {
		    webPageOutput.println("*** Error updating Lagan");
		    webPageOutput.println("laganSystem=" + laganSystem + "<BR>");
		    webPageOutput.println("URL=" + request.getQueryString() + "<BR>");
		    webPageOutput.println("Reference=" + reference + "<BR>");
		    webPageOutput.println("Receipt=" + receipt);
		    webPageOutput.println(e.toString());
		    }
		  ////    response.sendRedirect("http://selfserve.northampton.gov.uk/Ef3/nbcPayLinkReturn.jsp" + "?" + request.getQueryString());
		  //      response.sendRedirect("http://fscrmtestw2k3:8080/Ef3/nbcPayLinkReturn.jsp" + "?" + request.getQueryString());
		  webPageOutput.close();
	  }
   }
   }