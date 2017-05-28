package listener;

import model.Manager;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener()
public class Listener implements ServletContextListener {
	public void contextInitialized(ServletContextEvent sce) {
		// Initialize and save manager in context.
		Manager manager = new Manager();
		ServletContext context = sce.getServletContext();
		context.setAttribute(Key.MANAGER, manager);
	}

	public void contextDestroyed(ServletContextEvent sce) {
	  /* This method is invoked when the Servlet Context
		 (the Web application) is undeployed or
         Application Server shuts down.
      */
	}
}
