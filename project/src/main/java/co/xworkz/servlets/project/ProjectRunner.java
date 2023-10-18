package co.xworkz.servlets.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/day" ,loadOnStartup = 3)

public class ProjectRunner extends HttpServlet {
	
	@Override
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String date=req.getParameter("date");
		String month=req.getParameter("month");
		String year=req.getParameter("year");
		String day=req.getParameter("day");
		
		req.setAttribute("date", date);
		req.setAttribute("month",month );
	    req.setAttribute("year", year);
	    req.setAttribute("day", day);
	    
	    RequestDispatcher dispatcher=req.getRequestDispatcher("day.jsp");
	    dispatcher.forward(req, resp);
	    
		
	}

}
