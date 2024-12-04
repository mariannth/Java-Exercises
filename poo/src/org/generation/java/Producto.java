package org.generation.java;

/*Las interfaces son contratos entre clases, que definen como debe ser la clase
y cómo se debe de comportar, para asegurarnos que esta clase cumpla con lo 
que necesitamos */

interface Vendible {
	void mostrarDetalles();
	double calcularPrecio();
}

public class Producto implements Vendible {
	public String nombre;
	public double precioBase;

	public Producto(String nombre, double precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
	}

	public void mostrarDetalles() {
		System.out.println("Nombre del producto: " + nombre + " precio base: $" + precioBase);
	}

	public double calcularPrecio() {
		return precioBase;

	}
	public void mostrarDetalles(int mesesGarantia) {
		System.out.println("Nombre del producto: " + nombre + " precio base: $" + precioBase + " meses de garantía: " + mesesGarantia);
	}

}
