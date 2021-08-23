package com.vehicleparkingsystem.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vehicleparkingsystem.dao.UserDao;
import com.vehicleparkingsystem.dao.UserDaoImpl;
import com.vehicleparkingsystem.entity.User;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			HttpSession session = request.getSession();
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String questions = request.getParameter("questions");
			String mobile = request.getParameter("mobile");
			String answers = request.getParameter("answers");
			String address = "";
			String city = "";
			String state = "";
			String country = "";

			UserDao userdao = new UserDaoImpl();
			User users = new User(name, email, password, questions, mobile, answers, address, city, state, country);
			session.setAttribute("name", name);
			userdao.insert(users);
			response.sendRedirect("register.jsp?msg=valid");

		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("register.jsp?msg=invalid");	
		}
	}

}
