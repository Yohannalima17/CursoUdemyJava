package ArraysCollections;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner entrada =new Scanner(System.in);
        System.out.print("Informe a quantidade de alunos: ");
        int qtdAlunos = entrada.nextInt();
        System.out.print("Informe a quantidade de notas: ");
        int qtdNotas = entrada.nextInt();

        Double [][] notas = new Double[qtdAlunos][qtdNotas];

        double total = 0;
        for (int a = 0; a < qtdAlunos; a++) {
            for (int n = 0; n < qtdNotas; n++) {
                System.out.printf("Aluno %d nota %d: ", (a + 1), (n + 1));
                notas[a][n] = entrada.nextDouble();
                total += notas[a][n];
            }
        }

        System.out.printf("Média: %.1f",total/(qtdAlunos*qtdNotas));

        entrada.close();
    }
}
