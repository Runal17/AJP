package com.vehicleparkingsystem.dao;

import com.vehicleparkingsystem.entity.CarEntry;
import com.vehicleparkingsystem.entity.User;

public interface UserDao {
	
		
		public void insert(User users);
		public void selectByUsernameAndPassword(User user);
		

	}


