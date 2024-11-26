package org.generation.loopsYCollections;
import java.util.Scanner;

public class NombreLetras {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre= scanner.nextLine();
		
		System.out.println("Las letras de tu nombre son: ");
		
		for(int i = 0; i <nombre.length(); i++) {
			System.out.println(nombre.charAt(i));
		}
		
		
		//cerrando el lector
		scanner.close();

	}

}
