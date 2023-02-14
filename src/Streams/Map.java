package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {

    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

        List<String> marcas = Arrays.asList("BMW", "FIAT", "CHEVROLET");
        marcas.stream().map(m -> m.toLowerCase()).forEach(print);
    }
}
