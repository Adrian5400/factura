package factura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FacturaTest {

	@Test
	void testTotalFactura() {
		Factura factura = new Factura();
		Producto p = new Producto("Libro", 15F, 2);
		Producto p1 = new Producto("Teclado", 10F, 3);
		Producto p2 = new Producto("Raton", 5F, 1);
		factura.meterProducto(p);
		factura.meterProducto(p1);
		factura.meterProducto(p2);
		float actual = factura.totalFactura();
		float expected = 65F;
		assertEquals(expected, actual);
	}
	
	@Test
	void testAplicarIva() {
		Factura factura = new Factura();
		Producto p = new Producto("Libro", 15F, 2);
		Producto p1 = new Producto("Teclado", 10F, 3);
		Producto p2 = new Producto("Raton", 5F, 1);
		factura.meterProducto(p);
		factura.meterProducto(p1);
		factura.meterProducto(p2);
		float actual = factura.aplicarIva(0.21F);
		float expected = 78.65F;
		assertEquals(expected, actual);
	}

}
