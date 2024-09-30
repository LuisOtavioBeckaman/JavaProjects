package com.example;

// Main.java
public class Main {
    public static void main(String[] args) {
        try {
            // Criar um departamento
            Departamento deptoTI = new Departamento("TI");

            // Criar funcionários
            FuncionarioAssalariado joao = new FuncionarioAssalariado("João", 3000);
            FuncionarioHorista maria = new FuncionarioHorista("Maria", 0, 50);
            maria.setHorasTrabalhadas(160);  // 160 horas no mês

            // Adicionar funcionários ao departamento
            deptoTI.adicionarFuncionario(joao);
            deptoTI.adicionarFuncionario(maria);

            // Calcular total de salários
            System.out.println("Total de salários: " + deptoTI.calcularTotalSalarios());

            // Promover um funcionário
            deptoTI.promoverFuncionario(joao, 500);  // Aumento de 500 reais
            System.out.println("Salário de João após promoção: " + joao.calcularSalario());

            // Gerar relatório de salários
            deptoTI.gerarRelatorioSalarios();

        } catch (SalarioInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
