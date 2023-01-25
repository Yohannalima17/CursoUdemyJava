package EstControle;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DesafioDaSemana02 {

    public static void main(String[] args) {

        int total = 0;

        while (total != -1) {
            String nota01r = JOptionPane.showInputDialog("Informe a nota: ");
            int nota01 = Integer.parseInt(nota01r);
            if (nota01 == -1) {
                System.out.println("Média = "+ total/3);
                total = -1;
            } else if (nota01 < 0 || nota01 > 10) {
                System.out.println("Valor não permitido.");
                total = -1;
            } else {
                total += nota01;
            }
        }
    }
}
