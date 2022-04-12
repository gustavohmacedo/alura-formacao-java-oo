package br.com.alura.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
		System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
	}
	@Override
	public String toString() {
		
		return "Conta poupança: "+ super.toString();
	}

}
