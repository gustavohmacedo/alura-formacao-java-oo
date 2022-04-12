package br.com.alura.teste;

import br.com.alura.modelo.Conexao;

public class TesteConexao {
    public static void main(String[] args) {

        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Connection Error! " + ex.getMessage());

        }

      /*  br.com.alura.modelo.Conexao conexao = null;
        try {
            conexao = new br.com.alura.modelo.Conexao();
            conexao.leDados();
        } catch (IllegalStateException ex) {
            System.out.println(";
        } finally {
            if (conexao != null) {
                conexao.close();
            }
        }*/
    }
}
