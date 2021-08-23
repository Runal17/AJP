package com.vehicleparkingsystem.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vehicleparkingsystem.dao.CarDetailsDao;
import com.vehicleparkingsystem.dao.CarDetailsImpl;
import com.vehicleparkingsystem.entity.CarEntry;

/**
 * Servlet implementation class AddCarServlet
 */
public class AddCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {	
		
		String ownername = request.getParameter("ownername") ;
		String  vehicletype =request.getParameter("vehicletype");
		String vehiclecolor= request.getParameter("vehiclecolor");
		String vehiclename= request.getParameter("vehiclename");
		String vehiclenumber=request.getParameter("vehiclenumber");
		String parkingarea =request.getParameter("parkingarea");
		
	
	
		
		CarEntry entry = new CarEntry(ownername,vehicletype,vehiclecolor,vehiclename,vehiclenumber,parkingarea,new Date() );
		
		CarDetailsDao details= new CarDetailsImpl();
		details.insert(entry);
		response.sendRedirect("admin/addcardetails.jsp");
			
		
	} catch (Exception e) {
		e.printStackTrace();
		response.sendRedirect("admin/addcardetails.jsp?msg=invalid");	
	
	}
}

}
