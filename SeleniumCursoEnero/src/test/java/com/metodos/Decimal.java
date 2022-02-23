package com.metodos;

public class Decimal {


	
	public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {
	
		num1 =num1*1000;
		num2 = num2*1000;
		
		num1 = (int) num1;
		num2 = (int) num2;
		
		if (num1==num2) {
			return true;
			
		}else {
			return false;
		}
	
		
	}
	
	public static void printHello() {
		System.out.println("HelloWolrd");
	}
	
	
	public static int multiplicacion(int x, int y) {
		return x*y;
		
	}
	
}
