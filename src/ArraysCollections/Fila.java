package ArraysCollections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // ADICIONAR o elemento a fila
        fila.add("Ana"); //Retorna uma exceção se não conseguir adicionar na fila
        fila.offer("Yohanna"); //Retorna FALSE se não conseguir adicionar na fila

        // OBTER o próximo elemento da fila
        System.out.println(fila.peek()); // Se a fila for vazia, retorna false
        System.out.println(fila.element()); // Se a fila for vazia, retorna uma exceção

        // REMOVER o próximo elemento da fila
        System.out.println(fila.poll()); // Retorna o primeiro elemento e remove
        System.out.println(fila.remove()); // Se a lista estiver vazia, lança uma exceção

        // LIMPAR
        fila.clear();

        // CONTAR
        fila.size();
    }
}
