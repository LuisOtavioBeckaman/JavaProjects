package com.example;

import java.util.List;

public class Estudante {
    private String nome;
    private List<Double> notas;

    public Estudante(String nome, List<Double> notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getNotas() {
        return notas;
    }
}
