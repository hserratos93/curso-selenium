package com.java;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class Condicionales {

	public static void main(String[] args) {
	
	// CONDIOCIONALES
		
		// Automovil conduciento a exceso de velocidad
		int limiteVelocidad = 110; //KM*H
		int velocidadActual = 100; // KM*H
		int i = 0;
		boolean carretera = true; 
		
		// IF
//		if(velocidadActual>limiteVelocidad) {
//			System.out.println("MULTA!!!");
//		}
		
		// IF ELSE
//		if(velocidadActual>limiteVelocidad) {
//			System.out.println("MULTA!!!"); // TRUE
//		}else {
//			System.out.println("DESCUENTO"); // FALSE
//		}
		
		// IF ANIDADO
		
//		if (i==0) {
//			System.out.println("Esto vale i" +i);
//		}
//		if (i==1) {
//			System.out.println("esto vale i" +i);
//		}
//		if (i==3) {
//			System.out.println("esto vale i" +i);
//		}
			
		
		// IF ANIDADO CON BOOLEAN
		
//		if(carretera) {
//			
//			// dando nuevo valor a la variable
//			limiteVelocidad=100;
//			
//			if(velocidadActual>limiteVelocidad) {
//				System.out.println("MULTA!!!"); // TRUE
//			}else {
//				System.out.println("DESCUENTO"); // FALSE
//			}
//			
//		}
		
		
		// IF ELSE IF		
		if(carretera==false) {
			
			// dando nuevo valor a la variable
			limiteVelocidad=90;
			
			if(velocidadActual>limiteVelocidad) {
				System.out.println("MULTA!!! - Vas en Carretera"); // TRUE
			}else {
				System.out.println("DESCUENTO - Vas en Carretera"); // FALSE
			}
			
		} else if(velocidadActual>limiteVelocidad) {
			System.out.println("MULTA!!! - Vas en calle"); // TRUE
		}else {
			System.out.println("DESCUENTO - Vas en calle"); // FALSE
		}
		
		
		// SWITCH CASE
		 Scanner validar = new Scanner (System.in);
		 int temperatura; // grados C
		
		 
		 System.out.println("Ingresa la temperatura ");
		 temperatura =validar.nextInt();
		  
		 switch(temperatura) {
		 case 2:
		 case 3:
		 case 4:
			 // Block code
			 System.out.println("Temperatura Monterrey, Nuevo Leon, Mexico");
			 System.out.println("Temperatura USA");
			 break;
			 
		 case 19:
			 System.out.println("Temperatura Argentina");
			 break;
			 
		 case 12:
			 System.out.println("Temperatura Ecuador");
			 break;
			 
		 case 17:
			 System.out.println("Temperatura Colombia");
			 break;
			 
			 default:
				 System.out.println("Temperatura Otro lugar");
				 break;
		 }

	}




	}

