package org.generation.loopsYCollections;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int num;
		
		System.out.println("Ingrese algún numero positivo: ");
		num = console.nextInt();
		
		System.out.println("Multiplicación de la tabla: " + num);
		
		int i = 1;
		
		while(i <=10 ) {
			System.out.println(num + "x" + i + " = " + (num * i));
			i++;
		}
		
		console.close();
	
	}

}
