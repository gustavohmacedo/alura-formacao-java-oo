package java_oo;

public class TesteReferencia {
	public static void main(String[] args) {

		Conta conta1 = new Conta();
		conta1.saldo = 300.0;

		Conta conta2 = conta1;

		System.out.println("valor da conta1: " + conta1.saldo);
		System.out.println("valor de conta 2: " + conta2.saldo);

		conta2.saldo += 100.0;
		System.out.println("Valor alterado da conta 2: " + conta2.saldo);

		System.out.println("Valor alterado da conta 1: " + conta1.saldo);
	}

}
