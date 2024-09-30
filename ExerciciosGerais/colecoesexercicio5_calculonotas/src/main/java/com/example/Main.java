package com.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando o sistema de notas
        SistemaNotas sistemaNotas = new SistemaNotas();

        // Adicionando notas dos estudantes
        sistemaNotas.adicionarNotas("Alice", Arrays.asList(7.5, 8.0, 9.0));
        sistemaNotas.adicionarNotas("Bob", Arrays.asList(6.0, 7.0, 5.5));
        sistemaNotas.adicionarNotas("Charlie", Arrays.asList(8.5, 9.0, 9.5));
        sistemaNotas.adicionarNotas("Diana", Arrays.asList(4.0, 5.0, 6.0));

        // Exibindo notas e médias de todos os estudantes
        sistemaNotas.exibirNotas();

        // Filtrando alunos com média acima de 7.0
        System.out.println("\nAlunos com média acima de 7.0:");
        List<Estudante> alunosFiltrados = sistemaNotas.filtrarAlunosComMediaAcima(7.0);
        alunosFiltrados.forEach(aluno -> 
            System.out.println("Estudante: " + aluno.getNome() + ", Média: " + sistemaNotas.calcularMedia(aluno.getNotas()))
        );
    }
}
