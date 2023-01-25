package ArraysCollections;

import java.util.Arrays;

public class Aula23012023 {

    public static void main(String[] args) {

        double [] notasAluno01 = new double[3];
        notasAluno01[0] = 7.5;
        notasAluno01[1] = 8.0;
        notasAluno01[2] = 5.0;

        // FOREACH
        for (double nota: notasAluno01){
            System.out.println(nota);
        }
    }
}