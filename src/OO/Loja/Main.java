package OO.Loja;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Compra c01 = new Compra();
        c01.setCliente("Yohanna");
        c01.setProdutos("Livro", 1, 39.90);
        c01.setProdutos("Caneta", 3, 12.90);


        System.out.println(c01.getCliente());
        c01.getProduto();
    }
}
