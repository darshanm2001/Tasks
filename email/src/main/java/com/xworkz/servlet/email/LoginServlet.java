package com.xworkz.servlet.email;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/Attach" , loadOnStartup = 4)

public class LoginServlet extends HttpServlet {
	
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String userId = req.getParameter("userId");
	String password = req.getParameter("password");

	req.setAttribute("userId", userId);
	req.setAttribute("password", password);

	if(userId.equals("admin") && password.equals("secret")) {
	System.out.println("Login Successful...");
	RequestDispatcher dispatcher = req.getRequestDispatcher("loginSuccess.jsp");
	dispatcher.forward(req, resp);
	}
	else {
	req.setAttribute("errorMsg","credentials not match");
	System.out.println("Credentials not matching..");
	RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
	dispatcher.forward(req, resp);
	}
	}
	}


