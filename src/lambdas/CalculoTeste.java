package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste {

    public static void main(String[] args) {

        // Usando interface funcional criada
        Calculo soma = (x,y) -> {return x + y; };
        System.out.println(soma.executar(2,3));

        Calculo multi = (x,y) -> {return x * y; };
        System.out.println(multi.executar(2,3));

        // Usando interface funcional do java
        BinaryOperator<Integer> somar = (x,y) -> {return x+y; };
        System.out.println(somar.apply(2,3));
    }
}