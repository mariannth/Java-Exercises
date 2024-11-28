package org.generation.collections;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Collections {

	public static void main(String[] args) {
		// Crear un HashMap para almacenar nombres y listas de preferencias
		Map<String, List<String>> preferences = new HashMap<>();

		// Agregar datos de las personas y sus preferencias
		preferences.put("Katie", new ArrayList<>(List.of("Android", "WordPress")));
		preferences.put("Magda", new ArrayList<>(List.of("Facebook")));
		preferences.put("Vanessa", new ArrayList<>(List.of("Tools")));
		preferences.put("Ania", new ArrayList<>(List.of("JEE")));

		// Imprimir las preferencias de cada persona
		System.out.println("Preferencias de los usuarios:");
		for (Map.Entry<String, List<String>> entry : preferences.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}