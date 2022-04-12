package br.com.alura.teste;

import br.com.alura.modelo.Conta;
import br.com.alura.modelo.ContaCorrente;
import br.com.alura.modelo.SaldoInsuficienteException;

public class TesteSaca extends Object{

	public static void main(String[] args) {

		Conta conta = new ContaCorrente(123, 321);

		conta.depositar(200.00);

		try {
			conta.sacar(200.50);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Exception " + ex.getMessage());
			// ex.printStackTrace();
		}

		System.out.println("Saldo disponível R$ " + conta.getSaldo());
	}

}
