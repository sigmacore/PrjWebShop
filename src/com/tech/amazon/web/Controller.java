package com.tech.amazon.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tech.amazon.action.CategoryAction;
import com.tech.amazon.action.CustomerAction;
import com.tech.amazon.action.LoginAction;
import com.tech.amazon.model.ShoppingCart;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {

	public Controller() {
		super();

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		String action = request.getParameter("action");
		boolean result = false;
		HttpSession session = null;
		System.out.println(action);
		switch (action) {
			case "createNewCustomer":
				result =
					new CustomerAction().createNewCustomer(request.getParameter("name"),
						request.getParameter("street"), request.getParameter("city"),
						request.getParameter("state"), Integer.parseInt(request.getParameter("zip")),
						Long.parseLong(request.getParameter("phone")), request.getParameter("email"),
						Long.parseLong(request.getParameter("ccno")), request.getParameter("vdate"));
				// temp

				session = request.getSession();

				// temp
				if (result == true) {

					this.getServletContext().getRequestDispatcher("/jsp/customersuccess.jsp")
						.forward(request, response);

				} else {
					this.getServletContext().getRequestDispatcher("/jsp/customerfail.jsp")
						.forward(request, response);
				}

				break;
			case "login":
				result =
					new LoginAction()
						.login(request.getParameter("uname"), request.getParameter("pword"));
				// temp

				// HttpSession session = request.getSession();

				// temp
				if (result == true) {
					session = request.getSession();
					session.setAttribute("username", request.getParameter("uname"));
					session.setAttribute("sc", new ShoppingCart());
					this.getServletContext().getRequestDispatcher("/jsp/shopping.jsp")
						.forward(request, response);

				} else {
					request.setAttribute("errorMessage",
						"User Name or Password incorrect. Please try again.");
					this.getServletContext().getRequestDispatcher("/jsp/login.jsp")
						.forward(request, response);
				}

				break;
			case "createNewCategory":
				result =
					new CategoryAction().createNewCategory(request.getParameter("name"),
						request.getParameter("desc"), request.getParameter("status"));
				if (result == true) {

					this.getServletContext().getRequestDispatcher("/jsp/categorysuccess.jsp")
						.forward(request, response);

				} else {
					this.getServletContext().getRequestDispatcher("/jsp/categoryfail.jsp")
						.forward(request, response);
				}
				break;

		}

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		this.doGet(request, response);
	}

}
