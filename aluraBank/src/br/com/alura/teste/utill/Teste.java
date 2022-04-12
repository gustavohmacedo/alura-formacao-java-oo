package br.com.alura.teste.utill;

import java.util.ArrayList;

import br.com.alura.modelo.Conta;
import br.com.alura.modelo.ContaCorrente;
import br.com.alura.modelo.ContaPoupanca;

public class Teste {
	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<>();

		Conta cc = new ContaCorrente(012, 19);
		lista.add(cc);

		Conta cp = new ContaPoupanca(013, 20);
		lista.add(cp);

		System.out.println("Tamanho do ArrayList: " + lista.size());

		for (Conta obj : lista) {
			System.out.println(obj);
		}
		
		System.out.println("------------------------------");
		ArrayList<Conta> novaLista = new ArrayList<>(lista);
		
		for(Conta conta: novaLista)	System.out.println(conta);

	}

}
