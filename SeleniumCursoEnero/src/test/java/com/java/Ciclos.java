package com.java;

import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {
		// Ciclo, estructura de control que estarà ciclandose hasta que encuentre una salida

		
			// WHILE
			
			// Contador de un rango de numeros
			
			int minNumero = 15;
			int maxNumero = 20;
			
			while(minNumero <=maxNumero) {
				System.out.println("El numero es: "+minNumero);
				minNumero++;
			}
			
			//while con entrada
			Scanner entrada = new Scanner(System.in);
			
			int inicio, contador;
			
			
			System.out.println("Ingresa en què nùmero empieza el contador:" );
			inicio = entrada.nextInt();
			
		
			System.out.println("Ingresa el lìmite de nùneros a mostrar: ");
			contador =entrada.nextInt();
			
			
		while (inicio<=contador){
			System.out.println(inicio);
			inicio++;
			//inciio+=2, inicio+=3, inicio+=4, inicio+=n... Esto sirve para indicar en cuanto incrementa cada numero
		}
		if (contador<inicio) 
		{
			//System.out.println(+contador + " "+ "no puede ser menor que " +inicio);
			System.out.println("El contador no puede ser menor que el inicio");
		}
			
			// DO WHILE
			
			// ¿Cuantas veces se tiene que sumar un mismo para llegar a 100?
			int numero = 10;
			int sumTotal = 0;
			int contadorSuma = 0;
			
			do {
				sumTotal = sumTotal + numero;
				contadorSuma++;
				
			} while (sumTotal<100);
			System.out.println("El numero se sumo a si mismo: "+contadorSuma +" veces");
	
	
			
			// FOR
			
			// Contador de un numero limite
			
			int numeroLimite = 100;
			
			//int i - inicializador //i<=numeroLimite - Condicional //i++ - incrementador
			
			for(int i=10;i<=numeroLimite; i+=10) {
				System.out.println("El numero FOR es "+i);
				
			}

			//CONTADOR CON DO WHILE
			int contadorDo=11;
			
			do {
				System.out.println(contadorDo);
				contadorDo++;
			}while (contadorDo<=10);
			
			
			
		
           //DO WHILE CON SCANNER
          Scanner entradaDo = new Scanner(System.in);
          int i= 10;
	       
	      System.out.println("Digita un nùmero");
	       contadorDo = entradaDo.nextInt();
	       
	       do {
	    	   System.out.println(i);
	    	   i++;
	       }while (i<=contadorDo);
	}
	
	
 	
	}
