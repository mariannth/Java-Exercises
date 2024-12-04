package org.generation.poo;

/*Esta clase es a plantilla de mi objeto que recibe atributos
 * y comportamientos (variables de instancia) y ( métodos del objeto)
 * */

public class Poo {

	// declarar atributos (variables de instancia: Deben especificar el tipo de
	// dato)
	String nombre;
	String apellido;
	int edad;
	private double salario;
	private String puesto;
	private int id;  

	// Método constructor
	public Poo(String nombre, String apellido, int edad, double salario, String puesto, int id) {
		// El método tiene el mismo nombre de la clase
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.puesto = puesto;
		this.setId(id);
	}

//	Metodos de comportamiento

	public void Trabajar() {
		System.out.println("Estoy trabajando");
	}

//	Método para calcular el salario
	public void calcularSalario() {
		System.out.println("El salario es de $ " + this.salario);
	}

//	Método para ver info

	public void Informacion() {
		System.out.println("Nombre: " + this.nombre + ", Apellido: " + this.apellido + ", Edad: " + this.edad
				+ ", Salario: " + this.salario + ", Puesto: " + this.puesto);
	}
	
//	Metodos de accesibilidad y modificación (getters y setters)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public void setAumento(double aumento) {
        double finalSalary = getSalario() + aumento;
        setSalario(finalSalary);
   }
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//Metodos de conversion a String (toString)
//	Permite convertir la información de los objetos en String 
	
//	@Override
//	public String toString() {
//		return "Poo [nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", Salario: " + salario
//				+ ", Puesto: " + puesto + "]";
//	}
	@Override
	public String toString() {
		return "Poo [Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", Salario: " + salario
				+ ", Puesto: " + puesto + ", id: " + id + "]";
	}
	
	
	
	
	

}
