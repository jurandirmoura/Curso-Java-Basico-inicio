package com.jurandir.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro preço");
		double preco1 = sc.nextDouble();
		
		System.out.println("Entre com o Segundo preço");
		double preco2 = sc.nextDouble();
		
		
		System.out.println("Entre com o Terceiro preço");
		double preco3 = sc.nextDouble();
		
		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("Compre o produto 1");
			
		} else if (preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("Compre o produto 2");
			
		}  else if (preco3 <= preco1 && preco3 <= preco2) {
			System.out.println("Compre o produto 3");
			
		}
	}

}
