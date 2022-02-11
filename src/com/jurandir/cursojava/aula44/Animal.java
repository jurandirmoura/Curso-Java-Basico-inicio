package com.jurandir.cursojava.aula44;

public abstract class Animal {
	
	private String nome;
	
	public abstract void emitirSom();

	public String getNomeString() {
		return nome;
	}

	public void setNomeString(String nome) {
		this.nome = nome;
	}
	
	

}
