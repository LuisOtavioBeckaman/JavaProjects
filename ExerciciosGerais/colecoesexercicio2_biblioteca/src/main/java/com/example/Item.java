package main.java.com.example;

public class Item<T> {
    private String titulo;

    public Item(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Item: " + titulo;
    }
}

