package fluxo_entrada_arquivo;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscrita3 {
	public static void main(String[] args) throws IOException {

		/*
		 * //Criando um Fluxo de saída de arquivo(escreve bytes num arquivo)
		 * FileOutputStream fos = new FileOutputStream("arquivoTeste2.txt"); //Converte
		 * fluxos de caracteres para fluxos de bytes OutputStreamWriter osw = new
		 * OutputStreamWriter(fos); //Grava texto em um fluxo de saída de caracteres
		 * para fornecer //a gravação eficiente de caracteres únicos, matrizes e
		 * strings. BufferedWriter bw = new BufferedWriter(osw);
		 * 
		 */

//		BufferedWriter bw = new BufferedWriter(new FileWriter("arquivoTeste2.txt"));
//		PrintStream ps = new PrintStream(new File("arquivoTeste2.txt"));

		long ini = System.currentTimeMillis();
		
		PrintWriter pw = new PrintWriter("arquivoTeste2.txt");

		pw.println("Notebook Essentials E30: Modelo Np350XAA-KF3BR. ");
		pw.println();
		pw.println();
		pw.println("total: 2.303,00");

		pw.close();

		long fim = System.currentTimeMillis();

		System.out.println("Tempo: " + (fim - ini+" Millissegundos para execução do programa"));

	}

}
