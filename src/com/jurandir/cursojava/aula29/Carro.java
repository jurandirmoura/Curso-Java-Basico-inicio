package com.jurandir.cursojava.aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	public Carro() {
		System.out.println("Classe Carro foi instanciada");
		numPassageiros = 4;
	}

	public Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_,
			double consumoCombustivel_) {
		super();
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " km");
	}

	double obterAutonomia() {

		System.out.println("M�todo obterAutonomia foi chamado.");

		return capCombustivel * consumoCombustivel;
	}

	double calcularCombustivel(double km) {

		double qtdCombustivel = km / consumoCombustivel;

		return qtdCombustivel;
	}

}
