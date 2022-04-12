package br.com.alura.modelo;

import java.io.Serializable;

public abstract class Conta implements Comparable<Conta>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalContasCriadas = 0;

	public Conta(int agencia, int numero) {

		if (agencia <= 0) {
			System.out.println("Agência não pode ter valor menor ou igual a zero.");
		} else {
			this.agencia = agencia;
		}

		if (numero <= 0) {
			System.out.println("Número não pode ter valor menor ou igual a zero.");
		} else {
			this.numero = numero;
		}

		this.saldo = 0.0;
		Conta.totalContasCriadas++;

	}

	public abstract void depositar(double valor);

	public void sacar(double valor) throws SaldoInsuficienteException {

		this.verificaLimiteDisponivel(valor);
		this.saldo -= valor;
		System.out.println("Saque de R$" + valor + " realizado com sucesso!");
	}

	public void transferir(Conta contaDestno, double valor) throws SaldoInsuficienteException {

		this.verificaLimiteDisponivel(valor);
		this.saldo -= valor;
		contaDestno.saldo += valor;
		System.out.println("Transferência de R$" + valor + " realizada com sucesso!");

	}

	public double verificaLimiteDisponivel(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo R$ " + this.saldo + " | " + "Valor R$ " + valor);
		}
		return valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotalContasCriadas() {
		return totalContasCriadas;
	}

	@Override
	public int compareTo(Conta outraConta) {

		return Double.compare(this.saldo, outraConta.saldo);
	}

	@Override
	public String toString() {
		return "Saldo: " + this.saldo + ", Agencia: " + this.agencia + ", Número: " + this.numero + ", " + "titular: "
				+ this.titular;
	}

}