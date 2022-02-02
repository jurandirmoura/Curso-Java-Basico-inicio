package com.jurandir.cursojava.aula24.Labs;

import java.util.Date;

public class Exerc04 {

	public static void main(String[] args) {
		
LivroDeBiblioteca livroDeBiblioteca = new LivroDeBiblioteca();
		
		livroDeBiblioteca.nome = "Mastering ExtJS";
		livroDeBiblioteca.autor = "Loiane Groner";
		livroDeBiblioteca.anoLancamento = 2015;
		
		livroDeBiblioteca.emprestado = true;
		livroDeBiblioteca.dataEntrega = new Date();
		livroDeBiblioteca.emprestadoA = "Loiane";
		
		System.out.println("Nome do livro = " + livroDeBiblioteca.nome);
		

	}

}
