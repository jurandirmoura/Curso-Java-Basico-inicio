package com.jurandir.cursojava.aula17.Labs;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			
			System.out.println("Entre com uma nota");
			
			double nota = scan.nextDouble();
			
			if (nota >=0 && nota <=10) {
			notaValida = true;
			System.out.println("Voce digitou: " + nota);
			} else {
			notaValida = false;
			System.out.println("Nota invalida, digite novamente");
			}
			
			
		}  while (!notaValida);
	}
	
}	
