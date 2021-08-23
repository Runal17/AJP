package com.vehicleparkingsystem.dao;

import java.util.List;


import com.vehicleparkingsystem.entity.CarEntry;

public interface CarDetailsDao {
	
	public List<CarEntry> getAllCarDetails();
	public void insert(CarEntry entry);
	public void deleteCarEntry(int id);
	public void updateCarEntry(CarEntry entry,int id);

}
