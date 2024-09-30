package com.example;

// Banco.java
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor) throws SaldoInsuficienteException {
        origem.sacar(valor);
        destino.depositar(valor);
        System.out.println("Transferência de R$" + valor + " realizada de " + origem.getNumeroConta() + " para " + destino.getNumeroConta());
    }

    public void gerarExtrato(ContaBancaria conta) {
        System.out.println("Extrato da conta: " + conta.getNumeroConta());
        System.out.println("Saldo atual: R$" + conta.getSaldo());
        System.out.println("Taxa aplicada: R$" + conta.calcularTaxa());
    }
}
