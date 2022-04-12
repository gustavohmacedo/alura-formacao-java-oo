package br.com.alura.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Curso {

    private String nome;
    private int quantidadeAlunos;


    public Curso(String nome, int quantidadeAlunos) {
        this.nome = nome;
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public String getNome() {
        return nome;
    }


    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", " + "Alunos: " + quantidadeAlunos;
    }
}

class ExemploCurso {
    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        System.out.println("\n--------[ Ordenando os Cursos pela quantidade de Alunos ]--------");
        cursos.sort(Comparator.comparingInt(Curso::getQuantidadeAlunos));
        cursos.forEach(System.out::println);

        System.out.println("\n--------[ Filtrando os Cursos onde a quantidade de Alunos seja >= 50 ]--------");
        cursos.stream()
                .filter(curso -> curso.getQuantidadeAlunos() >= 50)
                .forEach(System.out::println);

        System.out.println("\n--------[ Filtrando os Cursos pelo Nome]--------");
        cursos.stream()
                .map(Curso::getNome).forEach(System.out::println);

        System.out.println("\n--------[ Filtrando os Cursos pela quantidade de Alunos]--------");
        cursos.stream()
                .mapToInt(Curso::getQuantidadeAlunos).forEach(System.out::println);

        System.out.println("\n--------[ Somando a quantidade total de Alunos]--------");
        int sum = cursos.stream()
                .mapToInt(Curso::getQuantidadeAlunos).sum();
        System.out.println("Soma total: " + sum);

        System.out.println("\n-----FindAny - Retorna qualquer elemento do Stream------");
        cursos.stream()
                .filter(c -> c.getQuantidadeAlunos() >= 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));

        System.out.println("\n-----------------Colletors.toMap--------------------------");
        cursos.stream()
                .filter(c -> c.getQuantidadeAlunos() >= 100)
                .collect(Collectors.toMap(
                        Curso::getNome,
                        Curso::getQuantidadeAlunos))
                .forEach((nome, quantidadeAlunos) -> System.out.println(nome + " tem " + quantidadeAlunos + " alunos."));

        System.out.println("\n---------Cálculo de Média de Alunos-----------------------");
        OptionalDouble average = cursos.stream()
                .mapToInt(Curso::getQuantidadeAlunos)
                .average();
        System.out.println("Média: " + average);


    }

}
