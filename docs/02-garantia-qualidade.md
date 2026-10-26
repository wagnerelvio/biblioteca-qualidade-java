# 02 — Garantia da qualidade do software (SQA)

## Objetivo
Planejar e executar verificações que aumentem a confiança na qualidade do projeto **Biblioteca Qualidade Java**. Conteúdo associado à Seção 3.2 da Unidade 3.

## O que é SQA?

A Garantia da Qualidade do Software (*Software Quality Assurance*) consiste em ações planejadas e sistemáticas realizadas ao longo do desenvolvimento para verificar a conformidade de **processos e produtos**. Não significa prometer software completamente livre de defeitos.

O material destaca três grupos de atividades:

1. **Aplicação de métodos técnicos:** analisar especificações, projeto e protótipos desde o início.
2. **Revisões técnicas formais:** examinar artefatos para detectar discrepâncias.
3. **Testes de software:** exercitar o programa com casos escolhidos e avaliar seus resultados.

As quatro etapas de teste indicadas no livro são **planejamento, projeto dos casos de teste, execução e avaliação dos resultados**.

## Funcionalidades e resultados esperados

| ID | Situação | Resultado esperado |
|---|---|---|
| CT-01 | Criar novo livro | Livro começa disponível |
| CT-02 | Emprestar livro disponível | `emprestar()` retorna `true` e livro fica indisponível |
| CT-03 | Emprestar o mesmo livro novamente | `emprestar()` retorna `false` |
| CT-04 | Devolver livro emprestado | `devolver()` retorna `true` e livro fica disponível |
| CT-05 | Devolver livro que já está disponível | `devolver()` retorna `false` |
| CT-06 | Registrar empréstimo com prazo positivo | Mensagem de sucesso no exemplo demonstrativo |
| CT-07 | Registrar empréstimo com prazo zero ou negativo | Entrada rejeitada e mensagem de erro no exemplo demonstrativo |

**Limitação da versão didática:** o método `Emprestimo.registrar(int dias)` apresentado inicialmente apenas valida o prazo e emite mensagem. Ele **não** registra persistência, datas nem associação entre `Usuario` e `Livro`. Os testes não devem afirmar que essas funcionalidades já existem.

## Exemplo de validação e tratamento de exceções

```java
public class Emprestimo {
    public void registrar(int dias) {
        try {
            if (dias <= 0) {
                throw new IllegalArgumentException("Prazo deve ser positivo.");
            }
            System.out.println("Empréstimo registrado.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
```

**Ponto de atenção:** capturar a exceção dentro de `registrar` permite demonstrar `try-catch`, mas dificulta testes automatizados que esperam uma exceção. Para uma evolução do projeto, recomenda-se separar a **validação da regra de negócio** da **apresentação da mensagem**, de modo que o comportamento possa ser testado diretamente.

## Exemplo: teste unitário com JUnit 5

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LivroTest {
    @Test
    void naoDeveEmprestarDuasVezes() {
        Livro livro = new Livro("Engenharia de Software");
        assertTrue(livro.emprestar());
        assertFalse(livro.emprestar());
        assertFalse(livro.isDisponivel());
    }
}
```

No repositório com Maven, acrescente `package br.edu.biblioteca;` aos arquivos de código e de teste dentro dos diretórios correspondentes.

## Execução de testes no Eclipse e no Maven

1. Importe o projeto por **File > Import > Maven > Existing Maven Projects**.
2. Confirme que o JDK e o JUnit 5 estão configurados no `pom.xml`.
3. Execute `LivroTest.java` com **Run As > JUnit Test**.
4. Alternativamente, na raiz do projeto, execute:

```bash
mvn clean test
```

5. Registre no arquivo `relatorio-testes.md` o ambiente, a data, os casos executados, resultados e defeitos identificados.

## Checklist SQA

- [ ] Requisitos e comportamentos esperados descritos.
- [ ] Casos válidos e inválidos contemplados.
- [ ] Revisão de código realizada.
- [ ] Testes automatizados preparados.
- [ ] Resultados efetivamente executados registrados.
- [ ] Falhas reproduzíveis identificadas e documentadas.
- [ ] Correções verificadas novamente após alteração.

## Atividade didática

Implemente um teste para `devolver()` e outro para a tentativa de devolver um livro já disponível. Execute os testes, registre os resultados e explique a diferença entre **testar o produto** e **garantir a qualidade do processo**.

## Referência ao material-base

*LIVRO_UNICO-EDS*, Unidade 3, Seção 3.2, **A garantia da qualidade do software**, pp. 123–134.
