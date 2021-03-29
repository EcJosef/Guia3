package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nmen=Double.POSITIVE_INFINITY;
		
		int n = 0, i = 1;
		
		while ( i <= 5) {
			 System.out.print("Ingrese número: "+ i + ":");
			 n = sc.nextInt();
			 
			 
			 if (n < nmen) nmen = n;
			 
			 i++;
			 
		}
		
		System.out.println("\n=========== Resultados ==========");
		System.out.println("El numero menor es: " + nmen);
	}
		

}
