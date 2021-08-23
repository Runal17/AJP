package com.vehicleparkingsystem.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CarEntry {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String ownername;
	private String vehicletype;
	private String vehiclecolor;
	private String vehiclenumber;
	private String vehiclename;
	private String parkingarea;
	private Date addedDate;
	
	
	public CarEntry() {}

	
	
	

	public CarEntry(String ownername, String vehicletype, String vehiclecolor, String vehiclenumber, String vehiclename,
			String parkingarea, Date addedDate) {
		super();
		this.ownername = ownername;
		this.vehicletype = vehicletype;
		this.vehiclecolor = vehiclecolor;
		this.vehiclenumber = vehiclenumber;
		this.vehiclename = vehiclename;
		this.parkingarea = parkingarea;
		this.addedDate = addedDate;
	}





	public CarEntry(int id, String ownername, String vehicletype, String vehiclecolor, String vehiclenumber,
			String vehiclename, String parkingarea, Date addedDate) {
		super();
		this.id = id;
		this.ownername = ownername;
		this.vehicletype = vehicletype;
		this.vehiclecolor = vehiclecolor;
		this.vehiclenumber = vehiclenumber;
		this.vehiclename = vehiclename;
		this.parkingarea = parkingarea;
		this.addedDate = addedDate;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getOwnername() {
		return ownername;
	}





	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}





	public String getVehicletype() {
		return vehicletype;
	}





	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}





	public String getVehiclecolor() {
		return vehiclecolor;
	}





	public void setVehiclecolor(String vehiclecolor) {
		this.vehiclecolor = vehiclecolor;
	}





	public String getVehiclenumber() {
		return vehiclenumber;
	}





	public void setVehiclenumber(String vehiclenumber) {
		this.vehiclenumber = vehiclenumber;
	}





	public String getVehiclename() {
		return vehiclename;
	}





	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}





	public String getParkingarea() {
		return parkingarea;
	}





	public void setParkingarea(String parkingarea) {
		this.parkingarea = parkingarea;
	}





	public Date getAddedDate() {
		return addedDate;
	}





	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}



}
