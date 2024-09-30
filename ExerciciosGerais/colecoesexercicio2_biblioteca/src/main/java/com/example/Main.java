package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando a biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criando usuários
        Usuario usuario1 = new Usuario("Carlos");
        Usuario usuario2 = new Usuario("Ana");

        // Criando livros
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro3 = new Livro("1984", "George Orwell");
        Livro livro4 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");

        // Lista de todos os livros na biblioteca
        List<Livro> todosOsLivros = new ArrayList<>();
        todosOsLivros.add(livro1);
        todosOsLivros.add(livro2);
        todosOsLivros.add(livro3);
        todosOsLivros.add(livro4);

        // Adicionando empréstimos
        biblioteca.adicionarEmprestimo(usuario1, livro1);
        biblioteca.adicionarEmprestimo(usuario2, livro2);

        // Listando empréstimos de cada usuário
        biblioteca.listarEmprestimos(usuario1);
        biblioteca.listarEmprestimos(usuario2);

        // Exibindo livros disponíveis para empréstimo
        biblioteca.exibirLivrosDisponiveis(todosOsLivros);

        // Removendo um empréstimo
        biblioteca.removerEmprestimo(usuario1, livro1);
        System.out.println("\nApós remoção do empréstimo de Carlos:");
        biblioteca.listarEmprestimos(usuario1);

        // Exibindo livros disponíveis novamente
        biblioteca.exibirLivrosDisponiveis(todosOsLivros);
    }
}
