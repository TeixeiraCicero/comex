package br.com.comex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection Conect(){ //throws SQLException {

		try {
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "system", "admin");
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	
}}