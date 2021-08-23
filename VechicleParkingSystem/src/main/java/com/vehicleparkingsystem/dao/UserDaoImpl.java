package com.vehicleparkingsystem.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.vehicleparkingsystem.entity.CarEntry;
import com.vehicleparkingsystem.entity.User;
import com.vehicleparkingsystem.utility.FactoryProvider;

public class UserDaoImpl implements UserDao {

		public void insert(User users) {
			Session session=FactoryProvider.getFactory().openSession();
			session.save(users);
			Transaction transaction=session.beginTransaction();
			transaction.commit();
			
			session.close();
			//FactoryProvider.closeFactory();
		}

		public void selectByUsernameAndPassword(User user) {
			Session session=FactoryProvider.getFactory().openSession();
			Query query=session.createQuery("from User u where u.email=:email and u.password=:password");
			query.setParameter("email", user.getEmail());
	        query.setParameter("password", user.getPassword());
	        List result = query.list();

	        System.out.println("resultset:"+result);

	        Iterator iterator = result.iterator();
	        while(iterator.hasNext()){
	            User user1= (User) iterator.next();

			}
	        session.close();
	      //  FactoryProvider.closeFactory();
		
		}

		
		
}
