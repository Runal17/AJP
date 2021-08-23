package com.app.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	public static SessionFactory  getSessionFactory() {
		
		
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	config.buildSessionFactory();
	System.out.println("created");
	
	return sessionFactory;	
	}
	


public static void closeFactory() {
	
	if(sessionFactory.isOpen()) {
		sessionFactory.close();
	}
}
}