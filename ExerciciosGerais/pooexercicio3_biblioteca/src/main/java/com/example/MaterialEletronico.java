package com.example;

public class MaterialEletronico extends ItemBiblioteca {
    public MaterialEletronico(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public void emprestar() {
        System.out.println("O material eletrônico '" + titulo + "' foi emprestado por 7 dias.");
    }
}
