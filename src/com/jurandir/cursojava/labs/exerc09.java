package com.jurandir.cursojava.labs;

import java.util.Scanner;

public class exerc09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Farenheit:");
		double f = scan.nextDouble();
		
		double c = (5 * (f-32) /9);
		
		System.out.println("A temperatura " + f + " F e igual a" + c + "C");
		
		
	}

}
