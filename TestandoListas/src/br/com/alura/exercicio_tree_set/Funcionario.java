package br.com.alura.exercicio_tree_set;

public class Funcionario {

    private String nome;
    private int idade;

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Funcionario[" + "Nome: " + this.nome + ", " + "Idade: " + this.idade + "]";
    }
}
