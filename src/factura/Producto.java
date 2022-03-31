package factura;

public class Producto {
	private String nombre;
	private float precio;
	private int cantidad;
	
	public Producto(String nombre, float precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public float precioTotal() {
		precio = precio * cantidad;
		return precio;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [nombre=");
		builder.append(nombre);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", cantidad=");
		builder.append(cantidad);
		builder.append("]");
		return builder.toString();
	}
} 
