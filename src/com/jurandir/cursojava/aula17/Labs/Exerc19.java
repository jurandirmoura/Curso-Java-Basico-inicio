package com.jurandir.cursojava.aula17.Labs;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o numero de notas:");
		int notas = scan.nextInt();
		
		double soma = 0;
		double media;
		double nota;
		
		
		for (int i=0; i<notas; i++) {
			System.out.println("Entre com a nota " + (i+1));
			nota = scan.nextDouble();
			
			soma += notas;
		}
		
		media = soma / notas;
		
		System.out.println("Soma: " + soma);
	    System.out.println("M�dia: " + media);
	}

}
