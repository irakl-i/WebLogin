package servlet;

import model.Account;
import model.Manager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Create", value = "/Create")
public class Create extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher;
		Manager manager = (Manager) context.getAttribute("manager");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (manager.usernameExists(new Account(username, password))) {
			dispatcher = request.getRequestDispatcher("used.jsp");
			dispatcher.forward(request, response);
		} else {
			manager.createAccount(username, password);
			dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}
	}
}
