package uk.gov.selfserve;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.imageio.ImageIO;
import javax.mail.MessagingException;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Stub;
import org.apache.axis.configuration.FileProvider;
import org.apache.axis.message.SOAPHeaderElement;
import lagan.api.auth.FLAuthService;
import lagan.api.auth.FLAuthServiceLocator;
import lagan.api.auth.FLAuthWebInterface;
import lagan.api.main.FLWebInterface;
import lagan.api.main.FLWebService;
import lagan.api.main.FLWebServiceLocator;
import lagan.api.main.FWTCaseEformData;
import lagan.api.main.FWTCaseEformInstance;
import lagan.api.main.FWTCaseEformNew;
import lagan.api.main.FWTDocument;
import lagan.api.main.FWTEformField;
import lagan.api.main.FWTNoteDetail;
import lagan.api.main.FWTNoteDetailAttachment;
import lagan.api.main.FWTNoteToParent;

public class UpdateLaganCase 
{	
	public boolean updateCase(String laganFullCaseReference,
			                  String wsddPath,
			                  String laganSystem,
			                  String smtpHost,
			                  String emailFrom,
			                  String[] strErrorEmailTo,
			                  String[] strErrorEmailBCC,
			                  String problemType,
			                  String details,
			                  String location,
			                  String street,
			                  String ward,
			                  String sector,
			                  String name,
			                  String emailAddress,
			                  String phoneNumber,
			                  String lat,
			                  String lng,
			                  String heading,
			                  String pitch,
			                  String zoom,
			                  String descriptionEmail,
			                  String northing,
			                  String easting,
			                  String shortenedURLforTwitter,
			                  String shortenedURLforFacebook,
			                  String shortenedURLforEmail,
			                  String deviceID,
			                  boolean useImage,
			                  boolean imageApproved,
			                  String imageLocation
			                  ){
		boolean success=true;
		
		  //Authenticate to Lagan.
		  EngineConfiguration config = new FileProvider(wsddPath);
		  FLAuthService authService = new FLAuthServiceLocator(config);
		  org.apache.axis.client.Stub authStub = null;
		  try
		  {
			  FLAuthWebInterface authInterface = authService.getFLAuth();
	 		  authInterface.authenticate();
			  authStub = (Stub)authInterface;   
		  } 
		  catch (Exception authenticationError)
		  {
	   	    success = false;
			String errorLine1 = "";
			String errorLine2 = "UpdateLaganCase Failed - Authenticating to Lagan";
			String errorLine4 = "LaganSystem : " + laganSystem;
			String errorLine5 = "Error       : " + authenticationError.toString();
			String errorLine6 = "";
			System.out.println(errorLine1);
			System.out.println(errorLine2);
			System.out.println(errorLine4);
			System.out.println(errorLine5);
			System.out.println(errorLine6);
			authenticationError.printStackTrace();
			StringWriter errors = new StringWriter();
			authenticationError.printStackTrace(new PrintWriter(errors));
			String emailContents = errorLine1 + "<BR>" +
				                   errorLine2 + "<BR>" +
								   errorLine4 + "<BR>" +
								   errorLine5 + "<BR>" +
								   errorLine6 + "<BR>" +
								   errors.toString();
			SendMail authenticationErrorEmail = new SendMail();
			try
			{
				authenticationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to authenticate to Lagan", emailContents, emailFrom, smtpHost, true);
			}
			catch (MessagingException emailError)
			{
				System.out.println("Email error : " + emailError.toString());
			}
		  }
		
		  FLWebService webService = new FLWebServiceLocator(config);
		  org.apache.axis.client.Stub webStub = null;
		  
		  try
		     {
			  FLWebInterface webInterface = webService.getFL();
			  webStub = (Stub)webInterface;
			  SOAPHeaderElement[] respHdrs = authStub.getResponseHeaders();
			  for (int i = 0; i < respHdrs.length; i++)
				 {
			     webStub.setHeader(respHdrs[i]);
				 }
			  FWTCaseEformNew eForm = new FWTCaseEformNew(laganFullCaseReference, "EnvironmentalServices", "");
			  webInterface.addCaseEform(eForm);
			  FWTCaseEformInstance eFormInstance = new FWTCaseEformInstance(laganFullCaseReference, "EnvironmentalServices","");
			  FWTEformField eFormFields[] = new FWTEformField[24];
			  eFormFields[0] = new FWTEformField("cboType", problemType);
			  eFormFields[1] = new FWTEformField("txtDetails", details);
			  eFormFields[2] = new FWTEformField("txtLocation", location);
			  eFormFields[3] = new FWTEformField("txtStreet", street);
			  eFormFields[4] = new FWTEformField("txtWard", ward);
			  eFormFields[5] = new FWTEformField("txtSector", sector);
			  eFormFields[6] = new FWTEformField("txtCustomerName", name);
			  eFormFields[7] = new FWTEformField("txtEmail", emailAddress);
			  eFormFields[8] = new FWTEformField("txtCustomerTelephone", phoneNumber);
			  eFormFields[9] = new FWTEformField("txtLatitude", lat);
			  eFormFields[10] = new FWTEformField("txtLongtitude", lng);
			  eFormFields[11] = new FWTEformField("txtNotifiedBy", "SelfServe");
			  eFormFields[12] = new FWTEformField("txtFormCompletedBy", "MyCouncil");
			  eFormFields[13] = new FWTEformField("txtHeading", heading);
			  eFormFields[14] = new FWTEformField("txtPitch", pitch);
			  eFormFields[15] = new FWTEformField("txtZoom", zoom);
			  eFormFields[16] = new FWTEformField("txtHumanDescription", descriptionEmail);
			  eFormFields[17] = new FWTEformField("txtEasting", easting);
			  eFormFields[18] = new FWTEformField("txtNorthing", northing);
			  eFormFields[19] = new FWTEformField("txtCaseID", laganFullCaseReference);
			  eFormFields[20] = new FWTEformField("txtShortUrlTwitter", shortenedURLforTwitter);
			  eFormFields[21] = new FWTEformField("txtShortUrlFacebook", shortenedURLforFacebook);
			  eFormFields[22] = new FWTEformField("txtShortUrlEmail", shortenedURLforEmail);
			  eFormFields[23] = new FWTEformField("txtdeviceid", deviceID);
			  FWTCaseEformData eFormData = new FWTCaseEformData(eFormInstance, eFormFields);
			  webInterface.writeCaseEformData(eFormData);
	  }
	  catch (Exception createCaseError)
	  {
		  success = false;
		  String errorLine1 = "";
		  String errorLine2 = "UpdateLaganCase Failed - Updating case on Lagan";
		  String errorLine4 = "LaganSystem : " + laganSystem;
		  String errorLine5 = "Error       : " + createCaseError.toString();
		  String errorLine6 = "";
		  System.out.println(errorLine1);
		  System.out.println(errorLine2);
		  System.out.println(errorLine4);
		  System.out.println(errorLine5);
		  System.out.println(errorLine6);
		  createCaseError.printStackTrace();
		  StringWriter errors = new StringWriter();
		  createCaseError.printStackTrace(new PrintWriter(errors));
		  String emailContents = errorLine1 + "<BR>" +
								 errorLine2 + "<BR>" +
								 errorLine4 + "<BR>" +
								 errorLine5 + "<BR>" +
								 errorLine6 + "<BR>" +
								 errors.toString();
		  SendMail caseCreationErrorEmail = new SendMail();
		  try
		  {
			  caseCreationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to update a case on Lagan", emailContents, emailFrom, smtpHost, true);
		  }
		  catch (MessagingException emailError)
		  {
			  System.out.println("Email error : " + emailError.toString());
		  }
	  }	
	 
	  System.out.println("imageApproved="+imageApproved);
	  if(useImage){
		System.out.println("loading image");
		String documentName = laganFullCaseReference.substring(laganFullCaseReference.length() - 6) + ".jpg";
		String imageString = "";
		Integer documentType = 1;
		try {
		    ByteArrayOutputStream baos = new ByteArrayOutputStream();
		    ImageIO.write(ImageIO.read(new File(imageLocation)), "jpeg", baos);
		    byte[] imageBytes = baos.toByteArray();
		    
		    
		    imageString = new sun.misc.BASE64Encoder().encode(imageBytes);
		    System.out.println("success");
		} catch (IOException e) {
			System.out.println("error");
		}
		FWTDocument addDocument = new FWTDocument();
		addDocument.setDocumentName(documentName);
		addDocument.setDocument(imageString);
		addDocument.setDocumentType(documentType);
		  FLWebInterface webInterface;
		try {
			webInterface = webService.getFL();
			webStub = (Stub)webInterface;
			SOAPHeaderElement[] respHdrs = authStub.getResponseHeaders();
			for (int i = 0; i < respHdrs.length; i++)
			{
			   webStub.setHeader(respHdrs[i]);
			}
			String documentRef = webInterface.addDocumentToRepository(addDocument);
			//Create NoteToParent Object
			FWTNoteToParent addNote = new FWTNoteToParent();
			addNote.setParentId( Long.valueOf(laganFullCaseReference));
			//parentType is '0' for case '1' for interaction
			addNote.setParentType(0);						  
			//Create Note Content object
			FWTNoteDetail noteContent = new FWTNoteDetail();
			noteContent.setText("A photo exists for this issue");					  
			//Create Note Attachment object - one for each attachment
			FWTNoteDetailAttachment noteAttach = new FWTNoteDetailAttachment();
			//Set details for the attachment
			noteAttach.setAttachmentIdentifier(documentRef);
			noteAttach.setAttachmentName("Open with internal image viewer");
			noteAttach.setAttachmentType(0);						  
			//Set the attachment list array and add the attachment(s) - could be more than one.
			FWTNoteDetailAttachment[] noteAttachments = {noteAttach};						  
			//Add the array of attachments to the note content
			noteContent.setNoteAttachments(noteAttachments);						  
			//Add the note content to the note object
			addNote.setNoteDetails(noteContent);						
			//use the auth stub to create the note
			webInterface.createNotes(addNote);  
		} catch (Exception imageUploadError) {
			  success = false;
			  String errorLine1 = "";
			  String errorLine2 = "UpdateLaganCase Failed - Uploading image on Lagan";
			  String errorLine4 = "LaganSystem : " + laganSystem;
			  String errorLine5 = "Error       : " + imageUploadError.toString();
			  String errorLine6 = "";
			  System.out.println(errorLine1);
			  System.out.println(errorLine2);
			  System.out.println(errorLine4);
			  System.out.println(errorLine5);
			  System.out.println(errorLine6);
			  imageUploadError.printStackTrace();
			  StringWriter errors = new StringWriter();
			  imageUploadError.printStackTrace(new PrintWriter(errors));
			  String emailContents = errorLine1 + "<BR>" +
									 errorLine2 + "<BR>" +
									 errorLine4 + "<BR>" +
									 errorLine5 + "<BR>" +
									 errorLine6 + "<BR>" +
									 errors.toString();
			  SendMail caseCreationErrorEmail = new SendMail();
			  try
			  {
				  caseCreationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to upload an image on Lagan", emailContents, emailFrom, smtpHost, true);
			  }
			  catch (MessagingException emailError)
			  {
				  System.out.println("Email error : " + emailError.toString());
			  }
		}		
	  }
		return success;
	}
}