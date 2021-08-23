package com.crud.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static void main(String[] args) {
		
		getSessionFactory();
		
	}

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {

			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		}

		return sessionFactory;
	}

}
