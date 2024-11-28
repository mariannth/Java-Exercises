package org.generation.poo;


public class PooMain {

	public static void main(String[] args) {
		
		//Instanciar nuevos objetos a partir de la clase Poo
		Poo Mar = new Poo("Mariana", "Torres", 26, 30.000d, "Desarrolladora");
		Poo Juan = new Poo("Juan", "Perez", 26, 18.000d, "Ingeniero");
		Poo Pedro = new Poo("Pedro", "Lopez ", 26, 25.000d, "Analista");
		Poo Ana = new Poo("Ana", "Ruiz ", 26, 25.000d, "Científico de datos");
		
		Mar.Trabajar();
		Juan.calcularSalario();
		Pedro.Informacion();
		
		System.out.println("El sueldo de " + Ana.getNombre() + " es de: "+ Ana.getSalario() + " y su puesto es: "+ Ana.getPuesto());
		
//		Modificar informacion (setters)
		double nuevoSalario = Mar.getSalario() + 5.000;
		Mar.setSalario(nuevoSalario);
		
		System.out.println("El sueldo de " + Mar.getNombre() + " es de: "+ Mar.getSalario() + " y su puesto es: "+ Mar.getPuesto());
		

	}

}
