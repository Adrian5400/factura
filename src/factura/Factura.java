package factura;

import java.util.Vector;

public class Factura {
	
	Vector<Producto> productos = new Vector<Producto>();
	
	public void meterProducto(Producto p) {
		productos.add(p);
	}
	
	public float totalFactura() {
		float precio = 0;
		for(int i = 0; i < productos.size(); i++) {
			precio = precio + productos.get(i).precioTotal();
		}
		return precio;
	}
	
	public float aplicarIva(float iva) {
		float precio = totalFactura();
		precio = precio + (precio * iva);
		return precio;
	}
}
