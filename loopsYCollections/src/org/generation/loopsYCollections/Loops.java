package org.generation.loopsYCollections;

public class Loops {

	public static void main(String[] args) {
		/*
		 * Ciclo while
		 * 
		 * mientras la condición sea verdadera ejectua lo siguiente
		 * 
		 * Ciclo do: while
		 * 
		 * Se ejecuta 1 vez el bloque de código aunque la condición esté o no
		 * cumplendose
		 * 
		 * For
		 * Las condiciones de los for se basan en 3 partes:
		 	* 1. Inicialización -> se inicializa el contador
		 	* 2. Condición -> Se utiliza la comparación de dos variables el inicializador
		 	* y la cantidad o la condición que delimiten n de interaciones, de preferencia 
		 	* se iguala = 
		 	* 3. El incremento o actualización del contador
		 *
		 * ForEach Java
		 * Utiliza la palabra reservada for, similar a un for puro
		 * en lugar de recibir condicional de tres partes: 
		 * (inicializador; condición; incremento)
		 * Va a utilizar una estructura de parámetros
		 * (TipoElemento elemento(identificarosElemento) : collection (array, ArrayList, set, map)
		 *  
		 */
		
		int contador = 1;
		
		System.out.println("-------------WHILE---------------------");
		while (contador <= 5) {
			System.out.println("Iteración: " + contador);
			contador++;
		}

		int contradorDoWhile = 1;
		
		System.out.println("-------------DO-WHILE---------------------");
		do {
			System.out.println("IteraciónDoWhile: " + contradorDoWhile);
			contradorDoWhile++;
		} while (contradorDoWhile <= 5);
		
		System.out.println("-------------FOR---------------------");
		
		for(int cont = 1; cont <= 5; cont ++) {
			System.out.println("IteraciónFor: " + cont);
		}
		
		System.out.println("-------------FOR-EACH---------------------");
		String[] names = {"Juan ", "Pedro ", "María ", "Karla "};
		String misCompaneros = " ";
		
		for(String name : names) {
			misCompaneros += name;
		}
		System.out.println(misCompaneros);

	}
}