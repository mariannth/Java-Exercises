package org.generation.poo;

import java.util.HashMap;

public class EmpleadoService {
//	Por qué la clase PersonService es un "service"
//	En Java (y en general en diseño de software), una clase de servicio (service) representa una capa lógica que contiene operaciones o funcionalidades específicas relacionadas con un dominio o negocio.
//	En este caso, la clase PersonService:
//	Administra datos relacionados con Person.
//	Proporciona métodos para agregar, buscar y mostrar personas.
//	Utiliza colecciones (List y HashMap) para almacenar y gestionar datos.
//	Encapsula la lógica del negocio.
//	Centraliza cómo se accede y manipulan los objetos Person.
//	Facilita cambios futuros en la implementación sin afectar otras capas de la aplicación.
//	Intermediaria entre las capas de datos y la aplicación.
//	Podría consumir datos de una base de datos o simplemente operar sobre datos en memoria.
//	Es común en aplicaciones con arquitectura en capas o arquitectura limpia (Clean Architecture).
//	Por estas razones, la clase se llama PersonService y no, por ejemplo, PersonManager o simplemente Person.
//	¿Qué es un "service" en Java?
//	En Java, un "service" es un concepto que surge del diseño orientado a capas. Aunque Java no tiene un tipo específico de clase "service", el término es ampliamente utilizado en patrones de diseño y arquitecturas como MVC (Model-View-Controller) o arquitectura en capas.
//	Características de un "service":
//	Centralización de la lógica de negocio:
//	Contiene operaciones y reglas que procesan datos o ejecutan funcionalidades específicas de la aplicación.
//	Ejemplo: Cálculos, validaciones, transformaciones.
//	Separación de responsabilidades:
//	Un "service" no maneja directamente la interfaz del usuario ni interactúa directamente con la base de datos.
//	Delega tareas específicas a las capas adecuadas (por ejemplo, DAO para datos).
//	Reutilización:
//	Los servicios suelen ser usados por múltiples controladores o capas de la aplicación, mejorando la modularidad y reduciendo duplicación de código..

	HashMap<Integer, Poo> EmpleadoIdList = new HashMap<Integer, Poo>();

	public void addEmpleado(Poo newEmpleado) {
		EmpleadoIdList.put(newEmpleado.getId(), newEmpleado);
		
	}
	
	public Poo findEmpleadoById(Integer id) {
		for(int idEmployee: EmpleadoIdList.keySet()) {
			if(id == idEmployee) {
				return  ;
			}
		}
	}
}