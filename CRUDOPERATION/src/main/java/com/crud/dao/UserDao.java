package com.crud.dao;

import java.util.List;

import com.crud.entity.User;

public interface UserDao {
	
	public List<User> getAllUser();
	
	public void inserUser(User user);
	
	public void deleteUser(int id);
	
	public void updateUser(User user,int id);

}
