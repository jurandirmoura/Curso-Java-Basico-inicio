package com.jurandir.cursojava.aula13.Labs;

import java.util.Scanner;

public class exerc08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o Valor/Hora:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com as horas trabalhadas ao mes: ");
		double horas = scan.nextDouble();
		
		double salario = valorHora * horas;
		
		System.out.println("Seu salario é: " + salario);
		

	}

}
