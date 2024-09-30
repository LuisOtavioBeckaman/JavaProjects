package com.example;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String cpf;
    private List<ItemBiblioteca> itensEmprestados;

    // Construtor
    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.itensEmprestados = new ArrayList<>();
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    // Métodos para emprestar e devolver itens
    public void emprestarItem(ItemBiblioteca item) {
        itensEmprestados.add(item);
        item.emprestar();
    }

    public void devolverItem(ItemBiblioteca item) {
        if (itensEmprestados.remove(item)) {
            System.out.println(item.getTitulo() + " foi devolvido.");
        } else {
            System.out.println("Item não encontrado na lista de empréstimos.");
        }
    }

    public List<ItemBiblioteca> getItensEmprestados() {
        return itensEmprestados;
    }
}
