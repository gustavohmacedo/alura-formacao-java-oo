package fluxo_entrada_arquivo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TesteEscrita {
	public static void main(String[] args) throws IOException {

		//Criando um Fluxo de sa�da de arquivo(escreve bytes num arquivo)
		FileOutputStream fos = new FileOutputStream("arquivoTeste2.txt");
		//Converte fluxos de caracteres para fluxos de bytes
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		//Grava texto em um fluxo de sa�da de caracteres para fornecer
		//a grava��o eficiente de caracteres �nicos, matrizes e strings.
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("Notebook Essentials E30: Modelo Np350XAA-KF3BR. ");
//		bw.newLine();
		bw.newLine();
		bw.write("total: 2.303,00");
		bw.close();
	}

}
