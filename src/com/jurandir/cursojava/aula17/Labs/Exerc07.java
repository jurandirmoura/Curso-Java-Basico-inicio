package com.jurandir.cursojava.aula17.Labs;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int maior = Integer.MIN_VALUE ;
		
		for (int i=0; i<5; i++) {
			System.out.println("Entre com um numero");
			num = scan.nextInt();
			
			if (num > maior) {
				maior = num;
				System.out.println("O numero maior mudou: " + maior);
			}
		}
		
		System.out.println("O maior numero digitado foi: " + maior);
		

	}

}
