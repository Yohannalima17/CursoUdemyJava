package ArraysCollections;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe quantas notas serão digitadas: ");
        int quant = entrada.nextInt();

        double [] notas = new double[quant];
        for (int i = 0; i < quant; i++){
            System.out.print("Digite a nota " + (i+1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        entrada.close();

        double total = 0;
        for (double nota: notas) {
            total += nota;
        }

        System.out.println("Média: " + total/quant);
    }
}
