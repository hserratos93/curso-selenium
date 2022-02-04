package com.java;

import java.util.Scanner;

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
			
		}else {
			
			System.out.println(entero2 +" "+texto1+" "+ entero1);
		}
		
		if (entero1==entero2) {
			//System.out.println(entero2 +" "+texto1+" "+ entero1);
			System.out.println("Los nùmeros son iguales");
		}
//		}else {
//			//System.out.println(entero2 +" "+texto1+" "+ entero1);
//			//System.out.println("Los nùmeros son iguales");
//		}
			
			
		
		
		//determinar que nùmero es mayor
		
		int oper1 = 5;
		int oper2 = 6;
		String texto5 = "Mayor que";	
		String texto6 = "Mayor que";
		
		if(oper1>oper2){
			System.out.println(oper1+" "+texto5+" "+oper2);
		}else {
			System.out.println(oper2+" "+texto6+" "+oper1);
		}
		
		
		}

}
