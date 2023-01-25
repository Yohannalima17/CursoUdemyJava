package ArraysCollections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map <Integer, String> mapa = new HashMap<>();

        // PUT -> Adiciona ou substitui caso já tenha um elemento igual
        mapa.put(3788, "Yohanna");
        mapa.put(1232, "Maria");

        // KeySet() -> Pega as chaves cadastradas
        System.out.println(mapa.keySet());

        // values() -> Pega os valores armazenados
        System.out.println(mapa.values());

        // entrySet() -> Retorna chaves e valores
        System.out.println(mapa.entrySet());

        // Percorrer as chaves
        for ( int chave: mapa.keySet()) {
            System.out.println(chave);
        }

        // Percorrer os valores
        for (String valor: mapa.values()) {
            System.out.println(valor);
        }

        // Percorrer as chaves e valores
        for (Map.Entry<Integer, String> usuarios: mapa.entrySet()) {
            System.out.println(usuarios);
        }
    }
}
