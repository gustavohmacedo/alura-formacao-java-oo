package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas {
    public static void main(String[] args) {

        System.out.println("-------- lista de Objtos--------");

        String aula1 = "Java 8: Collections";
        String aula2 = "Lógica de Programação";
        String aula3 = "Estrutura de Dados";

        List<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        System.out.println(aulas);

        System.out.println("\n-------Removendo um objeto da lista---------");
        aulas.remove(aula1);
        System.out.println(aulas);

        System.out.println("\nO primeiro curso é: " + aulas.get(0));

        System.out.println("\n-------Adicionado um novo objeto à lista---------");
        String aula4 = "ArrayList";
        aulas.add(aula4);

        System.out.println(aulas);

        System.out.println("\n-------Printando a lista com ForEach---------");

        for (String aula : aulas) {
            System.out.println(aula);
        }

        System.out.println("\n-------Ordenando a Lista de String com a classe Collections---------");
        //A classe String implementa, por padrão, a interface Comparable<>

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println("\n-------Ordenamento natural da Lista com o método sort do List---------");

        aulas.stream().sorted();
        System.out.println(aulas);

        System.out.println("\n-------Printando a lista com a Estrutura Lambda---------");
        aulas.forEach(aula -> System.out.println(aula));

        System.out.println("\n-------Printando a lista com Method Reference---------");
        aulas.forEach(System.out::println);


    }
}
