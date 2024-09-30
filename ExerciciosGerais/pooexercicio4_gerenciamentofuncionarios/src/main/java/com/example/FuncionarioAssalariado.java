package com.example;

// FuncionarioAssalariado.java
public class FuncionarioAssalariado extends Funcionario {

    public FuncionarioAssalariado(String nome, double salarioBase) throws SalarioInvalidoException {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;  // Salário fixo
    }
}
