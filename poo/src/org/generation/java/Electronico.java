package org.generation.java;

//Define cuando un producto es del tipo electrónico
//Herencia con la palabra reservada extends

public class Electronico extends Producto {
	public int mesesGarantia;
	
	public Electronico(String nombre, double PrecioBase, int mesesGarantia) {
		super(nombre, PrecioBase);
		this.mesesGarantia = mesesGarantia;
	}
	
	@Override
	public double calcularPrecio() {
		return precioBase * 1.16;
	}
	@Override
	public void mostrarDetalles() {
		System.out.println("Este es un producto electrónico y su nombre del producto es: " + nombre + " precio base: $" + precioBase + " meses de garantía: " + mesesGarantia);
		
	}

}
