package EstControle;

import javax.swing.*;

public class aula151222 {
    public static void main(String[] args) {

        String nota01r = JOptionPane.showInputDialog("Informe a nota 01: ");
        int nota01 = Integer.parseInt(nota01r);
        String nota02r = JOptionPane.showInputDialog("Informe a nota 02: ");
        int nota02 = Integer.parseInt(nota02r);
        String nota03r = JOptionPane.showInputDialog("Informe a nota 03: ");
        int nota03 = Integer.parseInt(nota03r);

        double media = (nota01 + nota02 + nota03)/3;

        if (media >= 7) {
            System.out.println("Aprovado.");
        }else if (media < 5){
            System.out.println("Reprovado.");
        }else {
            System.out.println("Recuperação.");
        }
    }
}
