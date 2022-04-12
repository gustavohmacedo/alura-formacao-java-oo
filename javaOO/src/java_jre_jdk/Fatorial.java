package java_jre_jdk;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o Número Fatorial que deseja calcular:");
		int fatorial = scanner.nextInt();

		int calculaFatorial = fatorial;

		for (int contador = 1; contador < fatorial; contador++) {

			calculaFatorial *= (fatorial - contador);

		}
		System.out.printf("%d! = %d ", fatorial, calculaFatorial);

		scanner.close();
	}
}
