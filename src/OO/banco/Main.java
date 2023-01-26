package OO.banco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);
        System.out.print(
                "--------- BANCO XXXX ---------\n" +
                        "1 - Abertura de conta corrente\n" +
                        "2 - Abertura de conta poupança\n" +
                        "------------------------------\n" +
                        "Informe a operação que deseja: ");
        int entradaConta = menu.nextInt();

        if (entradaConta != 1 && entradaConta != 2) {
            System.out.println("Opção inválida.");
        } else {
            Scanner dadosCliente = new Scanner(System.in);

            System.out.print("Informe seu nome: ");
            String nome = dadosCliente.nextLine();

            System.out.print("Informe sua idade: ");
            int idade = dadosCliente.nextInt();

            System.out.print("Informe seu cpf: ");
            Long cpf = dadosCliente.nextLong();

            switch (entradaConta) {
                case 1: {
                    Cliente cliente = new Cliente(nome, idade, cpf);
                    ContaCorrente cc = new ContaCorrente(cliente);
                    cc.dadosCC(cliente, cc);
                }
                case 2: {
                    Cliente cliente = new Cliente(nome, idade, cpf);
                    ContaPoupanca cp = new ContaPoupanca(cliente);
                    cp.dadosCP(cliente, cp);
                }
            }
            dadosCliente.close();
        }

    }
}
