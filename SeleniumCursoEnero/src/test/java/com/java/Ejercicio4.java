package com.java;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//instanciar la clase scanner
		
		Scanner validar = new Scanner (System.in);
		
		int entero1, entero2;	
		String texto = "Es mayor que";
		String texto1 = "Es Mayor que";
		String texto2 = "Es igual a";
		
		System.out.println("Ingresar el primer nùmero:"+ " ");
		entero1 = validar.nextInt();
		
		
		System.out.println("Ingresa el segundo nùmero:"+ " ");
		entero2 =validar.nextInt();
		
		if (entero1>entero2) {
		
			System.out.println(entero1 +" "+texto+" "+ entero2);
			
		}else if (entero1<entero2){
			
			System.out.println(entero2 +" "+texto1+" "+ entero1);
		
		}else {
		      System.out.println(entero2 +" "+texto2+" "+ entero1);
		      //System.out.println("Los nùmeros son iguales");
		}
		
			
			
		//determinar que nùmero es mayor
		
		int oper1 = 5;
		int oper2 = 7;
		String texto5 = "Mayor que";	
		String texto6 = "Mayor que";
		String texto7 = "Igual que ";
		
		if(oper1>oper2){
			System.out.println(oper1+" "+texto5+" "+oper2);
		}else if (oper1<oper2){
			System.out.println(oper2+" "+texto6+" "+oper1);
			
		}else {
			System.out.println(oper2+" "+texto7+" "+oper1);
		}
		
		
		// IF ELSE IF
		
		int x = 6;
		int y = 6;
		
		if(x>y) {
			System.out.println("X es mayor que Y");
		}else if(x==y) {
			System.out.println("Los numeros son iguales");
		}else {
			System.out.println("y es mayor a x");
		}


		
		
		}

}
