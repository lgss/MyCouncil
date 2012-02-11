package uk.gov.selfserve;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.awt.Polygon;
import java.awt.Point;

public class LocationDetails extends HttpServlet
   {
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request,
                     HttpServletResponse response) 
                    throws ServletException, IOException
    {
	int[] xpoints = {0,10,10,0};
	int[] ypoints = {0,0,10,10};
	Point point = new Point(20,20);
	Polygon authorityMap = new Polygon(xpoints,ypoints,4);
	System.out.println("Point in polygon : " + authorityMap.contains(point));
    }
   }