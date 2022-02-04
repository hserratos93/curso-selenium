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
			
		}else {
			
			System.out.println(entero1 +" "+texto1);
		}
		
		if (entero1 % 2 == 0){
			
			System.out.println(entero1+" es par");
			
		}else {
			System.out.println(entero1+" es impar");
			
			
		}
	}
	}
