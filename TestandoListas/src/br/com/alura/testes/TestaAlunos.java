package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {
    public static void main(String[] args) {
        //Conjunto HashSet: Não aceita elementos repetidos e tem alta peformance

        Collection<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Saggio");
        alunos.add("Mauricio Aniche");
        alunos.add("Mauricio Aniche"); //não aceita valores iguais

        System.out.println("\n--------Conjunto Set--------");
        System.out.println(alunos);

        System.out.println("\nTamanhho do Conjunto: " + alunos.size());

        System.out.println("\n--------Printando Conjunto Set com ForEach--------");
        for (String aluno : alunos) System.out.println(aluno);

        System.out.println("\n--------Printando Conjunto Set com a Estrutura Lambda--------");
        alunos.forEach(aluno -> System.out.println(aluno));

        System.out.println("\n--------Verificando se um Objeto está contido na Coleção HashSet--------");

        boolean estaNaColecao = alunos.contains("Alberto Souza");
        System.out.println("Alberto Souza está no Conjunto? " + estaNaColecao);

        System.out.println("\n--------Ordenando um Conjunto Collection através de uma List--------");
        List<String> alunosEmLista = new ArrayList<>(alunos);
        Collections.sort(alunosEmLista);
        System.out.println(alunosEmLista);


    }
}
