package com.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
Scanner numero = new Scanner (System.in);

//int entero1;	
String texto = "Es negativo ";
String texto1 = "Es positivo";
		
		System.out.println("Ingresa un nùmero:"+ " ");
		int entero1 = numero.nextInt();
		
		
		if (entero1<0) {
		
			System.out.println(entero1 +" "+texto);
			
		}else if (entero1==0) {
			
			System.out.println("El cero es un valor null");
		}
		else {
			
			System.out.println(entero1 +" "+texto1);
		}
		
		if (entero1 % 2 == 0){
			
			System.out.println(entero1+" es par");
			
		} 
		else
		{
			System.out.println(entero1+" es impar");
			
		
//			
//			System.out.println("Ingresa el segundo nùmero:"+ " ");
//			entero2 =validar.nextInt();
//			
//			if (entero1>entero2) {
//			
//				System.out.println(entero1 +" "+texto+" "+ entero2);
//				
//			}else if (entero1<entero2){
//				
//				System.out.println(entero2 +" "+texto1+" "+ entero1);
//			
//			}else {
//			      System.out.println(entero2 +" "+texto2+" "+ entero1);
//			      //System.out.println("Los nùmeros son iguales");
//			}
			
			
			
			
	
		}
	}
	}
