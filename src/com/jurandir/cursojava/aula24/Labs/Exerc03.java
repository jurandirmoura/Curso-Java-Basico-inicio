package com.jurandir.cursojava.aula24.Labs;

public class Exerc03 {

	public static void main(String[] args) {
		
		
		LivroLivraria livro = new LivroLivraria();
		
		
		livro.nome = "Mastering EXJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		livro.preco = 63.39;
		
		
		 System.out.println("Nome do livro = " + livro.nome);
	}

}
