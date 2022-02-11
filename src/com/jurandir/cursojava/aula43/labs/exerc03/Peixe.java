package com.jurandir.cursojava.aula43.labs.exerc03;

public class Peixe extends Animal {

	
	private String caracteristicas;

	public Peixe() {
		super();
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinza");
		this.caracteristicas = "Barbatanas e cauda";
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		return "Peixe [caracteristicas=" + caracteristicas + "]";
	}
	
}
