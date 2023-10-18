package fiber;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/toy",loadOnStartup = 2)
	public class ToyResource extends HttpServlet{
		
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String name=req.getParameter("name");
			String quantity=req.getParameter("idealFor");
			String minAge=req.getParameter("minAge");
			String idealFor=req.getParameter("quantity");
			String color=req.getParameter("color");
			
			System.out.println("Toy Name : "+name);
			System.out.println("Ideal For : "+idealFor);
			System.out.println("Min Age : "+minAge);
			System.out.println("Quantity : "+quantity);
			System.out.println("Color : "+color);
			
			
			resp.setContentType("text/plain");
			PrintWriter writer=resp.getWriter();
			
			writer.println(name+"name"+idealFor+"in"+minAge+"having quantity"+quantity+"and "+color+"colors");
			
			
		}

	}


