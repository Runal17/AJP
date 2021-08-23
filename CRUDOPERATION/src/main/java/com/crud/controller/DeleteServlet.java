package com.crud.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crud.dao.UserDao;
import com.crud.dao.UserDaoImpl;


public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("id").trim());
		
		try {
			
			UserDao user=new UserDaoImpl();
			user.deleteUser(id);
			
			response.sendRedirect("show_all_users.jsp");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
