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

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String name = request.getParameter("name");
			HttpSession session = request.getSession();
			String email = request.getParameter("email");
			String password=request.getParameter("password");
			UserDao userdao = new UserDaoImpl();
			User user = new User();
			//System.out.println(user.getRole());
		    userdao.selectByUsernameAndPassword(user);
			response.sendRedirect("admin/addcardetails.jsp");
			session.setAttribute("email", email);
			session.setAttribute("name", name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
