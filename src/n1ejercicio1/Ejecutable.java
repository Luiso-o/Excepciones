package n1ejercicio1;

public class Ejecutable {
	
	public static void main(String[]args) throws VentaVaciaException {
		
		Producto producto1 = new Producto("Bananas", 2);
		Producto producto2 = new Producto("Chocolate", 3);
		Producto producto3 = new Producto("Jamon", 3);
		Producto producto4 = new Producto("Arroz", 1);
		Producto producto5 = new Producto("Arroz", 1);
		
		Venta miVenta = new Venta();
	
		//Opcion con la cesta llena
//		miVenta.agregaProducto(producto1);
//		miVenta.agregaProducto(producto2);
//		miVenta.agregaProducto(producto3);
//		miVenta.agregaProducto(producto4);
//		miVenta.agregaProducto(producto5);
		
		 miVenta.calcularTotal();
				
	}
	
}
