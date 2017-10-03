package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Class to open the connection with the mysql database

public class ConnectionFactory {

	public Connection getConnection() throws SQLException {
		System.out.println("connecting ...");

		// Java Exception Handling
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		}
		
		return DriverManager.getConnection("jdbc:mysql://localhost/database02","root","admin");
	}
}
