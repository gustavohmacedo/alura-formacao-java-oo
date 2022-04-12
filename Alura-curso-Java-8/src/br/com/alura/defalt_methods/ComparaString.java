package br.com.alura.defalt_methods;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class ComparaString {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Gustavo");
        nomes.add("Henrique");
        nomes.add("Macedo");

        System.out.println("Ordem de Inserção: " + nomes);

        System.out.println("\n------Ordena os nomes do menor ao maior-------");
        nomes.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
//        nomes.sort(comparing(String::length));
        nomes.sort(comparing(String::length));
        System.out.println(nomes);

        System.out.println("\n------Impressão com Method Reference-------");
        nomes.forEach(System.out::println);
    }


}
