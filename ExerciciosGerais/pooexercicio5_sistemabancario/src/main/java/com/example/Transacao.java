package com.example;

// Transacao.java
public interface Transacao {
    void depositar(double valor);
    void sacar(double valor) throws SaldoInsuficienteException;
}
