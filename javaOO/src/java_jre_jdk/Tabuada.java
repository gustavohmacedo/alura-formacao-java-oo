package java_jre_jdk;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe qual tabuada deseja realizar: ");
		int numeroTabuada = scanner.nextInt();

		for (int contador = 1; contador <= 10; contador++) {

			int resultado = numeroTabuada * contador;

			System.out.printf("%d x %d = %d", numeroTabuada, contador, resultado);
			System.out.println();
		}

		scanner.close();
	}

}
