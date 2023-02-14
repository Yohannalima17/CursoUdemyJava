package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class imprimirObjetos {

    public static void main(String[] args) {

        List<String>aprovados = Arrays.asList("Yohanna", "Matheus", "João", "Paula");

        // Usando ITERATOR
        Iterator<String> it = aprovados.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // Usando STREAM
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);
    }
}
