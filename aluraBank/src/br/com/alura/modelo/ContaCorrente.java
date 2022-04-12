package br.com.alura.modelo;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Tributavel,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		final double TAXA_SAQUE = 0.5;
		double valorSaque = valor + TAXA_SAQUE;
		super.sacar(valorSaque);
		System.out.println("Obs. Foi cobrada uma Taxa de R$ 0.50 centavos pelo saque realizado.");
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
		System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");

	}

	@Override
	public double getValorImposto() {

		return super.saldo * 0.01;
	}

	@Override
	public String toString() {

		return "Conta corrente: " + super.toString();
	}

}
