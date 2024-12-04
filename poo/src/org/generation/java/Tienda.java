package org.generation.java;

public class Tienda {

	public static void main(String[] args) {
		
		Producto sabanaKit = new Producto("sabana", 145.00);
		Electronico tablet = new Electronico("airPad",15000.00,3);
		Producto producto1 = new Electronico("Mouse", 135, 3);
		
		tablet.mostrarDetalles(tablet.mesesGarantia);
		System.out.println("Precio actual: " + tablet.calcularPrecio());
		System.out.println("Producto: " + sabanaKit.calcularPrecio());
		
		tablet.mostrarDetalles();
		
		producto1.mostrarDetalles();
	}

}
