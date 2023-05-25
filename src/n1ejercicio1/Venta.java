package n1ejercicio1;

import java.util.ArrayList;

public class Venta {
	
		//Atributos
	private ArrayList<Producto>productos;
	private int precioTotaldeVenta;
	
	//constructor
	public Venta() {
		productos = new ArrayList<Producto>();
		precioTotaldeVenta = 0;
	}
	
	//gets
	public ArrayList<Producto> getproductos() {
		return productos;
	}

	public int getPrecioTotaldeVenta() {
		return precioTotaldeVenta;
	}

	//Metodo añadir
	public void agregaProducto(Producto nuevo) {
		productos.add(nuevo);
	}
	
	//metodo calcularTotal con una excepcion personalizada
	public void calcularTotal() throws VentaVaciaException {
		
        try {
            if (productos.isEmpty()) {
                throw new VentaVaciaException("\n\t<<Para hacer una venta primero debes añadir productos>>");
            }else {
            	
            	for (Producto producto : productos) {
                	precioTotaldeVenta += producto.getPrecio();
                	
                }
            	System.out.println("El total de su compra es " + precioTotaldeVenta + " euros.");
            }    
            
        } finally{ 	
        	
        }
	}	    
}




