package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando produtos
        Produto produto1 = new Produto("Produto A", 50.0);
        Produto produto2 = new Produto("Produto B", 150.0);
        Produto produto3 = new Produto("Produto C", 200.0);
        Produto produto4 = new Produto("Produto D", 80.0);

        // Criando vendas
        List<Venda> vendas = new ArrayList<>();
        vendas.add(new Venda(produto1, 2)); // 100.0
        vendas.add(new Venda(produto2, 1)); // 150.0
        vendas.add(new Venda(produto3, 3)); // 600.0
        vendas.add(new Venda(produto4, 1)); // 80.0

        // Analisando vendas
        AnaliseVendas analise = new AnaliseVendas(vendas);

        // Filtrando vendas caras
        System.out.println("Vendas acima de 100:");
        List<Venda> vendasCaras = analise.filtrarVendasCaras(100);
        vendasCaras.forEach(System.out::println);

        // Calculando estatísticas de vendas
        analise.calcularEstatisticas();
    }
}
