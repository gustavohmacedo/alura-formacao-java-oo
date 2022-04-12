package br.com.alura.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;

    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        //Retorna uma exibição não modificável da lista especificada.
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        //Retorna uma exibição não modificável do Set especificado.
        return Collections.unmodifiableSet(alunos);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);

    }

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    @Override
    public String toString() {
        return "Curso: " +
                "[ Nome: " + this.nome + ", " +
                "Instrutor: " + this.instrutor + ", " +
                "Aulas: " + this.aulas +
                "]";
    }

    public boolean isMatriculado(Aluno aluno) {
        if (this.alunos.contains(aluno)) {
            return true;
        }
        return false;
    }

    public Aluno buscarAlunoMatriculado(int matricula) {

        if (!this.matriculaParaAluno.containsKey(matricula)) {
            throw new NoSuchElementException("Aluno não encontrado.");
        }
        return this.matriculaParaAluno.get(matricula);
    }
}
