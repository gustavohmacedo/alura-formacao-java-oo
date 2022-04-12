package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerfomanceLeitura {

    public static void main(String[] args) {

        final long VALOR_MAXIMO_LIST = 50000;
        final long VALOR_MAXIMO_SET = 50000;

        Collection<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < VALOR_MAXIMO_LIST; i++) {
            numeros.add(i);

        }

        long inicio = System.currentTimeMillis();

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoTotal = fim - inicio;

        System.out.println("Tempo total para Leitura de elementos no List: " + tempoTotal + " milliseconds");

        System.out.println("----------------------------------------------");

        Collection<Integer> numeros2 = new HashSet<>();


        for (int i = 0; i < VALOR_MAXIMO_SET; i++) {
            numeros2.add(i);

        }

        long start = System.currentTimeMillis();

        for (Integer number : numeros2) {
            numeros2.contains(number);

        }

        long end = System.currentTimeMillis();

        long totalTime = end - start;

        System.out.println("Tempo total para Leitura de elementos no HashSet: " + totalTime + " milliseconds");


    }
}
