package com.jurandir.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um numero");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Numero par");
		} else {
			System.out.println("Numero impar");
		}
		
		
	}

}
