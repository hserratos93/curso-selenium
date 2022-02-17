package com.metodos;

import javax.swing.JOptionPane;

import org.apache.poi.util.SystemOutLogger;

public class barkingDog {

		
		//Atributos
		boolean barking;
		int hourOfDay;

	
	//Mètodos
	
	//Mètodo para ingresar valores
	
	public void ingresarDatos() {
		
		barking= Boolean.parseBoolean(JOptionPane.showInputDialog("El perro està ladrando?"));
		hourOfDay = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la hora del dìa"));
		
	}
	
	
	public void shouldWakeUp () {
		if (hourOfDay >=0 && hourOfDay <=23) 
			
		
			if (barking=true && (hourOfDay<8 || hourOfDay>=22))
{
                barking=true;
                System.out.println("Despierta, el perro està ladrando");
                
               // if (hourOfDay<0 && hourOfDay>23)
//                {
//                	barking=false;
//                	System.out.println(barking);
                	      
                          
		}else
			barking=false;
		    System.out.println(barking);
		
}	
		
		
	}

