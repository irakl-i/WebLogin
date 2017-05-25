package listener;

import model.Manager;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener()
public class Listener implements ServletContextListener {

	// Public constructor is required by servlet spec
	public Listener() {
	}

	// -------------------------------------------------------
	// ServletContextListener implementation
	// -------------------------------------------------------
	public void contextInitialized(ServletContextEvent sce) {
		Manager manager = new Manager();
		ServletContext context = sce.getServletContext();
		context.setAttribute("manager", manager);
	}

	public void contextDestroyed(ServletContextEvent sce) {
	  /* This method is invoked when the Servlet Context
		 (the Web application) is undeployed or
         Application Server shuts down.
      */
	}
}
