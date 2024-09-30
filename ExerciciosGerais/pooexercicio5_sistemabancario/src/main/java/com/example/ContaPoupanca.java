package com.example;

// ContaPoupanca.java
public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public double calcularTaxa() {
        // Exemplo de uma taxa mais baixa ou nula para conta poupança
        return 0.00;
    }

    public void aplicarJuros(double taxaJuros) {
        saldo += saldo * taxaJuros;
        System.out.println("Juros aplicados. Saldo atual: R$" + saldo);
    }
}
