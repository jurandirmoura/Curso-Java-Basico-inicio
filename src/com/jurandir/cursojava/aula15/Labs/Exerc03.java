package com.jurandir.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com uma letra (F ou M):");
		String input = sc.next();
		
		if (input.equalsIgnoreCase("f")) {
			System.out.println("F - feminino");
			
		} else if (input.equalsIgnoreCase("m")) {
			System.out.println("M - masculino");
		} else {
			System.out.println("Sexo invalido");
		}
	
		
	}

}
