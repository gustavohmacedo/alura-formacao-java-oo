package br.com.alura.testes;

import br.com.alura.models.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteListaDeAula {
    public static void main(String[] args) {

        Aula a1 = new Aula("Revisando as ArraysLists", 21);
        Aula a2 = new Aula("Listas de Objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        System.out.println("--------Lista de Objetos Original--------");
        List<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        System.out.println(aulas);

        System.out.println("\n-------Ordenando a Lista de Aulas com a classe Collections---------");
        System.out.println("\n-------Ordem alfabética---------");

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println("\n-------Ordem do Tempo---------");

        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
    }
}
