package com.jurandir.cursojava.aula26;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro ?: " + capCombustivel * consumoCombustivel + " km");
	}
	
	double obterAutonomia() {
		System.out.println("M?todo obterAutonomia foi chamado.");
		
		
		return capCombustivel * consumoCombustivel;
	}

}
