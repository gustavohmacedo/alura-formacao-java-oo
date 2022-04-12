package br.com.alura.testes;

import br.com.alura.models.Aluno;
import br.com.alura.models.Aula;
import br.com.alura.models.Curso;

public class TestaCursoComAluno {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Gustavo Henrique");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricular(a1);
        javaColecoes.matricular(a2);
        javaColecoes.matricular(a3);

        System.out.println("\n--------- Todos os Alunos matriculados ---------");

        javaColecoes.getAlunos().forEach(System.out::println);

       /* Iterator<Aluno> iterator = javaColecoes.getAlunos().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/


        System.out.println("\n--------- Verifica na Coleção se um Aluno está Matriculado ---------");
        System.out.println(" O Aluno " + a1.getNome() + " está matruculado? " + javaColecoes.isMatriculado(a1));


        System.out.println("\n--------- Verifica se um objeto passado é igual a algum dentro da Coleção Set ---------");
        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println("a1 é igual a Turini ? " + a1.equals(turini));

        System.out.print("O HashCode de a1 e Turini são iguais ? ");
        System.out.print(a1.hashCode() == turini.hashCode());
    }
}