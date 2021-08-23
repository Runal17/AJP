package dao;

import java.sql.SQLException;

import dto.pojo.User;

public interface UserDao {

	public int registerUser(User user) throws SQLException;

	public boolean isValid(User user) throws SQLException;
}
