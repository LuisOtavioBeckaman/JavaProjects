package com.example;

public abstract class ItemBiblioteca {
    protected String titulo;
    protected String autor;

    public ItemBiblioteca(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Getter e Setter para encapsulamento
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método abstrato que será implementado pelas subclasses
    public abstract void emprestar();
}
