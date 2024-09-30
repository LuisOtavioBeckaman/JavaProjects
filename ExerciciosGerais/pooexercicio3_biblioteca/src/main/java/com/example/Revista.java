package com.example;

public class Revista extends ItemBiblioteca {
    public Revista(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public void emprestar() {
        System.out.println("A revista '" + titulo + "' foi emprestada por 7 dias.");
    }
}
