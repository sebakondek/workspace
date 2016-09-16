package javaparcialito;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class GestorDePedidos {

	public void guardarPedido(Pedido pedido){
		
		Connection connection = null;
		
		try {
			connection = DBUtil.recuperarConnection();
			String sql = "INSERT INTO itempedido (idPedido, idArticulo, cantidad, precio) VALUES (?,?,?,?);";
			PreparedStatement guardar = connection.prepareStatement(sql);
			
			guardar.setInt(1, pedido.getIdpedido());
			guardar.setInt(2, pedido.getIdarticulo());
			guardar.setInt(3, pedido.getCantidad());
			guardar.setDouble(4, pedido.getPrecio());
			
			guardar.execute();
			
			connection = DBUtil.recuperarConnection();
			 String sql1 = "INSERT INTO pedido (idpedido,estado) VALUES (?,?);";
			 PreparedStatement guardar2 = connection.prepareStatement(sql1);
			 
			 guardar2.setInt(1, pedido.getIdpedido());
			 guardar2.setString(2, pedido.getEstado());
			 
			 guardar2.execute();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.cerrarConection(connection);
		}
	}
	
	public ArrayList<Pedido> listarPedido(int idpedido){
		
		ArrayList<Pedido> pedidos = new ArrayList<>();
		Connection connection = null;
		
		try {
			connection = DBUtil.recuperarConnection();
			String sql = "SELECT idarticulo, cantidad, precio, estado FROM itempedido as i " + 
			"INNER JOIN pedido as p ON i.id=p.id WHERE p.idpedido = ?";
			PreparedStatement buscar = connection.prepareStatement(sql);
			
			buscar.setInt(1, idpedido);
			ResultSet rs = buscar.executeQuery();
			
			if(rs.next()){
				
				Pedido pedido = new Pedido();
				
				pedido.setIdpedido(idpedido);
				pedido.setIdarticulo(rs.getInt("idarticulo"));
				pedido.setCantidad(rs.getInt("cantidad"));
				pedido.setPrecio(rs.getFloat("precio"));
				pedido.setEstado(rs.getString("estado"));
				
				pedidos.add(pedido);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.cerrarConection(connection);
		}
		
		return pedidos;
	}
}
