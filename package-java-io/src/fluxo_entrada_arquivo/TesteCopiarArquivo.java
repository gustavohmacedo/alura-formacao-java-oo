package fluxo_entrada_arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteCopiarArquivo {
	public static void main(String[] args) throws IOException {

		// Stream: Entrada de fluxo de bytes
		// Reader: Leitor de fluxo de caracteres

		// Criando um Fluxo de Entrada de Arquivo
//		FileInputStream fis = 
		InputStream fis = System.in; // new FileInputStream("arquivoTeste.txt");
		// Transformando os dado binários(bytes) para caracteres
		InputStreamReader isr = new InputStreamReader(fis);
		// Agrupa vários caracteres para que sua leitura seja eficiente
		BufferedReader br = new BufferedReader(isr);

		// Criando um Fluxo de saída de arquivo(escreve bytes num arquivo)
		OutputStream fos = System.out; // new FileOutputStream("arquivoTeste2.txt");
		// Converte fluxos de caracteres para fluxos de bytes
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		// Grava texto em um fluxo de saída de caracteres para fornecer
		// a gravação eficiente de caracteres únicos, matrizes e strings.
		BufferedWriter bw = new BufferedWriter(osw);

		// Ler uma linha
		String linha = br.readLine();

		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();

		}

		br.close();
		bw.close();
	}

}
