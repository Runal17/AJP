package com.crud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crud.dao.UserDao;
import com.crud.dao.UserDaoImpl;
import com.crud.entity.User;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		long mobile = Long.parseLong(request.getParameter("mobile"));
		
		User user=new User(name,email,mobile);
		
		try {
			
			UserDao userDao=new UserDaoImpl();
			userDao.inserUser(user);
			
			response.sendRedirect("show_all_users.jsp");
			
		}catch (Exception e) {
		e.printStackTrace();
		}
		
		

	}

}
