package br.com.alura.modelo;

public class Conexao implements AutoCloseable { //Interface para Auto-fechamento da conexão

    public Conexao() {
        System.out.println("Abrindo conexao");
        //throw new IllegalStateException();
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }

    //This method is invoked automatically on objects managed by the try-with-resources statement.
    @Override
    public void close() {
        System.out.println("Fechando conexao");

    }
}
