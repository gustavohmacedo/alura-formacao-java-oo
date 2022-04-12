package br.com.alura.exercicio_map;

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {
    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fábio Pimentel");
        pessoas.put(19, "Silvio Matos");
        pessoas.put(23, "Rômulo Henrique");

        System.out.println("-----------Estrutura Map------------");
        System.out.println(pessoas);

        System.out.println("\nIdades (Keys) cadastradas: " + pessoas.keySet());

        System.out.println("\nNomes (Values) cadastrados: " + pessoas.values());

        System.out.println("\nAtravés da Key é retornado o Value");
        pessoas.keySet().forEach(idade -> System.out.println(pessoas.get(idade)));


    }
}
