package ArraysCollections;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Yohanna", "Yohannalima16@gmail.com"));
        lista.add(new Usuario("Maria", "maria@gmail.com"));
        lista.add(new Usuario("Yohanna", "Yohannalima@gmail.com"));
        lista.add(new Usuario("Yohanna", "Yohannalima16@gmail.com"));

        System.out.println(lista.get(3).toString());
    }
}
