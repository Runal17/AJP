package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import conn.DbCon;
import dto.pojo.User;

public class UserDaoimpl implements UserDao {

	
	private static final String REGISTER_USER="Insert into user (name,drank,username,password)\r\n" + 
			"values(?,?,?,?);";
	private static final String LOGIN_USER="select * from user where username=? and password=?";
	
	@Override
	public int registerUser(User user) {
		
		
		int status=0;
		
		Connection con= DbCon.getCon();
		PreparedStatement ps=null;
		try {
			
			ps=con.prepareStatement(REGISTER_USER);
			
			ps.setString(1,user.getName());
			ps.setInt(2,user.getRank());
			ps.setString(3,user.getUsername());
			ps.setString(4,user.getPassword());
			
			status= ps.executeUpdate();
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		return status;
		
		
	}


	@Override
	public boolean isValid(User user) {
		boolean status= false;

		
		Connection con= DbCon.getCon();
		PreparedStatement ps=null;
		
try {
			
			ps=con.prepareStatement(LOGIN_USER);
			ps.setString(1,user.getUsername());
			ps.setString(2,user.getPassword());
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				status=true;
			}
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		return status;
	}

	
	
	
}
