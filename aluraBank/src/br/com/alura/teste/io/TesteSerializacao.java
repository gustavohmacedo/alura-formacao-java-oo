package br.com.alura.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.alura.modelo.Cliente;
import br.com.alura.modelo.ContaCorrente;

public class TesteSerializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		Cliente cliente = new Cliente("Gustavo Henrique", "078.231.565.-09", "Software Developer");
		
		ContaCorrente contaCorrente = new ContaCorrente(12, 125231);
		contaCorrente.setTitular(cliente);
		contaCorrente.depositar(10.00);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(contaCorrente);
		oos.close();
		
		
	}

}
