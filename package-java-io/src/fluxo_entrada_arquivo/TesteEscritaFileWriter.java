package fluxo_entrada_arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
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

		BufferedWriter bw = new BufferedWriter(new FileWriter("arquivoTeste2.txt"));
		bw.write("Notebook Essentials E30: Modelo Np350XAA-KF3BR. ");
		bw.newLine();
		bw.newLine();
		bw.write("total: 2.303,00");

		bw.close();
	}

}
