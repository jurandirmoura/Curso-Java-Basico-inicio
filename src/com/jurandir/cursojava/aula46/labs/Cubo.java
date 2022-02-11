package com.jurandir.cursojava.aula46.labs;

public class Cubo extends Figura3D {
	
	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularVolume() {
		return lado * lado * lado;
		//return Math.pow(lado, 3);
	}

	
}
