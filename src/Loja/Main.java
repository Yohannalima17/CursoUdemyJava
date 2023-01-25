package Loja;

public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Celular";
        p1.preco = 1200;
        p1.desconto = 0.10;

        System.out.println(p1.precoFinal());
    }
}
