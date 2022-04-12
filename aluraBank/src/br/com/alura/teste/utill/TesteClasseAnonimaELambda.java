package br.com.alura.teste.utill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.alura.modelo.Conta;
import br.com.alura.modelo.ContaCorrente;

public class TesteClasseAnonimaELambda {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		cc1.depositar(333.0);

		Conta cc2 = new ContaCorrente(22, 44);
		cc2.depositar(200.0);

		Conta cc3 = new ContaCorrente(22, 11);
		cc3.depositar(111.0);

		Conta cc4 = new ContaCorrente(22, 22);
		cc4.depositar(755.0);

		List<Conta> listaConta = new ArrayList<>();
		listaConta.add(cc1);
		listaConta.add(cc2);
		listaConta.add(cc3);
		listaConta.add(cc4);

		System.out.println("\n------------- Lista com Ordenaçao de inserção ------------\n");
		for (Conta conta : listaConta) {
			System.out.println(conta);
		}

		System.out.println("\nOrdenação Natural Comparable<>\n");

//		listaConta.sort(new Comparator<Conta>() { // Classe Anônima
//
//			@Override
//			public int compare(Conta c1, Conta c2) {
//
//				return Integer.compare(c1.getNumero(), c2.getNumero());
//
//			}
//		});
		
//		for (Conta conta : listaConta) {
//			System.out.println(conta);
//		}

		// Expressão Lambda
		listaConta.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
		listaConta.forEach(conta -> System.out.println(conta));
		
	}

}
