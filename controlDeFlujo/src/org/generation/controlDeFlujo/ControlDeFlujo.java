package org.generation.controlDeFlujo;

import java.util.Scanner;

public class ControlDeFlujo {

	public static void main(String[] args) {
		// Comentarios de una sola línea
		/*
		 * comentarios multilíneas
		 */
		/*
		 * Tipos de datos y variables Variable es un espacio de memoria que puede variar
		 * Datos: Almacenan numeros enteros: int (-2147483648, 2147483647),
		 * short(-32,768, 32767), long (-9223372036854775808, 9223372036854775807),
		 * byte(-128,127) Almacenan numeros decimales: float, double Almacenan datos
		 * booleanos: boolean: true, false String es una clase que también sirve como
		 * tipo de dato char: Representa un sólo caracter
		 */

		// Cine
		byte numeroSalas = 8;
		short asientosPorSala = 120;
		int entradasVendidas = 75;
		long ingresosTotales = 5000000;
		float precioEntrada = 99.99f;
		double precioCombo = 259.50;
		char asientoLetra = 'B';
		boolean estaAbierto = true;

		String nombreCine = "blockbuster";

		System.out.println("Mi cine se llama " + nombreCine);
		System.out.println(ingresosTotales);

		/*
		 * Operadores Aritméticos: Suma (+) Resta (-) Multiplicación (*) División (/)
		 * Residuo (%) De comparación Igualdad (==) Diferencia (!=) Menor que (<) Mayor
		 * que (>) Menor o igual que (<=) Mayor o igual que (>=) Operadores Lógicos And
		 * (&&) OR (||) NOT (!)
		 */
		/*
		 * Control de flujo El control de flujo en programación es el orden en el que se
		 * ejecutan las instrucciones, sentencias o llamadas a funciones de un programa.
		 * Es un aspecto fundamental para el buen funcionamiento de los sistemas
		 * informáticos, ya que garantiza que todas las piezas funcionen de manera
		 * equilibrada
		 * 
		 * 
		 */

		// Instanciar un objeto de tipo scanner (para que me ingrese algun dato mi
		// usuario)
		Scanner scanner = new Scanner(System.in);
		String nombreUsuario;
		int edad;

		System.out.println("Hola, ingresa tu nombre: ");
		nombreUsuario = scanner.next(); // Método next() encuentra y retorna un string
		System.out.println("Dame tu edad: ");
		edad = scanner.nextInt();
		System.out.println("Tu nombre es: " + nombreUsuario + " y tu edad es: " + edad);

		// Cerrando scanner
		// scanner.close(); // es para tener una buena práctica

		// if, else, if else

		// determinar si mi usuario es un bebé, niño/a, adolescente, adulta

		if (edad >= 18) {
			if (edad < 70) {
				System.out.println("Eres un adulto");
			} else {
				System.out.println("Eres un adulto mayor");
			}
		} else if (edad >= 12) {
			System.out.println("Eres un adolescente");
		} else if (edad >= 6) {
			System.out.println("Eres un niñx");
		} else {
			System.out.println("Eres un bebé");
		}

		// Switch
		// Ingrese el usuarix un numero del 1 al 7 y retorne el día de la semana
		System.out.println("Dame un número del 1 al 7 ");
		int dia = scanner.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Es lunes");
			break;
		case 2:
			System.out.println("Es martes");
			break;
		case 3:
			System.out.println("Es miércoles");
			break;
		case 4:
			System.out.println("Es jueves");
			break;
		case 5:
			System.out.println("Es viernes");
			break;
		case 6:
			System.out.println("Es sábado");
			break;
		case 7:
			System.out.println("Es domingo");
			break;
		default:
			System.out.println("No es un numero válido");
			break;
		}
		
		
		//OPERADOR TERNARIO
		int hora = 16;
		String operadorTernario = (hora > 19) ? "Es de día " : "Es de noche";
		System.out.println(operadorTernario);

	}

}
