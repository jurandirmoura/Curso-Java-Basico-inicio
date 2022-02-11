package com.jurandir.cursojava.aula43.labs.exerc01;

public class ContaEspecial extends ContaBancaria {
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + "]";
	}
	
	public boolean sacar(double valor) {
		
		double saldoComLImite = this.getSaldo() + limite;
		
		if ((saldoComLImite-valor) >= 0) {
			this.setSaldo(this.getSaldo()- valor);
			
			//super.sacar(valor);
			return true;
		}
		
		return false;
	}

}
