package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        String  continuar = "S";
        int  num_reg = 0;
        
        while(continuar.equals("S") || continuar.equals("s")) {
			num_reg++;
			
			System.out.println("*******************");
			System.out.println("****R E G I S T R O [" + num_reg + "]***************");
			System.out.println("*******************");
        

        System.out.print("Ingrese nombre: ");
        String name = sc.nextLine();

        System.out.print("Ingrese nota 1: ");
        float nota1 = sc.nextFloat();

        System.out.print("Ingrese nota 2: ");
        float nota2 = sc.nextFloat();

        System.out.print("Ingrese nota 3: ");
        float nota3 = sc.nextFloat();

        System.out.print("Ingrese asistencia [1-12]: ");
        

        int asis = sc.nextInt();

        float promedio = nota1 * 0.2f + nota2 * 0.3f + nota3 * 0.5f;
        float por_asis = (asis/12f)* 100f;

        String estado = "Sin certificado";

        if ( promedio >= 13 && por_asis>= 70)
            estado = "Obtiene certificado";
        
        

        System.out.println("\n-------------");
        System.out.println("Resultados");
        System.out.println("\n-------------");
        System.out.println("Alumno  : "+name );
        System.out.println("Promedio  : "+df.format(promedio));
        System.out.println("Asistencia  : "+df.format(por_asis) + "%");
        System.out.println("Estado  : "+ estado );
        
        sc.nextLine();
		
		System.out.print("¿Desea continuar con otro participante <S/N>?: ");
		continuar = sc.nextLine();
		
        }
        
	}

}
