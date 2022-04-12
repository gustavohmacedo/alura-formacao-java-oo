package br.com.alura.teste;

import br.com.alura.modelo.CalculadorDeImposto;
import br.com.alura.modelo.ContaCorrente;
import br.com.alura.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.depositar(100.00);

		SeguroDeVida seguro = new SeguroDeVida();

		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(seguro);
		calc.registra(cc);

		System.out.println(calc.getTotalImposto());

	}

}
