package com.xworkz.servlet.jspBakery;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/darshan" , loadOnStartup = 5)
public class BakeryServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String itemName = req.getParameter("itemName");
		   String itemPrice = req.getParameter("itemPrice");
		   String quantity = req.getParameter("quantity");
		   String discount = req.getParameter("discount");
		   String gst = req.getParameter("gst");
		   String manufactureDate = req.getParameter("manufactureDate");
		   String expireDate = req.getParameter("expireDate");

		   System.out.println(itemName);
		   System.out.println(itemPrice);
		   System.out.println(quantity);
		   System.out.println(discount);
		   System.out.println(gst);
		   System.out.println(manufactureDate);
		   System.out.println(expireDate);

		  
		       double convertedItemPrice = Double.parseDouble(itemPrice);
		       int convertedQuantity = Integer.parseInt(quantity);
		       int convertedDiscount = Integer.parseInt(discount);
		       double total = (convertedItemPrice * convertedQuantity)*(1-(convertedDiscount/100.0));
		      

		       req.setAttribute("itemName", itemName);
		       req.setAttribute("itemPrice", itemPrice);
		       req.setAttribute("quantity", quantity);
		       req.setAttribute("discount", discount);
		       req.setAttribute("gst", gst);
		       req.setAttribute("manufactureDate", manufactureDate);
		       req.setAttribute("expireDate", expireDate);
		       req.setAttribute("total", total);
		       System.out.println("Bakery Details saved successfully");
		       RequestDispatcher dispatcher = req.getRequestDispatcher("bakeryDisplay.jsp");
		       dispatcher.forward(req, resp);
		       
		}
		}



	

