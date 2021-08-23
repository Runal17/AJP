package com.hibernate.demo;

import java.time.LocalDate;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	// Load Configuration file

      Configuration config= new Configuration();
      config.configure();
      
      // Create a session factory 
      SessionFactory factory= config.buildSessionFactory();
      Session session= factory.openSession();
      Transaction transaction= session.beginTransaction();
      
      
      // data saving logic
      Employee emp1= Employee(1,"Runal",2000,true,LocalDate.of(2020, 8, 10));
      
      session.save(emp1);
      
      transaction.commit();
      session.close();
      factory.close();
    }

	
	
}
