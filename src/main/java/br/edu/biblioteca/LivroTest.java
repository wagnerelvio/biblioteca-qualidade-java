
package br.edu.biblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    @Test
    void deveEmprestarLivroDisponivel() {
        Livro livro = new Livro("Java POO");

        assertTrue(livro.emprestar());
        assertFalse(livro.isDisponivel());
    }

    @Test
    void naoDeveEmprestarDuasVezes() {
        Livro livro = new Livro("Engenharia de Software");

        assertTrue(livro.emprestar());
        assertFalse(livro.emprestar());
    }

    @Test
    void deveDevolverLivroEmprestado() {
        Livro livro = new Livro("Qualidade de Software");

        livro.emprestar();

        assertTrue(livro.devolver());
        assertTrue(livro.isDisponivel());
    }
}
