package com.xworkz.homepage.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet (urlPatterns = "/form" ,loadOnStartup = 7)

public class ApplicationForm extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name = req.getParameter("name");
	String mobileNumber = req.getParameter("mobileNumber");
	String email = req.getParameter("email");
	String password = req.getParameter("password");
	String confirmPassword = req.getParameter("confirmPassword");
	String dob = req.getParameter("dob");
	String location = req.getParameter("location");


	req.setAttribute("name", name);
	req.setAttribute("mobileNumber", mobileNumber);
	req.setAttribute("email", email);
	req.setAttribute("password", password);
	req.setAttribute("confirmPassword", confirmPassword);
	req.setAttribute("dob", dob);
	req.setAttribute("location", location);

	RequestDispatcher dispatcher = req.getRequestDispatcher("applicationDisplay.jsp");
	dispatcher.forward(req, resp);

	}

	}


