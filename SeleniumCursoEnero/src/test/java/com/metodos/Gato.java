package com.metodos;

import java.util.Scanner;

public class Gato {

	public static void main(String[] args) {
		
		
		

	boolean jugando = isCatPlaying(false, 24);
	System.out.println(jugando);
		

	}
	
	public static boolean isCatPlaying(boolean verano, int temperatura) {
		
		
		if (verano==false  && (temperatura >=25 && temperatura<=35)) {
			return true;
			
		}else if (verano==true && (temperatura >=25 && temperatura<=45)){
		return true;	
		
		}else {
			return false;
		}
		
		
	}

}
