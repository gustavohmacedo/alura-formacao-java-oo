package br.com.alura.teste;

import br.com.alura.modelo.Conta;
import br.com.alura.modelo.ContaCorrente;
import br.com.alura.modelo.ContaPoupanca;

public class TesteArayDeString {
	public static void main(String[] args) {

		Object[] referencias = new Conta[5];

		Conta cc1 = new ContaCorrente(11, 22);
		referencias[0] = cc1;

		Conta cp1 = new ContaPoupanca(013, 23);
		referencias[1] = cp1;

//		System.out.println("Ang�ncia: " + referencias[0].getAgencia() + " N�mero: " + contas[0].getNumero());
//
//		System.out.println("Ang�ncia: " + referencias[1].getAgencia() + " N�mero: " + contas[1].getNumero());

	}

}
