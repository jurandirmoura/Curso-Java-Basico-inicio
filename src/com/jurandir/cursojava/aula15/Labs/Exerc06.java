package com.jurandir.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero");
		int num1 = sc.nextInt();
		
		System.out.println("Entre com o Segundo numero");
		int num2 = sc.nextInt();
		
		
		System.out.println("Entre com o Terceiro numero");
		int num3 = sc.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("num1 e maior: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("num2 e maior: " + num2);
		}  else if (num3 >= num1 && num3 >= num2) {
			System.out.println("num3 e maior: " + num3);
		}
		

	}

}
