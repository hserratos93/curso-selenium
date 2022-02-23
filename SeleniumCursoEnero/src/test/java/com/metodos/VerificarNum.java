package com.metodos;

import javax.swing.JOptionPane;

public class VerificarNum {
	
	
	
	int num1;
	int num2;
	int num3;
	
	
	
	public void ingresarNum () {
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer nùmero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo nùmero"));
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tercer nùmero"));
		
	}
	
	
	public void imprimirVerificadorNumeros () {
		
		if (num1<0 || num2 <0 || num3 <0) {
			
			System.out.println("Hay uno o màs valores no vàlidos");
			
		}else if (num1==num2 && num2==num3 && num1==num3){
			
			System.out.println("todos los nùmoeros son iguales");
			
		}else if (num1!=num2 && num2!=num3 && num1!=num3){
			
			System.out.println("Todos los nùmeros son diferentes");	
			
		}else
		{
			System.out.println("Ni todos son iguales, ni todos diferentes");
		}
		
		
	}

}
