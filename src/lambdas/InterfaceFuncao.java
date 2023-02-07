package lambdas;

import java.util.function.Function;

public class InterfaceFuncao {

    public static void main(String[] args) {

        //Pode ter um tipo como entrada e outro como saída
        Function<Integer, String> PouI = num -> num % 2 == 0 ? "Par" : "Ímpar";
        System.out.println(PouI.apply(2));
    }
}
