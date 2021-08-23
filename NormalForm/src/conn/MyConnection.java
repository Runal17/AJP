package conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

	private static final String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/students";
	private static String user = "root";
	private static String password = "edac";

	public Connection getConnection() {

		Connection con = null;

		try {
			Class.forName(driver);

			con = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return con;

	}

}
