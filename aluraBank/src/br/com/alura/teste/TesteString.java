package br.com.alura.teste;

public class TesteString {
	public static void main(String[] args) {

		String nome = "AlUrA"; // Objeto imut�vel
		System.out.println("Original: " + nome);

		String outra1 = nome.replace('A', 'a');
		System.out.println("A mai�sculo para min�sculo: " + outra1);

		String outra2 = nome.toLowerCase();
		System.out.println("Todas min�sculas: " + outra2);

		String outra3 = nome.toUpperCase();
		System.out.println("Todas mai�sculas: " + outra3);

		char char1 = nome.charAt(2);
		System.out.println("�ndice na posi��o 2 guarda o seguinte caractere: " + char1);

		int pos1 = nome.indexOf("U");
		System.out.println("caractere [ U ] est� na posi��o: " + pos1);

		System.out.println("Tamanho do Array de String: " + nome.length());
		for (int cont = 0; cont <= nome.length(); cont++) {

			System.out.println(nome.charAt(cont));
		}

		String vazio = "      Caelum";
		String outroVazio = vazio.trim();
		System.out.println(vazio);
		System.out.println(outroVazio);

	}

}
