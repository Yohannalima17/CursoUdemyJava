package EstControle;

import javax.swing.*;
import java.util.Random;

public class DesafioDoModulo {

    // Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
    // Armazene um numero aleatório em uma variável.
    // O Jogador tem 10 tentativas para adivinhar o número gerado.
    // Ao final de cada tentativa, imprima a quantidade de tentativas restantes,
    // e imprima se o número inserido é maior ou menor do que o número armazenado.

    public static void main(String[] args) {

        Random r = new Random();
        int num = r.nextInt(101);

        int tentativas = 9;

        //System.out.print(num);

        for (; tentativas >= 0; tentativas--){
            String entrada01 = JOptionPane.showInputDialog("Informe um número: ");
            int ent = Integer.parseInt(entrada01);
            if (ent == num){
                JOptionPane.showMessageDialog(null, "Você acertou!!!\nO número certo é " + num);
                tentativas = 0;
            } else {
                if (ent < num){
                    JOptionPane.showMessageDialog(null, "ERROU :(\nO número sorteado é maior que " + ent +"\nTentativas restantes: " + tentativas);
                } else if (ent > num) {
                    JOptionPane.showMessageDialog(null, "ERROU :(\nO número sorteado é menor que " + ent +"\nTentativas restantes: " + tentativas);
                }

            }
        }
    }
}
