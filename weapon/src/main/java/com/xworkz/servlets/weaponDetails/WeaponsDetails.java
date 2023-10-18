package com.xworkz.servlets.weaponDetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet (urlPatterns = "/weapon" , loadOnStartup=4)

public class WeaponsDetails extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String madeBy = req.getParameter("madeBy");
		String price = req.getParameter("price");
		String type = req.getParameter("type");

		System.out.println(" Name : " + name);
		System.out.println(" MadeBy : " + madeBy);
		System.out.println(" Price : " + price);
		System.out.println(" Type : " + type);
		
		
		
		
		int convertedPrice = Integer.parseInt(price);
		
		if (convertedPrice > 15000) {
			System.out.println("It is too costly,not able to buy...");
			} else {
			System.out.println("It is able to buy...");
			}

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		
		writer.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>X-workz</title>\r\n"
				+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\r\n"
				+ "\r\n"
				+ "<style>\r\n"
				+ " \r\n"
				+ "  body {\r\n"
				+ "    background-image: url('hu.webp'); \r\n"
				+ "    background-size: cover; \r\n"
				+ "    background-repeat: no-repeat; \r\n"
				+ "    background-attachment: fixed; \r\n"
				+ "  }  \r\n"
				+ "</style>\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "<nav class=\"navbar bg-dark border-bottom border-body\" data-bs-theme=\"dark\">\r\n"
				+ " \r\n"
				+ "\r\n"
				+ "  <div class=\"container-fluid\">\r\n"
				+ "    <a class=\"navbar-brand\" href=\"#\">Navbar</a>\r\n"
				+ "    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "      <span class=\"navbar-toggler-icon\"></span>\r\n"
				+ "    </button>\r\n"
				+ "    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+ "      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
				+ "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link active\" aria-current=\"page\" href=\"weapons.html\">Weapons</a>\r\n"
				+ "        </li>\r\n"
				+ "      </ul>\r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "</nav>\r\n"
				+ "<h1>Details About Weapons...</h1>\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>\r\n"
				+ "");
		writer.print("<br> Name : " + name);
		writer.print("<br> MadeBy : " + madeBy);
		writer.print(" <br>Price : " + price);
		writer.print("<br> Type : " + type);
		
		
		if (convertedPrice > 15000) {
			writer.print("</br><span style ='color:red;'>It is too costly,not able to buy...");
			} else {
			writer.print("</br><span style ='color:green;'>It is able to buy...");
			}
	}

	
}