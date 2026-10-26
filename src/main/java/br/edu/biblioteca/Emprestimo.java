
package br.edu.biblioteca;

public class Emprestimo {

    public void registrar(int dias) {
        try {
            if (dias <= 0) {
                throw new IllegalArgumentException(
                    "Prazo deve ser positivo."
                );
            }

            System.out.println("Empréstimo registrado.");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
