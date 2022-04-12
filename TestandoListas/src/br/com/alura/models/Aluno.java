package br.com.alura.models;

public class Aluno {

    private String nome;
    private int NumeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if (nome == null) throw new NullPointerException("Nome não poder nulo");
        this.nome = nome;
        NumeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return NumeroMatricula;
    }

    @Override
    public String toString() {
        return "Aluno[" +
                "Nome: " + this.nome + ", " +
                "Numero da Matricula: " + this.NumeroMatricula + "]";
    }

    @Override
    public boolean equals(Object obj) {
       Aluno outroAluno = (Aluno) obj;
       return this.nome.equals(outroAluno.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
