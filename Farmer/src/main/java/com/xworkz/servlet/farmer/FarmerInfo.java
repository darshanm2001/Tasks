package com.xworkz.servlet.farmer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/farmer", loadOnStartup = 5)
public class FarmerInfo extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String farmerName = req.getParameter("farmerName");
		String area = req.getParameter("area");
		String investment = req.getParameter("investment");
		String profit = req.getParameter("profit");
		String soiltype = req.getParameter("soiltype");
		String cropType = req.getParameter("cropType");
		String fertilizer = req.getParameter("fertilizer");

		double convertedInvestment = Double.parseDouble(investment);
		double convertedProfit = Double.parseDouble(profit);

		System.out.println("Farmer name  :" + farmerName);
		System.out.println(" Area :" + area);
		System.out.println(" Investment : " + investment);
		System.out.println(" profit : " + profit);
		System.out.println("soilType : " + soiltype);
		System.out.println("cropType : " + cropType);
		System.out.println("Fertilizer : " + fertilizer);
		
		
		if (convertedInvestment < convertedProfit) {
			System.out.println("Farmer Will be happy");
		} else {
			System.out.println("Farmer will be sad");
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
				+ "          <a class=\"nav-link active\" aria-current=\"page\" href=\"famrer.html\">Farmer</a>\r\n"
				+ "        </li>\r\n"
				+ "        \r\n"
				+ "       \r\n"
				+ "        \r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "</nav>\r\n"
				+ "<h1>Datils Of Farmer</h1>\r\n"
				+ " <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		writer.println("</br>Farmer name  :" + farmerName);
		writer.println("</br> Area :" + area);
		writer.println(" </br>Investment : " + investment);
		writer.println(" </br>profit : " + profit);
		writer.println("</br>soilType : " + soiltype);
		writer.println("</br>cropType : " + cropType);
		writer.println("</br>Fertilizer : " + fertilizer);
		
		if (convertedInvestment < convertedProfit) {
			writer.println("</br><span style='color:green;'>Farmer Will be happy");
		} else {
			writer.println("</br><span style='color:red;'>Farmer will be sad");
		}
		

	}
}
