package com.example;

// ContaCorrente.java
public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public double calcularTaxa() {
        // Exemplo de uma taxa fixa para conta corrente
        return 15.00;
    }
}
