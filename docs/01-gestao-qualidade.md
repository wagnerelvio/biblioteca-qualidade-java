# 01 — Gestão da qualidade no desenvolvimento de software

## Objetivo
Organizar práticas, responsabilidades e evidências de qualidade durante o desenvolvimento do projeto didático **Biblioteca Qualidade Java**. Este documento corresponde à Seção 3.1 do material de Engenharia de Software (Unidade 3).

## Conceitos fundamentais

Qualidade não é sinônimo de perfeição. O nível de qualidade esperado deve ser definido em termos de requisitos e critérios verificáveis. A gestão da qualidade combina **pessoas, processos e ferramentas**, abrangendo o planejamento do produto e do processo que será empregado para construí-lo.

O material apresenta quatro níveis de documentação de um sistema de gestão da qualidade:

1. **Manual de qualidade:** políticas e compromissos gerais.
2. **Métodos e processos:** etapas e responsabilidades de desenvolvimento.
3. **Checklists e modelos:** instrumentos padronizados de execução e revisão.
4. **Registros e evidências:** documentos de validação, resultados de testes e histórico de mudanças.

## Práticas adotadas neste repositório

| Prática | Aplicação | Evidência esperada |
|---|---|---|
| Requisitos verificáveis | Definir comportamento de empréstimo e devolução | `requisitos.md` |
| Organização por responsabilidade | Separar `Livro`, `Usuario` e `Emprestimo` | Código em `src/main/java` |
| Encapsulamento | Manter `disponivel` privado e alterá-lo por métodos controlados | `Livro.java` |
| Revisão de código | Verificar legibilidade, regras e tratamento de erros antes de integrar | Revisão de Pull Request |
| Verificação e validação | Conferir especificação e comportamento esperado | Casos de teste documentados |
| Registro de resultados | Anotar resultados e defeitos observados | `relatorio-testes.md` |

## Exemplo: classe `Livro`

```java
public class Livro {
    private String titulo;
    private boolean disponivel;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.disponivel = true;
    }

    public boolean emprestar() {
        if (!disponivel) return false;
        disponivel = false;
        return true;
    }

    public boolean devolver() {
        if (disponivel) return false;
        disponivel = true;
        return true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
```

> No projeto Maven proposto, adicionar `package br.edu.biblioteca;` no início das classes guardadas em `src/main/java/br/edu/biblioteca/`.

Atributos privados e métodos com regras explícitas permitem controlar mudanças de estado. Isso **contribui** para a qualidade, mas não substitui testes, revisão e validação com usuários.

## Responsabilidades

- **Equipe de desenvolvimento:** codificar conforme os requisitos e realizar testes iniciais.
- **Revisor:** examinar alterações, identificar defeitos e registrar recomendações.
- **Responsável por testes:** manter os casos de teste e registrar resultados.
- **Representante do usuário:** confirmar se as operações atendem às necessidades previstas.

Em atividades individuais, uma mesma pessoa pode assumir mais de um papel, desde que as evidências sejam registradas.

## Checklist de revisão da implementação

- [ ] O comportamento pretendido está descrito em um requisito?
- [ ] Classes e métodos têm nomes compreensíveis?
- [ ] Os atributos críticos estão protegidos contra alterações indevidas?
- [ ] Cada classe possui responsabilidades claras?
- [ ] Existem verificações para situações inválidas?
- [ ] Os testes correspondentes foram previstos ou implementados?
- [ ] As alterações foram documentadas?

## Atividade didática

Analise `Livro.java` e responda:

1. O que impede um segundo empréstimo do mesmo exemplar?
2. Qual a vantagem de manter `disponivel` como atributo privado?
3. Que requisitos precisam estar documentados para permitir a avaliação da qualidade?
4. Que defeitos poderiam aparecer caso a mudança de disponibilidade fosse feita sem método controlado?

**Entrega:** checklist preenchido, indicação de pelo menos uma melhoria e evidência da revisão do código.

## Referência ao material-base

*LIVRO_UNICO-EDS*, Unidade 3, Seção 3.1, **A gestão da qualidade no processo de desenvolvimento de software**, pp. 111–122.
