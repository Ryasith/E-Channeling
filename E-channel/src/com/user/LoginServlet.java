package com.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		//get inputs from login.jsp
		
		String username = request.getParameter("uid");
		String password = request.getParameter("pass");
		
		try {
		List<User> usrDetails = UserDBUtil.validate(username, password);
		
		// set cusDetails to display in a jsp page
		
		request.setAttribute("usrDetails", usrDetails);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		//redirect to other page
		
		RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
		dis.forward(request, response);

	}

}
