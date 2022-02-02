package com.jurandir.cursojava.aula24.Labs;

public class Exerc05 {

	public static void main(String[] args) {
		
		Contato contato1 = new Contato();
		contato1.nome = "Joao Gomes";
		contato1.endereco = "Av Rego Maranhao - PA, N 100";
		contato1.email = "Joao@email.com";
		
		contato1.telefones = new String[5];
		contato1.telefones[0] = "9999-999";
		contato1.telefones[1] = "9999-998";
		
		System.out.println("Nome = " + contato1.nome );
		System.out.println("Telefone = " + contato1.telefones[0]);
	}

}
