package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Yohanna", 10, "Bom");
        Aluno a2 = new Aluno("Matehus", 8, "Médio");
        Aluno a3 = new Aluno("Bia", 9.8, "Ruim");
        Aluno a4 = new Aluno("João", 3.5, "Bom");
        Aluno a5 = new Aluno("Débora", 7.6, "Ruim");
        Aluno a6 = new Aluno("José", 4.4, "Médio");


        Predicate<Aluno> comp = c -> c.comportamento == "Bom" || c.comportamento == "Médio";
        Predicate<Aluno> nota = n -> n.nota >= 7.0;

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
        alunos.stream()
                .filter(comp) //Filtrando o comportamento dos alunos
                .filter(nota) //Filtrando notas maiores ou igual a 7.0
                .map(a -> "Parabéns, "+ a.nome + "! Você foi aprovado(a)!")
                .forEach(System.out::println);


    }
}
