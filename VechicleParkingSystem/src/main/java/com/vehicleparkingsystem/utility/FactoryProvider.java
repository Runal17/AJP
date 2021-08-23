package com.vehicleparkingsystem.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vehicleparkingsystem.entity.User;

public class FactoryProvider {

	
	
	private static SessionFactory sessionFactory;
	public static SessionFactory getFactory() {
		
		if(sessionFactory==null) {
			
			sessionFactory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			
		}
		
		return sessionFactory;
		
		
	}
	
	public static void closeFactory() {
		if(sessionFactory.isOpen()) {
			sessionFactory.close();
		}
	}
	public static void main(String[] args) {
		
		User user= new User();
		user.setName("Runal");
		user.setEmail("Runal@gmail.com");
		user.setPassword("runal");
	//	user.setRole("Admin");
		
		Session session=getFactory().openSession();
		session.save(user);
		session.beginTransaction().commit();
		
		session.close();
		closeFactory();
	}
	
}
