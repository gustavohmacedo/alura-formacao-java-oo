package fluxo_entrada_arquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {

		// Stream: Entrada de fluxo de bytes
		// Reader: Leitor de fluxo de caracteres

		// Criando um Fluxo de Entrada de Arquivo

		FileInputStream fis = new FileInputStream("arquivoTeste.txt");
		// Transformando os dados(binários) bytes para caracteres
		InputStreamReader isr = new InputStreamReader(fis);
		// Agrupa vários caracteres para que sua leitura seja eficiente
		BufferedReader br = new BufferedReader(isr);

		// Ler uma linha
		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		br.close();
	}

}
