package com.jurandir.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o lado 1:");
		int lado1 = sc.nextInt();
		
		System.out.println("Entre com o lado 2:");
		int lado2 = sc.nextInt();
		
		System.out.println("Entre com o lado 3:");
		int lado3 = sc.nextInt();
		
		if (((lado1 + lado2) > lado3) ||
				((lado1 + lado3) > lado2) ||
				((lado2 + lado3) > lado1)) {
			
			
			if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Triangulo Equilatero");
			} else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
			System.out.println("Triangulo Escaleno");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Triangulo Isosceles");
			} 
		
		} else {
			System.out.println("Nao forma um triangulo");
		}
		
		
	}

}
