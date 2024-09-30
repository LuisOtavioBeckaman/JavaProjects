package com.example;

public class Livro extends ItemBiblioteca implements Reservavel {
    private boolean reservado;

    public Livro(String titulo, String autor) {
        super(titulo, autor);
        this.reservado = false;
    }

    @Override
    public void emprestar() {
        System.out.println("O livro '" + titulo + "' foi emprestado por 14 dias.");
    }

    @Override
    public void reservar() {
        if (!reservado) {
            reservado = true;
            System.out.println("O livro '" + titulo + "' foi reservado.");
        } else {
            System.out.println("O livro '" + titulo + "' já está reservado.");
        }
    }

    // Método para verificar se o livro está reservado
    public boolean isReservado() {
        return reservado;
    }
}
