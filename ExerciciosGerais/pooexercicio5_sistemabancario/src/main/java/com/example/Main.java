package com.example;

// Main.java
public class Main {
    public static void main(String[] args) {
        try {
            // Criando o banco
            Banco banco = new Banco();

            // Criando contas
            ContaCorrente cc = new ContaCorrente("12345", 1000.00);
            ContaPoupanca cp = new ContaPoupanca("54321", 500.00);

            // Adicionando contas ao banco
            banco.adicionarConta(cc);
            banco.adicionarConta(cp);

            // Realizando transações
            cc.depositar(200);
            cp.depositar(300);

            // Transferindo dinheiro
            banco.transferir(cc, cp, 150);

            // Aplicando juros na conta poupança
            cp.aplicarJuros(0.02);  // 2% de juros

            // Gerando extratos
            banco.gerarExtrato(cc);
            banco.gerarExtrato(cp);

        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
