package br.com.alura.teste;
import br.com.alura.modelo.Cliente;
import br.com.alura.modelo.ContaCorrente;
import br.com.alura.modelo.ContaPoupanca;
import br.com.alura.modelo.SaldoInsuficienteException;

public class TestaContas {

	public static void main(String[] args) throws SaldoInsuficienteException{
		Cliente cliente1 = new Cliente("Guga", "022.123.333-09", "Developer");
		Cliente cliente2 = new Cliente("Peter", "000.666.777-10", "Engeneer");

		ContaCorrente cc = new ContaCorrente(1234, 021564);
		cc.setTitular(cliente1);
		cc.depositar(100.00);
		cc.sacar(5.00);
		System.out.println(cc);

		ContaPoupanca cp = new ContaPoupanca(0222, 55556666);
		cp.setTitular(cliente2);
		cp.depositar(50.00);
		System.out.println(cp);

		cc.transferir(cp, 90.00);
		
		System.out.println(cc);
		System.out.println(cp);
		
		
		

	}
}
