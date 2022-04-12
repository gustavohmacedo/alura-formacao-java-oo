package fluxo_entrada_arquivo;

public class TesteUnicodeEEncoding {
	public static void main(String[] args) {

		String s1 = "a";
		System.out.print(s1 + " - ");
		System.out.println("Unicode: " + s1.codePointAt(0));

	}

}
