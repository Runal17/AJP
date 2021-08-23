package com.note.app.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getFactory() {
		
		if(sessionFactory==null) {
			
			sessionFactory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			
		}
		
		return sessionFactory;
		
		
	}

}
