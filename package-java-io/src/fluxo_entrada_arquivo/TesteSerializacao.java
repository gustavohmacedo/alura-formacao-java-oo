package fluxo_entrada_arquivo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		// Criação do objeto
//		ClienteSerializacao cliente = new ClienteSerializacao();
//		cliente.setNome("Guga");
//		cliente.setCpf("074.555.232-55");
//		cliente.setProfissao("Software Developer");
//		
		// Serialização -> Transformando o objeto em uma cadeia de bytes
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();

		// Desserialização -> Transformando uma cadeia de bytes em Objeto
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		ClienteSerializacao cliente = (ClienteSerializacao) ois.readObject();
		ois.close();
		System.out.println(cliente.getNome());

	}

}
