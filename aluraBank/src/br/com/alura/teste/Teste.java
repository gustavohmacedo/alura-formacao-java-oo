package br.com.alura.teste;

import br.com.alura.modelo.Conta;
import br.com.alura.modelo.ContaCorrente;
import br.com.alura.modelo.ContaPoupanca;
import br.com.alura.modelo.GuardadorDeReferencias;

public class Teste {
	public static void main(String[] args) {

		Conta cc = new ContaCorrente(012, 19);

		Conta cp = new ContaPoupanca(013, 20);

		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		guardador.adiciona(cc);
		guardador.adiciona(cp);

		System.out.println("Número da CC:" + guardador.buscarNumeroDaContaPorPosicao(0));
		System.out.println("Número da CP:" + guardador.buscarNumeroDaContaPorPosicao(1));

		System.out.println("Total de Contas adicionadas: " + guardador.totalContasAdicionadas());

	}

}
