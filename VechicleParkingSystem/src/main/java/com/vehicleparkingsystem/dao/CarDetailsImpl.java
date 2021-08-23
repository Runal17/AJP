package com.vehicleparkingsystem.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.vehicleparkingsystem.entity.CarEntry;
import com.vehicleparkingsystem.utility.FactoryProvider;

public class CarDetailsImpl implements CarDetailsDao {

	
	public List<CarEntry> getAllCarDetails() {
		List<CarEntry> entry = new ArrayList<CarEntry>();

		Session session =FactoryProvider.getFactory().openSession();
		Query query = session.createQuery("from CarEntry");
		entry = query.list();

		return entry;
	
	}
	
	
	public void insert(CarEntry entry) {
		
		
		try {
			
			Session session = FactoryProvider.getFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.save(entry);
			transaction.commit();
			session.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void deleteCarEntry(int id) {
		try {
			Session session =FactoryProvider.getFactory().openSession();
			Transaction transaction = session.beginTransaction();
			CarEntry entry = (CarEntry) session.get(CarEntry.class, id);
			session.delete(entry);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public void updateCarEntry(CarEntry entry, int id) {
		
		
		try {
			Session session=FactoryProvider.getFactory().openSession();
			Transaction transaction=session.beginTransaction();
			CarEntry entry1 =(CarEntry)session.get(CarEntry.class, id);
			entry1.setOwnername(entry.getOwnername());
			entry1.setParkingarea(entry.getParkingarea());
			entry1.setVehiclecolor(entry.getVehiclecolor());
			entry1.setVehiclename(entry.getVehiclename());
			entry1.setVehiclenumber(entry.getVehiclenumber());
			entry1.setVehicletype(entry.getVehicletype());
			
			
			transaction.commit();
			session.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	
}
