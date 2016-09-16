package javaparcialito;

import java.util.ArrayList;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {

/*		Pedido pedido = new Pedido();
		pedido.setIdpedido(3);
		pedido.setIdarticulo(144);
		pedido.setCantidad(45);
		pedido.setPrecio(55);
		pedido.setEstado("Cancelado");
*/		
		
		GestorDePedidos gestorDePedidos = new GestorDePedidos();
		
	//	gestorDePedidos.guardarPedido(pedido);

		ArrayList<Pedido> pedidos = new ArrayList<>();
		pedidos = gestorDePedidos.listarPedido(3);
		
		for (Pedido pedido : pedidos) {
			
			System.out.println("IdPedido= " + pedido.getIdpedido() + "\nArticulo= " + pedido.getIdarticulo() + 
				"\nCantidad= " + pedido.getCantidad() + "\nPrecioTotal= " + (pedido.getCantidad() * pedido.getPrecio()) + "\nEstado= " + pedido.getEstado());
		}
	}
	
}