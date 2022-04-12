package br.com.alura.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.alura.modelo.ContaCorrente;

public class TesteDesserializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		ois.close();

		System.out.println("Nome Titular: " + cc.getTitular().getNome());
		System.out.println("Saldo: " + cc.getSaldo());
	}
}
