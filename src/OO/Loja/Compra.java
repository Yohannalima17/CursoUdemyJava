package OO.Loja;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    String cliente;
    List<Produto> produtos = new ArrayList<>();

    double getTotal() {
        double total = 0;
        for (Produto produto: produtos) {
            total += produto.quantidade * produto.preco;
        }
        return total;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    void getProduto() {
        for (Produto produto: produtos) {
            System.out.println("Nome: " + produto.getNome() + " | Quantidade: " + produto.getQuantidade() + " | Preço: " + produto.getPreco());
        }
    }
    public void setProdutos(String nome, int quantidade, double preco) {
        this.produtos.add(new Produto(nome, quantidade, preco));
    }
}