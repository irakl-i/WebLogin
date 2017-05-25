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

@WebServlet(name = "login", value = "/login")
public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher;
		Manager manager = (Manager) context.getAttribute("manager");
		Account account = new Account(request.getParameter("username"), request.getParameter("password"));

		if (manager.accountExists(account)) {
			dispatcher = request.getRequestDispatcher("welcome.jsp");
			dispatcher.forward(request, response);
		} else {
			dispatcher = request.getRequestDispatcher("incorrect.jsp");
			dispatcher.forward(request, response);
		}
	}
}
