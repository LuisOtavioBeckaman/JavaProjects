package com.example;

import java.util.ArrayList;
import java.util.List;

public class HistoricoEmprestimos {
    private List<String> historico;

    // Construtor
    public HistoricoEmprestimos() {
        historico = new ArrayList<>();
    }

    // Método para adicionar ao histórico
    public void adicionarAoHistorico(String registro) {
        historico.add(registro);
    }

    // Mostrar histórico completo
    public void mostrarHistorico() {
        System.out.println("Histórico de Empréstimos:");
        for (String registro : historico) {
            System.out.println(registro);
        }
    }
}
