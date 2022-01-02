package com.jurandir.cursojava.aula13.Labs;

import java.util.Scanner;

public class exerc04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira Nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a Segunda Nota: ");
		double nota2 = scan.nextDouble();
		System.out.println("Digite a Terceira Nota: ");
		double nota3 = scan.nextDouble();
		System.out.println("Digite a Quarta Nota: ");
		double nota4 = scan.nextDouble();
		double media = (nota1 + nota2 + nota3 + nota4) /4;
		System.out.println("A sua media Final e: " + media);
		
		if (media >= 6) 
			System.out.println ("Aluno aprovado!!");
		
		else 
			System.out.println("Aluno Reprovado!!");
				
		

	}

}
