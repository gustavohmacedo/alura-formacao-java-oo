package br.com.alura.testes;

import br.com.alura.models.Aula;
import br.com.alura.models.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Gustavo Henrique");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(javaColecoes.getAulas());

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println("Tempo total: " + javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);


    }
}
