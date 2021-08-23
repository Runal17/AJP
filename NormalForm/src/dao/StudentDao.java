package dao;

import java.sql.SQLException;

import pojo.Student;

public interface StudentDao {

	
	public int registerStudent(Student st)throws SQLException;
	
	
}
