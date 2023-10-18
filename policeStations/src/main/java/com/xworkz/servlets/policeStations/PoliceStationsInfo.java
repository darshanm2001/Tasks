package com.xworkz.servlets.policeStations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/police" , loadOnStartup=4)

public class PoliceStationsInfo extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String stationName=req.getParameter("stationName");
		String location=req.getParameter("location");
		String inspectorName=req.getParameter("inspectorName");
		String siName=req.getParameter("siName");
		String headConstable=req.getParameter("headConstable");
		String assistantCommn=req.getParameter("assistantCommn");
		String noOfCells=req.getParameter("noOfCells");
		String noOfCasesPending=req.getParameter("noOfCasesPending");
		String painted=req.getParameter("painted");
		
		int convertedNoOgCells=Integer.parseInt(noOfCells);
		long convertedNoOfCasePending=Long.parseLong(noOfCasesPending);
		boolean convertedPainted=Boolean.parseBoolean(painted);
		
		System.out.println("Station name :" + stationName);
		System.out.println("Location :" + location);
		System.out.println("Inspector Name :" + inspectorName);
		System.out.println("SI Name : " + siName);
		System.out.println("Head Consatble : " + headConstable );
		System.out.println("Assistant Commn :" + assistantCommn);
		System.out.println("No Of Cells :" + noOfCells);
		System.out.println("No oF Case Pending : " +noOfCasesPending );
		System.out.println("Painted : " + painted);
		
		if(convertedNoOgCells>5) {
			System.out.println("Big Station");
		}
		else {
			System.out.println("Small station");
		}
		if(convertedNoOfCasePending>100) {
			System.out.println("Too Many cases Pending");
		}
		else {
			System.out.println("Less cases");
		}
		
		
		
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		
		
		
		writer.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>X-workz</title>\r\n"
				+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "<nav class=\"navbar bg-primary\" data-bs-theme=\"dark\">\r\n"
				+ "  <div class=\"container-fluid\">\r\n"
				+ "    <a class=\"navbar-brand\" href=\"#\">Navbar</a>\r\n"
				+ "    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "      <span class=\"navbar-toggler-icon\"></span>\r\n"
				+ "    </button>\r\n"
				+ "    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+ "      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
				+ "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link active\" aria-current=\"page\" href=\"police.html\">Police station Info</a>\r\n"
				+ "        </li>\r\n"
				+ "        \r\n"
				+ "       \r\n"
				+ "        \r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "</nav>\r\n"
				+ "<h1>Detail Info For Police Station....</h1>\r\n"
				+ " <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		writer.print("</br>Station name :" + stationName);
		writer.print("</br>Location :" + location);
		writer.print("</br>Inspector Name :" + inspectorName);
		writer.print("</br>SI Name : " + siName);
		writer.print("</br>Head Consatble : " + headConstable );
		writer.print("</br>Assistant Commn :" + assistantCommn);
		writer.print("</br>No Of Cells :" + noOfCells);
		writer.print("</br>No oF Case Pending : " +noOfCasesPending );
		writer.print("</br>Painted : " + painted);
		
		
		if(convertedNoOgCells>5) {
			writer.println("</br><span style='color:green;'>The Station is : Big Station");
		}
		else {
			writer.println("</br><span style='color:red;'>The Station is : Small station");
		}
		
		if(convertedNoOfCasePending>100) {
			writer.println("</br><span style='color:green;'>The Statin has : Too Many cases Pendings...");
		}
		else {
			writer.println("</br><span style='color:red;'>The Statin has : Less cases..");
		}
		if(convertedPainted==true) {
			writer.println("</br><span style='color:green;'>It is Clean");
		}
		else
		{
			writer.println("</br><span style='color:red;'>It is Dirty..");
		}
	}
	
	
	
	

}
