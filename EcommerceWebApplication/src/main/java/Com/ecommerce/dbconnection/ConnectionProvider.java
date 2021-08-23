package Com.ecommerce.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	
	private static final String driver="com.mysql.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3306/cdactest";
	private static final  String username="root";
	private static final String  password="edac";
	
	
public static Connection getConnection() {
	
	
	Connection conn=null;
	
	try {
		Class.forName(driver);
		
		conn=DriverManager.getConnection(url,username,password);
		
	}catch(Exception e){
		
		e.printStackTrace();
	}
	return conn;
}
	

	
	
	
}
