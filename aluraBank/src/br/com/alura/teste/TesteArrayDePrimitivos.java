package br.com.alura.teste;

import java.util.Scanner;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o tamanho Array:");
		int tamanhoArray = scanner.nextInt();

		int[] idades = new int[tamanhoArray];

		for (int i = 0; i < idades.length; i++) {

			idades[i] = i * i;

		}

		System.out.println("[ Resultado ]");

		for (int i = 0; i < idades.length; i++) {

			System.out.println(idades[i]);

		}

		scanner.close();

	}

}
