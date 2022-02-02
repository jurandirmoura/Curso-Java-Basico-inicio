package com.jurandir.cursojava.aula24.Labs;

public class Exerc06 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.conta = "123456";
		conta.agencia = "1234";
		conta.limiteEspecial = true;
		conta.cheqLimite = 500;
		conta.saldo = -10;
		
		System.out.println("conta = " + conta.conta);
		System.out.println("Agencia = " + conta.agencia);
		System.out.println("Saldo = " + conta.saldo);
	}

}
