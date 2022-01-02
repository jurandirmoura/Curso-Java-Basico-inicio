package com.jurandir.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exerc12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com o valor hora:");
		double valorHora = sc.nextDouble();
		
		System.out.println("Entre com as horas trabalhadas no m�s:");
		double qtdHora = sc.nextDouble();
		
		double salarioBruto = valorHora * qtdHora;
		
		int percentualIR = 0;
		if (salarioBruto <= 900) {
			percentualIR = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		}  else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
		}  else if (salarioBruto > 2500) {
			percentualIR = 20;
		}
		
		double ir = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salario bruto: (" + valorHora + " * " + qtdHora + "): " + salarioBruto);
		System.out.println("(-) IR (" + percentualIR + "%): " + ir);
		System.out.println("(-) INSS ( 10%): " + inss);
		System.out.println("FGTS (11%): " + fgts);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Salario Liquido: " + salarioLiquido);
	}
}