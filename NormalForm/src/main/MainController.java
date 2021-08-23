package main;

import java.sql.SQLException;

import dao.StudentDao;
import dao.StudentDaoImp;
import pojo.Student;

public class MainController {

	
	
	StudentDao std=new StudentDaoImp();
	
	
	public int registerStudentData(Student st) {
		int regstd=0;
		try {
			regstd= std.registerStudent(st);
			
			System.out.println("Succesfully REgisterd"+regstd);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return regstd;
		
	}
	
}
