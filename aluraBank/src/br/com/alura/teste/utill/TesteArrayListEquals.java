package br.com.alura.teste.utill;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.modelo.Conta;
import br.com.alura.modelo.ContaCorrente;
import br.com.alura.modelo.ContaPoupanca;

public class TesteArrayListEquals {
	public static void main(String[] args) {

		// Generics
//		List<Conta> listasDeContas = new ArrayList<>();

		LinkedList<Conta> listasDeContas = new LinkedList<>();

		Conta cc1 = new ContaCorrente(012, 19);
		listasDeContas.add(cc1);

		Conta cp1 = new ContaPoupanca(013, 20);
		listasDeContas.add(cp1);

		Conta cp2 = new ContaPoupanca(013, 20);
		listasDeContas.add(cp2);

		System.out.println("Tamanho do ArrayList: " + listasDeContas.size());

		boolean existe = listasDeContas.contains(cp2);

		System.out.println("Esta conta já existe na lista? " + existe);

		for (Conta conta : listasDeContas) {
			System.out.println(conta);
		}

		List<String> argumentos = Arrays.asList(args);// transfomando array pra lista
		System.out.println("------------------------------");
		for (String arg : argumentos)
			System.out.println(arg);

		System.out.println("------------------------------");
		System.out.println("Tamanho da lista argumentos: " + argumentos.size());

	}

}
