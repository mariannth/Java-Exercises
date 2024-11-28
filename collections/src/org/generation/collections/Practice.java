package org.generation.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Practice {

	public static void main(String[] args) {
//		ArrayList - Colection de arreglos dinámicos

		ArrayList<String> movies = new ArrayList<String>();

//		Agregar elementos
		movies.add("The Grinch");
		movies.add("Harry Potter");
		movies.add("Titanic");
		movies.add("Matrix");

//		Obtener elemento por indice|
		String peliFav = movies.get(0);

//		Obtener el tamanio del arreglo
		int size = movies.size();

//		Remover elemento
		movies.remove(3);

//		iteración de arreglos
		for (String movie : movies) {
			System.out.println("Movies: " + movie);
		}

		System.out.println("El tamaño de mi arreglo es: " + size);
		System.out.println("Mi pelicula favorita es: " + peliFav);

		movies.add("El señor de los anillos");
		System.out.println("El tamaño de mi arreglo es: " + size);
		for (String movie : movies) {
			System.out.println("Movies: " + movie);
		}

//		ArreglosEstáticos

		int[] numerosTelefono = { 77126397, 65439283, 71234567 };

		System.out.println("Arreglo: " + Arrays.toString(numerosTelefono));

		for (int numeros : numerosTelefono) {
			System.out.println("Arreglo: " + numeros);
		}

//		Set -> palabra reservada en Java: HashSets
		HashSet<String> namesCH47 = new HashSet<String>();

//		Agregando elementos al set
		namesCH47.add("Areli");
		namesCH47.add("Abby");
		namesCH47.add("abby");
		namesCH47.add("Irving");

		System.out.println(namesCH47);
//		atributo size
		int sizeNames = namesCH47.size();

//		Remover
		namesCH47.remove("Irving");

//		Contiene - contains
		boolean isAreHere = namesCH47.contains("Areli");
		System.out.println("Areli está en la CH47: " + isAreHere);

//		Sets son iterables
		for (String name : namesCH47) {
			System.out.println("Nombres de la CH47: " + name);
		}

//		Map -> palabra reservada en Java: HashMap
		HashMap<Integer, String> users = new HashMap<Integer, String>();

//		Agregar elemento or medio de la estructura clave, valor
		users.put(0, "Hampsli");
		users.put(1, "AndereaB");
		users.put(2, "MarianaT");

		System.out.println(users);

//		Obtener el tamanio
		int sizeUser = users.size();
		System.out.println(sizeUser);

//		Get value using key
		String userKey0 = users.get(0);

//		Eliminar elementos
		users.remove(1);

//		Iteracion sobre mapas
		for (int key : users.keySet()) {
			System.out.println("La key es: " + key + " y el valor es: " + users.get(key));
		}

	}

}
