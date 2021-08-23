package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbCon {

	private static final String driver="com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/test";
	private static final String user = "root";
	private static final String pass = "edac";
	
	
	public static Connection getCon() {
		Connection con= null;
		try {
			
			
			Class.forName(driver);
			con =DriverManager.getConnection(url,user,pass);
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	
		return con;
	}
	
	
	public static void closeCon(Connection con) {
		
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	public static void closePrep(PreparedStatement ps) {
		
		if(ps!=null) {
			try {
				ps.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
	}
	
}
