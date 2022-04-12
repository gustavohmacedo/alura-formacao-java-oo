package java_jre_jdk;
import java.util.Scanner;

public class AliquotaComIfs {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println();

		System.out.println("Por gentileza, informe o seu salario: ");
		double salario = scanner.nextDouble();

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("A sua aliquota é de: 7,5% ");
			System.out.println("Valor máximo de desconto é: R$ 210,00");
		}

		if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("A sua aliquota é de: 15% ");
			System.out.println("Valor máximo de desconto é: R$ 562.65");
		}

		if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("A sua aliquota é de: 22,5% ");
			System.out.println("Valor máximo de desconto é até: R$ 1.049,40");
		}

		scanner.close();
	}

}
