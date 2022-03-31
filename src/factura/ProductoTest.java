package factura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ProductoTest {

	@Test
	void testNuevo() {
		Producto p = new Producto ("Libro", 15F, 2);
		String nombreActual = p.getNombre();
		String nombreExpected = "Libro";
		float precioActual = p.getPrecio();
		float precioExpected = 15F;
		int cantidadActual = p.getCantidad();
		int cantidadExpected = 2;
		assertEquals(nombreExpected, nombreActual);
		assertEquals(precioExpected, precioActual);
		assertEquals(cantidadExpected, cantidadActual);
	}
	
	@Test
	void testPrecioTotal() {
		Producto p = new Producto ("Libro", 15F, 2);
		float actual = p.precioTotal();
		float expected = 30F;
		assertEquals(actual, expected);
	}

}
