package com.jurandir.cursojava.aula17.Labs;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		
		int popA = 80000;
		int popB = 200000;
		int cont = 0;
		
		while (popA < popB) {
			
			popA += (popA/100) * 3;
			popB += (popB/100) * 1.5;
			cont ++;
			
		}
		
		System.out.println("Popula��o A: " + popA);
		System.out.println("Popula��o B: " + popB);
		System.out.println("Qtd anos: " + cont);


	}

}
