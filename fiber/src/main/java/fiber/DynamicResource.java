package fiber;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/prajwal", loadOnStartup = 1)
	public class DynamicResource extends HttpServlet {
		public DynamicResource() {
			System.out.println("Created DynamicResource");
		}

		@Override
		public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
			System.out.println("Service method in dynamic resources.....");

		}
	}


