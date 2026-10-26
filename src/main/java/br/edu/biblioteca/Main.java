
package br.edu.biblioteca;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("Engenharia de Software");
        Usuario usuario = new Usuario("Ana", "2026001");

        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Livro: " + livro.getTitulo());

        System.out.println("Disponível: "
                + livro.isDisponivel());

        System.out.println("Emprestar: "
                + livro.emprestar());

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.registrar(7);
        emprestimo.registrar(-2);
    }
}
