package com.jurandir.cursojava.aula13.Labs;

import java.util.Scanner;

public class exerc10 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celsius:");
		double c = scan.nextDouble();
		
		double f =  (c * 1.8) + 32;
		
		System.out.println("A temperatura " + c + " C e igual a " + f + "F");
		

	}

}
