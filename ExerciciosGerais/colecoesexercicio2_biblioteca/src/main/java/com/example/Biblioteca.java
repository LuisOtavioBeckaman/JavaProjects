package main.java.com.example;

import java.util.*;

public class Biblioteca {
    // Mapa que armazena usuários e seus respectivos empréstimos
    private Map<Usuario, List<Item<?>>> emprestimos = new HashMap<>();

    // Método para adicionar um empréstimo
    public void adicionarEmprestimo(Usuario usuario, Item<?> item) {
        emprestimos.computeIfAbsent(usuario, k -> new ArrayList<>()).add(item);
    }

    // Método para remover um empréstimo
    public void removerEmprestimo(Usuario usuario, Item<?> item) {
        List<Item<?>> itens = emprestimos.get(usuario);
        if (itens != null) {
            itens.remove(item);
        }
    }

    // Método para listar os empréstimos de um usuário
    public void listarEmprestimos(Usuario usuario) {
        List<Item<?>> itens = emprestimos.get(usuario);
        if (itens != null && !itens.isEmpty()) {
            System.out.println(usuario + " possui os seguintes empréstimos:");
            itens.forEach(System.out::println);
        } else {
            System.out.println(usuario + " não possui empréstimos.");
        }
    }

    // Método que filtra e exibe livros disponíveis para empréstimo
    public void exibirLivrosDisponiveis(List<Livro> todosOsLivros) {
        Set<Item<?>> itensEmprestados = new HashSet<>();
        
        // Coleta todos os itens emprestados
        emprestimos.values().forEach(itensEmprestados::addAll);

        System.out.println("Livros disponíveis para empréstimo:");
        todosOsLivros.stream()
                .filter(livro -> !itensEmprestados.contains(livro))
                .forEach(System.out::println);
    }
}
