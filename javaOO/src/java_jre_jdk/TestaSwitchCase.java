package java_jre_jdk;
import java.util.Scanner;

public class TestaSwitchCase {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a month of the year: ");
		int mes = scanner.nextInt();

		switch (mes) {

		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
		case 8:
			System.out.println("Agust");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;

		default:
			System.out.println("Invalid Month");

		}

		scanner.close();
	}

}
