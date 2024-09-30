package com.example;

public class Main {
    public static void main(String[] args) {
        // Instanciando a classe Venda
        Venda venda = new Venda();

        // Criando alguns produtos
        Produto produto1 = new Produto("Notebook", 3500.00);
        Produto produto2 = new Produto("Mouse", 150.00);
        Produto produto3 = new Produto("Teclado", 250.00);
        Produto produto4 = new Produto("Smartphone", 2200.00);
        Produto produto5 = new Produto("Cadeira Gamer", 1000.00);

        // Adicionando vendas para clientes
        venda.adicionarVenda("Carlos", produto1);
        venda.adicionarVenda("Carlos", produto2);
        venda.adicionarVenda("Ana", produto3);
        venda.adicionarVenda("Ana", produto4);
        venda.adicionarVenda("Lucas", produto5);

        // Exibindo produtos vendidos acima de R$500,00
        System.out.println("Produtos vendidos acima de R$500,00:");
        venda.exibirProdutosAcimaDeValor(500.00);

        // Calculando e exibindo o total de vendas de um cliente
        System.out.println("\nTotal de vendas de Carlos: R$" + venda.calcularTotalVendas("Carlos"));
    }
}
