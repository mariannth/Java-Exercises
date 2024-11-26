package org.generation.loopsYCollections;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("Introduce un numero no negativo para calcular Fibonacci:");
			n = scanner.nextInt();
			if(n < 0) {
				System.out.println("Numero no válido, introduce uno no negativo");
			}
		}while(n < 0);
		
		// Secuencia de Fibonacci hasta n
        System.out.println("Secuencia de Fibonacci hasta n:");
        fibonacciSequence(n);
		

		scanner.close();

	}

	public static void fibonacciSequence(int n) {
        int a1 = 0; // Primer número de la secuencia
        int a2 = 1; // Segundo número de la secuencia

        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                System.out.println("0: " + a1); // Imprime el primer número
            } else if (i == 1) {
                System.out.println("1: " + a2); // Imprime el segundo número
            } else {
                int actual = a1 + a2; // Suma de los dos números previos
                System.out.println(i + ": " + actual); // Imprime el índice y el número actual
                a1 = a2; // Actualizar el penúltimo número
                a2 = actual; // Actualizar el último número
            }
        }
	}
	


}
