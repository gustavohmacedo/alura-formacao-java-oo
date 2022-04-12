package java_oo;

public class Conta {

	public double saldo;
	public int agencia;
	public int numero;
	public String titular;

	public void depositar(double valor) {

		this.saldo += valor;
		System.out.println("Dep�sito de R$ " + valor + " realizado com sucesso!");
	}

	public void sacar(double valor) {

		if (this.verificarLimiteDisponivel(valor)) {
			this.saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado com sucesso!");

		} else {
			System.out.println("Saldo insuficiente para esta opera��o.");
		}
	}

	public void transferir(Conta contaDestno, double valor) {

		if (this.verificarLimiteDisponivel(valor)) {
			this.sacar(valor);
			contaDestno.depositar(valor);
			System.out.println("Transfer�ncia de R$" + valor + " realizado com sucesso!");

		} else {
			System.out.println("Saldo insuficiente para esta opera��o.");
		}

	}

	public boolean verificarLimiteDisponivel(double valor) {

		if (this.saldo >= valor) {
			return true;
		}
		return false;

	}
}