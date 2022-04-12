package br.com.alura.exercicio_tree_set;

import com.sun.source.doctree.SeeTree;

import java.util.Set;
import java.util.TreeSet;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Barney", 12);
        Funcionario f2 = new Funcionario("Jonatan", 9);
        Funcionario f3 = new Funcionario("Guaraciara", 13);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        funcionarios.forEach(System.out::println);


    }
}

