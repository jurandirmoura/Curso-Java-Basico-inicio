package com.jurandir.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um dia da semana (1-7):");
		int diaSemana = sc.nextInt();
		
		
		switch(diaSemana){
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda"); 
			break;
		case 3: 
			System.out.println("Ter�a");
			break;
		case 4: 
			System.out.println("Quarta"); 
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6: 
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("S�bado"); 
			break;
		default: System.out.println("N�o � uma dia da semana v�lido");
		}
	}

}
