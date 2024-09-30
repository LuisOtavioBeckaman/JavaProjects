package com.example;

import java.util.*;

public class Venda {
    // Mapa que armazena o nome do cliente e a lista de produtos vendidos para ele
    private Map<String, List<Produto>> vendas = new HashMap<>();

    // Método para adicionar uma venda para um cliente
    public void adicionarVenda(String cliente, Produto produto) {
        // Se o cliente não existe ainda, cria uma nova lista para ele
        vendas.computeIfAbsent(cliente, k -> new ArrayList<>()).add(produto);
    }

    // Método que calcula o total das vendas de um cliente
    public double calcularTotalVendas(String cliente) {
        List<Produto> produtos = vendas.get(cliente);
        return produtos.stream().mapToDouble(Produto::getPreco).sum();
    }

    // Método que filtra e exibe os produtos vendidos acima de um determinado valor
    public void exibirProdutosAcimaDeValor(double valor) {
        vendas.forEach((cliente, produtos) -> {
            System.out.println("Cliente: " + cliente);
            produtos.stream()
                    .filter(produto -> produto.getPreco() > valor)
                    .forEach(System.out::println);
        });
    }
}
