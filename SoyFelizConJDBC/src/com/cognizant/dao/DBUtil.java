package com.cognizant.dao;
import java.sql.*;

public class DBUtil {

	public static Connection recuperarConnection() throws ClassNotFoundException, SQLException{
		
		String nombreDriver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/ejemplo";
		
		Class.forName(nombreDriver);
		return DriverManager.getConnection(url, "root", "password");
	}
	
	public static void cerrarConection(Connection connection){
		
		if(connection != null){
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
