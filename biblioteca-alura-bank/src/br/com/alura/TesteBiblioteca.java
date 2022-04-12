package br.com.alura;

import br.com.alura.modelo.Conta;
import br.com.alura.modelo.ContaCorrente;

public class TesteBiblioteca {
	
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(1255, 1111);
		conta.depositar(200.30);
		
		System.out.println("Valor disponível R$ "+conta.getSaldo());
	}
	
	

}
