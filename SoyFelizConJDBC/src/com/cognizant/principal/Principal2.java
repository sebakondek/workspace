package com.cognizant.principal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class Principal2 {

	public static void main(String[] args) {

		String nombreDriver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sakila";
		
		Connection connection = null;
		
		
		try {
			Class.forName(nombreDriver);
			connection = DriverManager.getConnection(url, "root", "password");
			String sql = "insert into country (country)" + "values (?)";
			java.sql.PreparedStatement comandoInsert = connection.prepareStatement(sql);
			comandoInsert.setString(1, "ArgentinaFeliz");
	//		comandoInsert.setDate(2, new Date(new java.util.Date().getTime()));
			comandoInsert.execute();
		} catch (ClassNotFoundException e) {
			System.out.println("No hay driver jdbc: " + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("No un error de sql");
			e.printStackTrace();
		} finally {
			if(connection != null){
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
