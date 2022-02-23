package com.java;

import java.util.Scanner;

public class LimiteVelocidad {

	public static void main(String[] args) {
		
//		Scanner velocidad = new Scanner (System.in);
//		// Automovil conduciento a exceso de velocidad
//				int limite = 110; //KM*H
//				int velocidadActual; // KM*H
//				boolean carretera; 
//				
//		System.out.println("Vas en carretera?");	
//		carretera = velocidad.nextBoolean();
//		
//		System.out.println("Cuàl es la velocidad actual?");
//		velocidadActual = velocidad.nextInt();
//		
//          if(carretera) {
//			
//			// dando nuevo valor a la variable
//			limite=90;
//			
//			if(velocidadActual>limite) {
//				System.out.println("MULTA!!! - Vas en Carretera"); // TRUE
//			}else {
//				System.out.println("DESCUENTO - Vas en Carretera"); // TRUE
//			}
//			
//		} else if(velocidadActual>limite) {
//			System.out.println("MULTA!!! - Vas en calle"); // FALSE
//		}else {
//			System.out.println("DESCUENTO - Vas en calle"); // FALSE
		
//		}
		
		
		
		//instanciar la clase scanner
		
				Scanner validar = new Scanner (System.in);
				
				int velActual; 
				int limite=100;	
//				String texto = "Es mayor que";
//				String texto1 = "Es Mayor que";
//				String texto2 = "Es igual a";
				
				System.out.println("a què velocidad va?");
				velActual = validar.nextInt();
				
				
//				System.out.println("Ingresa el segundo nùmero:"+ " ");
//				entero2 =validar.nextInt();
			
					limite=50;
				
				if (velActual>limite) {
					
					
					System.out.println("exceso vas en escuela");
				
					
				}else if (velActual>limite){
					
					limite=80;
					
					System.out.println("Exceso vas en calle");
				
				}else if (velActual>limite) {
				
				      System.out.println("Exceso carretera");
				      //System.out.println("Los nùmeros son iguales");
				}else 
				{
					System.out.println("Vas bien escuela");
				}
				
				
		
		
		
		
	
	}
}

