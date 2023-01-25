package fundamentos;

import java.util.Scanner;
public class Aula240822 {
    public static void main(String[] args) {

        // Igualdade de Strings
        String a = "Yohanna";
        System.out.println("Yohanna".equals(a));
        System.out.println("yohanna".equalsIgnoreCase(a));
        // Comparação retirando espaços em branco
        String b = "  Yohanna  ";
        System.out.println("Yohanna".equals(b.trim()));


        // Desafio do Modulo
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        Double num1 = entrada.nextDouble();
        System.out.println("Informe o segundo valor: ");
        Double num2 = entrada.nextDouble();
        System.out.println("Informe a operação: ");
        String op = entrada.next();
        entrada.close();

        if (op.equalsIgnoreCase("x")) {
            Double resultado = num1 * num2;
            System.out.printf("Resultado: %.1f", (resultado));
        }else if(op.equalsIgnoreCase("/")) {
            Double resultado = num1 / num2;
            System.out.printf("Resultado: %.1f", (resultado));
        }else if(op.equalsIgnoreCase("+")) {
            Double resultado = num1 + num2;
            System.out.printf("Resultado: %.1f", (resultado));
        }else if(op.equalsIgnoreCase("-")) {
            Double resultado = num1 - num2;
            System.out.printf("Resultado: %.1f", (resultado));
        }
    }
}
