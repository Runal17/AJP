package com.crud.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.crud.entity.User;
import com.crud.utility.HibernateUtil;

public class UserDaoImpl implements UserDao {

	public List<User> getAllUser() {

		List<User> users = new ArrayList<User>();

		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("from User");
		users = query.list();

		return users;
	}

	public void inserUser(User user) {

		try {

			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.save(user);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void deleteUser(int id) {

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			User user = (User) session.get(User.class, id);
			session.delete(user);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updateUser(User user,int id) {
		
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction transaction=session.beginTransaction();
			User u=(User)session.get(User.class, id);
			u.setName(user.getName());
			u.setEmail(user.getEmail());
			u.setMobile(user.getMobile());
			
			transaction.commit();
			session.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
