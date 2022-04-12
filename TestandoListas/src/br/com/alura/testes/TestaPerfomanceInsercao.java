package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerfomanceInsercao {

    public static void main(String[] args) {

        final long VALOR_MAXIMO_LIST = 50000;
        final long VALOR_MAXIMO_SET = 50000;

        Collection<Integer> numeros = new ArrayList<>();

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < VALOR_MAXIMO_LIST; i++) {
            numeros.add(i);

        }

        long fim = System.currentTimeMillis();

        long tempoTotal = fim - inicio;

        System.out.println("Tempo total para Inserção de elementos no List: " + tempoTotal + " milliseconds");

        System.out.println("----------------------------------------------");

        Collection<Integer> numeros2 = new HashSet<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < VALOR_MAXIMO_SET; i++) {
            numeros2.add(i);

        }

        long end = System.currentTimeMillis();

        long totalTime = end - start;

        System.out.println("Tempo total para Inserção de elementos no HashSet: " + totalTime + " milliseconds");


    }
}
