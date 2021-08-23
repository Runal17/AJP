package com.vehicleparkingsystem.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vehicleparkingsystem.dao.CarDetailsDao;
import com.vehicleparkingsystem.dao.CarDetailsImpl;
import com.vehicleparkingsystem.entity.CarEntry;

public class CarEntryUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CarEntryUpdateServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String ownername = request.getParameter("ownername");
		String vehicletype = request.getParameter("vehicletype");
		String vehiclecolor = request.getParameter("vehiclecolor");
		String vehiclename = request.getParameter("vehiclename");
		String vehiclenumber = request.getParameter("vehiclenumber");
		String parkingarea = request.getParameter("parkingarea");

		int id = Integer.parseInt(request.getParameter("id").trim());

		CarEntry newentry = new CarEntry();
		newentry.setOwnername(ownername);
		newentry.setVehicletype(vehicletype);
		newentry.setVehiclecolor(vehiclecolor);
		newentry.setVehiclename(vehiclename);
		newentry.setVehiclenumber(vehiclenumber);
		newentry.setParkingarea(parkingarea);

		try {
			CarDetailsDao carDetailsDao = new CarDetailsImpl();

			carDetailsDao.updateCarEntry(newentry, id);
			response.sendRedirect("show_all_cardetails.jsp");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
