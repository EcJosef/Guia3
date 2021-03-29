package com.senati.eti;

import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre........: ");
		String nombre = sc.nextLine();
		
		// Si quiero que se repitas de dos en dos es igual a : x+=2
		for(int x = 1; x <=10; x++)
			System.out.println(x + ". Bienvenido(a) al curso " +  nombre  + ". ");
		
		System.out.println("--------------------------------\n");
		// for decendente de 2 en 2
		for(int j = 14; j >= 1; j-= 2)
			System.out.println(j);
			

	}

}
