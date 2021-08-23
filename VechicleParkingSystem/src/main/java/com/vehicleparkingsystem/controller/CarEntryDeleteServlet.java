package com.vehicleparkingsystem.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vehicleparkingsystem.dao.CarDetailsImpl;




public class CarEntryDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CarEntryDeleteServlet() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id").trim());
		
		CarDetailsImpl carDetailsImpl= new CarDetailsImpl();
		carDetailsImpl.deleteCarEntry(id);
		response.sendRedirect("show_all_cardetails.jsp");
	
	}
	

}
