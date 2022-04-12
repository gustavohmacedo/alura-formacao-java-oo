package java_jre_jdk;

import java.util.Scanner;

public class ExercicioLacoAninhados {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter row and column size:");
		int rowSize = scanner.nextInt();
		

		for (int row = 1; row <= rowSize; row++) {

			for (int column = 1; column <= row; column++) {

				System.out.print(column);

			}
			System.out.println();

		}

		scanner.close();
	}

}
