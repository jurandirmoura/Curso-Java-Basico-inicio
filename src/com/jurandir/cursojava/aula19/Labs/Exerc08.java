package com.jurandir.cursojava.aula19.Labs;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		
		  Scanner scan = new Scanner(System.in);
		  
		  int[] vetorA = new int[10];
		  int[] vetorB = new int[vetorA.length];
		  int[] vetorC = new int[vetorA.length];
		  
		  
		  for (int i=0; i<vetorA.length; i++) {
			  System.out.println("Entre com o valor do vetorA da posição: ");
			  vetorA[i] = scan.nextInt();
		  }
		  
		  for (int i=0; i<vetorB.length; i++) {
			  System.out.println("Entre com o valor do vetorB da posição: ");
			  vetorB[i] = scan.nextInt();
		  }
		  
		  for (int i=0; i<vetorC.length; i++) {
			  vetorC[i] = vetorA[i] * vetorB[i];
		  }
		  
		  System.out.print("Vetor A = ");
		  for (int i=0; i<vetorA.length; i++) {
			  System.out.print(vetorA[i] + " ");
		  }
		  System.out.println();
		  
		  System.out.print("Vetor B = ");
		  for (int i=0; i<vetorB.length; i++) {
			  System.out.print(vetorB[i] + " ");
		  }
		  System.out.println();
		  
		  System.out.print("Vetor C = ");
		  for (int i=0; i<vetorC.length; i++) {
			  System.out.print(vetorC[i] + " ");
		  }
		  System.out.println();
		  
		  scan.close();

	}

}
