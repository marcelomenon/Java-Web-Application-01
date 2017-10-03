package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Car;

public class CarDAO {
	
	// connection with the database
	private Connection connection;
	
	public CarDAO() throws SQLException {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void add(Car car) {
		String sql = "insert into cars" + "(brand,type,year,fuel,market)" + "values (?,?,?,?,?)";
		
		try {
			//prepared statement for insert
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			//set the values
			stmt.setString(1, car.getBrand());
			stmt.setString(2, car.getType());
			stmt.setString(3, car.getYear());
			stmt.setString(4, car.getFuel());
			stmt.setString(5, car.getMarket());
			
			//execute
			stmt.execute();
			stmt.close();
			
		// Java Exception Handling
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	}
