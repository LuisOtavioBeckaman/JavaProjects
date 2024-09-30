package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SistemaNotas {
    private Map<String, List<Double>> notasPorEstudante;

    public SistemaNotas() {
        notasPorEstudante = new HashMap<>();
    }

    // Método para adicionar notas de um estudante
    public void adicionarNotas(String nomeEstudante, List<Double> notas) {
        notasPorEstudante.put(nomeEstudante, notas);
    }

    // Método genérico para calcular a média de uma lista de notas
    public static <T extends Number> double calcularMedia(List<T> notas) {
        return notas.stream()
                .mapToDouble(Number::doubleValue)
                .average()
                .orElse(0.0);
    }

    // Método para filtrar alunos com média acima de um valor específico
    public List<Estudante> filtrarAlunosComMediaAcima(double mediaMinima) {
        return notasPorEstudante.entrySet().stream()
                .map(entry -> new Estudante(entry.getKey(), entry.getValue()))
                .filter(estudante -> calcularMedia(estudante.getNotas()) > mediaMinima)
                .collect(Collectors.toList());
    }

    // Método para exibir as notas de todos os estudantes
    public void exibirNotas() {
        notasPorEstudante.forEach((nome, notas) -> {
            System.out.println("Estudante: " + nome + ", Notas: " + notas + ", Média: " + calcularMedia(notas));
        });
    }
}
