package com.example;

public class Venda {
    private Produto produto;
    private int quantidade;

    public Venda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getTotalVenda() {
        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return "Venda: " + produto.getNome() + ", Quantidade: " + quantidade + ", Total: " + getTotalVenda();
    }
}
