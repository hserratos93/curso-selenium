package com.java;

import java.util.Scanner;

import org.apache.xmlbeans.impl.xb.xsdschema.LengthDocument;

public class Arrays {

	public static void main(String[] args) {
		// ARRAYS (ARREGLOS)
		
		// Arreglo Unidimensional
		
		Scanner semana = new Scanner (System.in);
//							0		1			2			3			4		5			6
		String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo", "Algo"};
		String[] dias2 = new String[7];
		dias2[0]= "Lunes";
		dias2[1]="Martes";
		dias2[2]=null;
		
		
		int[] numero = {1,2,3,5,7,100};
		boolean[] algo = {true, true, false, true};
		
		System.out.println("El dia de hoy es: "+dias2[3]);
		
		int length = dias.length;
		
		for(int i =0; i<length; i++) {
			System.out.println(dias[i]);
		}
		
		// Arreglo Bidimensional
		String[][] nombres = new String[2][2];
		nombres[0][0] = "Ricardo";
		nombres[0][1] = "Adonai";
		nombres[1][0]= "Alejandro";
		nombres[1][1] = "Juan";
		
		
		// ARREGLO MULTIDIMENSIONAL
//		String[][][][] datos = new String[2][2][2][2];
//		datos[0][0][0][0] = "Hello";
//		datos[0][0][0][1] = "Hello2";
//		datos[0][0][1][0] = "Hello3";
		
		System.out.println("El nombre de la persona es: "+ nombres[0][0]);
		
		// ACTIVIDAD
		
//		IMPRIMIR EL ARREGLO BIDIMENSIONAL UTILIZANDO UN LOOP
		
		for (int x=0; x<nombres.length; x++){
			for (int z=0; z<nombres.length; z++) {
		
//		for (int x=0; x<2; x++){
//			for (int z=0; z<2; z++) {
				
				
				System.out.println(nombres[x][z]);
				
			}
		}
		
		//Las llaves son filas, el contenido son columnas.
		String juegos [][] = {{"FIFA","COD"},{"PES","BATTLEFIELD"}};
		
//		for (int j=0; j<2; j++) { //numero de filas
//		    for (int y=0; y<2; y++) { //numero de columnas
		
		     length = juegos.length;
		    
		for (int j=0; j<length; j++){
			for (int y=0; y<length; y++){
		

		System.out.print(juegos[j][y]);
		}
			System.out.println("");
		}
//		
		
	}
	
}

