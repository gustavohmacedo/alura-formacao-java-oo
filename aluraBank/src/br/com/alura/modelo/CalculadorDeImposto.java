package br.com.alura.modelo;

public class CalculadorDeImposto {

	private double totalImposto;

	public void registra(Tributavel tributo) {

		double valor = tributo.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	
	}
}
