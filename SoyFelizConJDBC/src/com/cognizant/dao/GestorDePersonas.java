package com.cognizant.dao;
import java.util.ArrayList;
import java.sql.*;

import com.cognizant.bo.Persona;

public class GestorDePersonas {

	public void altaDePersona(Persona persona){
		
		Connection connection = null;
		
		try {
			connection = DBUtil.recuperarConnection();
			String sql = "INSERT INTO personas (nombre, apellido, edad) VALUES (?, ?, ?)";
			PreparedStatement commandoInsert = connection.prepareStatement(sql);
			
			commandoInsert.setString(1, persona.getNombre());
			commandoInsert.setString(2, persona.getApellido());
			commandoInsert.setInt(3, persona.getEdad());
			commandoInsert.execute();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.cerrarConection(connection);
		}
		
	}
	
	public void bajaDePersona(int idpersona){
		
		Connection connection = null;
		
		try {
			connection = DBUtil.recuperarConnection();
			String sql = "DELETE FROM personas WHERE idpersonas = ?";
			PreparedStatement commandoInsert = connection.prepareStatement(sql);
			
			commandoInsert.setInt(1, idpersona);
			commandoInsert.execute();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.cerrarConection(connection);
		}
		
	}
	
	public void actualizarPersona(Persona persona){
		
		Connection connection = null;
		
		try {
			connection = DBUtil.recuperarConnection();
			String sql = "UPDATE personas SET nombre = ?, apellido = ?, edad = ? WHERE idpersonas = ?";
			PreparedStatement commandoInsert = connection.prepareStatement(sql);
			
			commandoInsert.setString(1, persona.getNombre());
			commandoInsert.setString(2, persona.getApellido());
			commandoInsert.setInt(3, persona.getEdad());
			commandoInsert.setInt(4, persona.getIdPersona());

			commandoInsert.execute();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.cerrarConection(connection);
		}
		
		
	}
	
	public Persona buscarPersonaPorId(int idpersona){
		
		Persona persona = null;
		Connection connection = null;
		
		try {
			connection = DBUtil.recuperarConnection();
			String sql = "SELECT nombre, apellido, edad FROM personas WHERE idpersonas = ?";
			PreparedStatement commandoInsert = connection.prepareStatement(sql);
			
			commandoInsert.setInt(1, idpersona);
			ResultSet resultado = commandoInsert.executeQuery();
			if(resultado.next()){
				persona = new Persona();
				persona.setNombre(resultado.getString("nombre"));
				persona.setApellido(resultado.getString("apellido"));
				persona.setEdad(resultado.getInt("edad"));
				persona.setIdPersona(idpersona);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.cerrarConection(connection);
		}
		
		return persona;
	}
	
	public ArrayList<Persona> recuperarPersonas(){
		
		ArrayList<Persona> personas = new ArrayList<>();
		
		Connection connection = null;
		
		try {
			connection = DBUtil.recuperarConnection();
			String sql = "SELECT idpersonas, nombre, apellido, edad FROM personas";
			PreparedStatement commandoInsert = connection.prepareStatement(sql);
			ResultSet result = commandoInsert.executeQuery();
			
			while(result.next()){
				
				Persona persona = new Persona();
				
				persona.setIdPersona(result.getInt(1));
				persona.setNombre(result.getString(2));
				persona.setApellido(result.getString(3));
				persona.setEdad(result.getInt(4));
				
				personas.add(persona);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.cerrarConection(connection);
		}
		
		return personas;
	}
}
