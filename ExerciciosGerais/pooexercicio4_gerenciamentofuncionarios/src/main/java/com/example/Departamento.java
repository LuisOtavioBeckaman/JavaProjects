package com.example;

// Departamento.java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularTotalSalarios() {
        return funcionarios.stream()
                .mapToDouble(Funcionario::calcularSalario)
                .sum();
    }

    public void promoverFuncionario(Funcionario funcionario, double aumento) throws SalarioInvalidoException {
        double novoSalario = funcionario.getSalarioBase() + aumento;
        funcionario.setSalarioBase(novoSalario);
    }

    public void gerarRelatorioSalarios() {
        System.out.println("Relatório de salários do departamento " + nome + ":");
        funcionarios.forEach(f -> System.out.println(f.getNome() + ": " + f.calcularSalario()));
    }
}
