package EstControle;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class DesafioDiaSemana {
    public static void main(String[] args) {

        List<String> dias = new ArrayList(List.of("Domingo","Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"));

        String entrada = JOptionPane.showInputDialog("Informe um número: ");
        int numero = Integer.parseInt(entrada);

        if (numero < 1 || numero > 7) {
            System.out.println("Número inválido.");
        }else {
            System.out.println(dias.get(numero-1));
        }
    }
}
