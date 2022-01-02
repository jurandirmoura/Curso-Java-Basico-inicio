package com.jurandir.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um numero");
		int num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("O numero informado e positivo");
		} else {
			System.out.println("O numero informado e negativo");
		}

	}

}
