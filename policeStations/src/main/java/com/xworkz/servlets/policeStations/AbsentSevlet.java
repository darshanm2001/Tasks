package com.xworkz.servlets.policeStations;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns= "/darshan",loadOnStartup = 5)
public class AbsentSevlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String fromDate=req.getParameter("fromDate");
	String toDate=req.getParameter("toDate");
	String reason=req.getParameter("reason");
	String informed=req.getParameter("informed");


	req.setAttribute("name", name);
	req.setAttribute("fromDate", fromDate);
	req.setAttribute("toDate", toDate);
	req.setAttribute("reason", reason);
	req.setAttribute("informed", informed);

	RequestDispatcher dispatcher=req.getRequestDispatcher("displayabsent.jsp");
	dispatcher.forward(req, resp);

	}
	}


