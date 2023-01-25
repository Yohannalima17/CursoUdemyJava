package Loja;

public class Produto {

    String nome;
    double preco;
    double desconto;

    Produto () {
        
    }
    double precoFinal () {
        return preco * (1 - desconto);
    }
}
