package com.example;

import java.util.*;
import java.util.stream.*;

public class AnaliseVendas {
    private List<Venda> vendas;

    public AnaliseVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    // Método que filtra vendas acima de um valor especificado
    public List<Venda> filtrarVendasCaras(double valor) {
        return vendas.stream()
                .filter(venda -> venda.getTotalVenda() > valor)
                .collect(Collectors.toList());
    }

    // Método que calcula o total de vendas e o valor médio
    public void calcularEstatisticas() {
        double totalVendas = vendas.stream()
                .mapToDouble(Venda::getTotalVenda)
                .sum();

        double mediaVendas = vendas.stream()
                .mapToDouble(Venda::getTotalVenda)
                .average()
                .orElse(0.0);

        System.out.println("Total de Vendas: " + totalVendas);
        System.out.println("Valor Médio das Vendas: " + mediaVendas);
    }
}
