package java_oo;

public class TestaMetodo {
	public static void main(String[] args) {

		Conta contaGustavo = new Conta();
		contaGustavo.depositar(50.0);
		contaGustavo.sacar(120.0);
		System.out.println("Saldo atualizado: R$ " + contaGustavo.saldo);

		System.out.println("\n");

		Conta contaPeter = new Conta();
		contaPeter.depositar(225.0);
		contaPeter.sacar(200.0);
		System.out.println("Saldo atualizado: R$ " + contaPeter.saldo);
		System.out.println();

		contaPeter.transferir(contaGustavo, 4.0);

		System.out.println("Gustavo, saldo atualizado: R$ " + contaGustavo.saldo);
		System.out.println();
		System.out.println("Peter, saldo atualizado: R$ " + contaPeter.saldo);

	}

}
