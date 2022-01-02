package com.jurandir.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o Primeiro numero");
		int num1 = sc.nextInt();
		
		System.out.println("Entre com o Segundo numero");
		int num2 = sc.nextInt();
		
		
		if (num1 > num2) {
			System.out.println("O num1 é Maior" + num1);
		} else {
			System.out.println("O num2 é Maior" + num2);
			
		}

	}

}
