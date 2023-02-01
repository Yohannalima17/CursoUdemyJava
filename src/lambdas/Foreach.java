package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Yohanna", "Maria", "Ana");

        //Lambda 01
        aprovados.forEach((nome) -> {meuImprimir(nome);});

        //Lambda 02
        aprovados.forEach(System.out::println);
        aprovados.forEach(Foreach::meuImprimir);
    }

    static void meuImprimir(String nome){
        System.out.println("Oi, meu nome é " + nome);
    }
}
