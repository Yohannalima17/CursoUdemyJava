package EstControle;

import javax.swing.*;
import java.util.Scanner;

public class aula161222 {

    public static void main(String[] args) {

        // WHILE DETERMINADO
        int var = 1;
        while (var <= 10) {
            System.out.println("Contagem " + var);
            var ++;
        }

        // WHILE INDETERMINADO
        Scanner entrada01 = new Scanner(System.in);
        String valor = "";

        while(!valor.equalsIgnoreCase("Sair")) {
            System.out.println("Digite o que deseja: ");
            valor = entrada01.nextLine();
        }

        // DO WHILE
        String variavel = "";
        do {
            String entrada02 = JOptionPane.showInputDialog("1- SOMAR\n2- SUBTRAIR\n3- MULTIPLICAR\n4- DIVIDIR\n5- SAIR");
            variavel = entrada02;
            if (!variavel.equalsIgnoreCase("5")) {
                String numero01 = JOptionPane.showInputDialog("Informe o primeiro número: ");
                int num01 = Integer.parseInt(numero01);
                String numero02 = JOptionPane.showInputDialog("Informe o segundo número: ");
                int num02 = Integer.parseInt(numero02);

                if (variavel.equalsIgnoreCase("1")) {
                    int soma = num01 + num02;
                    JOptionPane.showMessageDialog(null, soma);
                }if (variavel.equalsIgnoreCase("2")) {
                    int subtracao = num01 - num02;
                    JOptionPane.showMessageDialog(null, subtracao);
                }if (variavel.equalsIgnoreCase("3")) {
                    int multi = num01 * num02;
                    JOptionPane.showMessageDialog(null, multi);
                }else {
                    int div = num01 / num02;
                    JOptionPane.showMessageDialog(null, div);
                }
            }
        } while (!variavel.equalsIgnoreCase("5"));



        //FOR
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Contagem %d\n", i);
        }

    }

}
