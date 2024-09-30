package com.example;

// Funcionario.java
public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) throws SalarioInvalidoException {
        if (salarioBase < 0) {
            throw new SalarioInvalidoException("O salário base não pode ser negativo.");
        }
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) throws SalarioInvalidoException {
        if (salarioBase < 0) {
            throw new SalarioInvalidoException("O salário base não pode ser negativo.");
        }
        this.salarioBase = salarioBase;
    }

    // Método abstrato para calcular o salário
    public abstract double calcularSalario();
}
