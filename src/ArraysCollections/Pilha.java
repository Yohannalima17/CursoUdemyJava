package ArraysCollections;

import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("Cave mais fundo");
        livros.addFirst("O custo do discipulado");
        livros.addFirst("Caso perdido");
        livros.addFirst("Os quatro amores");

        for ( String livro: livros) {
            System.out.println(livro);
        }

    }
}
