package com.example;

public class Biblioteca {
    public static void main(String[] args) {
        // Criar alguns itens
        Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes");
        Revista revista = new Revista("Revista Ciência Hoje", "Vários Autores");
        MaterialEletronico materialEletronico = new MaterialEletronico("Curso de Java", "Autor X");

        // Criar usuário
        Usuario usuario = new Usuario("João Silva", "123.456.789-10");

        // Empréstimo de itens
        usuario.emprestarItem(livro);
        usuario.emprestarItem(revista);
        usuario.emprestarItem(materialEletronico);

        // Devolver um item
        usuario.devolverItem(revista);

        // Reservar um livro
        livro.reservar();

        // Exibir histórico de empréstimos (implementado de acordo com suas necessidades)
        HistoricoEmprestimos historico = new HistoricoEmprestimos();
        historico.adicionarAoHistorico("Livro 'Dom Quixote' emprestado.");
        historico.adicionarAoHistorico("Revista 'Ciência Hoje' emprestada.");
        historico.adicionarAoHistorico("Material Eletrônico 'Curso de Java' emprestado.");
        historico.adicionarAoHistorico("Revista 'Ciência Hoje' devolvida.");

        historico.mostrarHistorico();
    }
}
