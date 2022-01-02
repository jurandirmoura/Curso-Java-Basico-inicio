package com.jurandir.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o ano");
		int ano = sc.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("E bissexto");
		} else {
			System.out.println("Nao e bissexto");
		}

	}

}
