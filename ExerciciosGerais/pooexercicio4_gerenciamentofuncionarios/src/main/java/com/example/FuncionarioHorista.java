package com.example;

// FuncionarioHorista.java
public class FuncionarioHorista extends Funcionario {
    private double horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioHorista(String nome, double salarioBase, double valorPorHora) throws SalarioInvalidoException {
        super(nome, salarioBase);
        this.valorPorHora = valorPorHora;
    }

    public void setHorasTrabalhadas(double horas) {
        this.horasTrabalhadas = horas;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }
}
