package br.com.alura.testes;

import br.com.alura.models.Aula;
import br.com.alura.models.Curso;

public class TestaCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Gustavo Henrique");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaColecoes.adiciona(new Aula("Criando uma Aula",20));
        javaColecoes.adiciona(new Aula("Modelando com Coleções",22));

        System.out.println(javaColecoes.getAulas());


    }
}
