package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conn.MyConnection;
import pojo.Student;

public class StudentDaoImp implements StudentDao {

	
	private static String query= "insert into students values(?,?,?,?,?,?,?,?)";
	
	@Override
	public int registerStudent(Student st) {

        int regstd=0;
		
		MyConnection conn= new MyConnection();
		Connection conn2= conn.getConnection();
		PreparedStatement ps=null;
		try {
		    ps= conn2.prepareStatement(query);
			ps.setString(1,st.getName());
			ps.setString(2,st.getStdid());
			ps.setString(3,st.getEmailid());
			ps.setString(4,st.getMobileno());
			ps.setString(5,st.getCollege());
			ps.setString(6,st.getGender());
			ps.setString(7,st.getUsername());
			ps.setString(8,st.getPassword());
			regstd=ps.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			
			if(ps!=null || conn2!=null) {
				try {
					ps.close();
					conn2.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		}
		
		return regstd;
	}

	
	}


