package com.example;

public class Main {
    public static void main(String[] args) {
        // List :
        ListExemplo list = new ListExemplo();
        list.addList("Maria");
        list.addList("João");
        list.addList("Ronaldinho");
        list.addList("rezende");

        list.listarNomes();

        list.atualizarNome("rezende", "Rochele");

        list.listarNomes();

        list.removerNomes("Rochele");

        list.listarNomes();

        // ===============XX==================
        // Set :
        SetExemplo set = new SetExemplo();
        set.addList("Maria");
        set.addList("João");
        set.addList("Ronaldinho");
        set.addList("rezende");

        set.listarNomes();

        set.removerNomes("rezende");

        set.listarNomes();
        // ===============XX==================
        // Map :
        MapExemplo map = new MapExemplo();

        map.addNomeIdade("João", 15);
        map.addNomeIdade("rezende", 19);
        map.addNomeIdade("Paulo", 19);

        map.listarNomesIdade();

        map.modificarValor("rezende", 30);

        map.listarNomesIdade();

        map.removerNomeIdade("Paulo");

        map.listarNomesIdade();
    }
}