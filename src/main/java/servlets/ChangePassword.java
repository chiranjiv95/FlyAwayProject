package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ChangePassword() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		String pass = req.getParameter("passwordEntered");
		if (!Login.isLoggedIn) {
			out.println("You must login first");
		} else if (pass.equals("")) {
			out.println("Password can't be empty");
		} else if (Login.isLoggedIn && !pass.equals("")) {
			Login.password = pass;
			out.println("Password has been changed. New Password is " + Login.password);
			//resp.sendRedirect("admin-dashboard.jsp");
		} else {
			out.println("Sorry, Something went wrong!");
		}
		out.close();

	}

}
