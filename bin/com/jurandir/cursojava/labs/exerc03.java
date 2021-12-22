package com.jurandir.cursojava.labs;

import java.util.Scanner;

public class exerc03 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("digite um Numero: ");
		int numero1 = scan.nextInt();
		System.out.println("digite outro Numero: ");
		int numero2 = scan.nextInt();
		int soma = numero1 + numero2;
		
		System.out.println("A soma dos numeros digitados é: " + soma);
		
		
		
	}

}
