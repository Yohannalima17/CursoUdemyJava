package EstControle;

import javax.swing.*;

public class Aula090123 {

    public static void main(String[] args) {

        // Switch sem break
        String faixa = "marrom";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei o Bassai-Dai.");
            case "marrom":
                System.out.println("Sei o Tekki Shodan.");
            case "roxa":
                System.out.println("Sei o Heian Godan.");
        }

        // Switch com break
        String entrada = JOptionPane.showInputDialog("Informe a nota: ");
        int nota = Integer.parseInt(entrada);
        String conceito = "";

        switch (nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6: case 5:
                conceito = "C";
                break;
            case 4: case 3:
                conceito = "D";
                break;
            case 2: case 1: case 0:
                conceito = "E";
                break;
        }

        JOptionPane.showMessageDialog(null, conceito);

        // Continue
        for (int i = 1; i <= 10; i++){
            if (i % 2 != 0) continue;
            System.out.println(i + " é par!");
        }
    }
}