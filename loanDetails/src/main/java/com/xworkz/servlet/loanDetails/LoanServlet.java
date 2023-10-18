package com.xworkz.servlet.loanDetails;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/loan" ,loadOnStartup = 4)
public class LoanServlet extends HttpServlet{
	
	
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String name = req.getParameter("name");
	String amount = req.getParameter("amount");
	String working = req.getParameter("working");
	String interest = req.getParameter("interest");
	String surity = req.getParameter("surity");
	String company = req.getParameter("company");
	String loanTenure = req.getParameter("loanTenure");
	String type = req.getParameter("type");
	String accept = req.getParameter("accept");

	req.setAttribute("name", name);
	req.setAttribute("amount", amount);
	req.setAttribute("working", working);
	req.setAttribute("interest", interest);
	req.setAttribute("surity", surity);
	req.setAttribute("company", company);
	req.setAttribute("loanTenure", loanTenure);
	req.setAttribute("type", type);
	req.setAttribute("accept", accept);

	RequestDispatcher dispatcher = req.getRequestDispatcher("LoanApplyDisplay.jsp");
	dispatcher.forward(req, resp);
	}
	}


