package java_jre_jdk;

public class TestaCondicional {
	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 18;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;

		System.out.println("Valor de acompanhado: " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Bem vindo!");

		} else {
			System.out.println("Infelizmente, voc? n?o pode entrar.");
		}
	}

}
