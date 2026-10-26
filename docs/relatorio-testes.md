# Relatório de testes — Biblioteca Qualidade Java

> **Modelo para preenchimento.** Nenhum resultado abaixo deve ser considerado executado ou aprovado antes de rodar os testes no projeto real. O arquivo documenta o **plano** e os campos para registrar evidências.

## 1. Identificação da execução

| Campo | Preencher |
|---|---|
| Projeto | Biblioteca Qualidade Java |
| Versão / commit | `________` |
| Responsável | `________` |
| Data e hora | `________` |
| Sistema operacional | `________` |
| JDK | `________` |
| Eclipse / Maven | `________` |
| Versão JUnit | `________` |
| Comando de execução | `mvn clean test` ou Run As > JUnit Test |

## 2. Escopo

Validar o comportamento das classes didáticas `Livro` e `Emprestimo`. A versão inicial de `Emprestimo` valida prazo e escreve mensagens no console; não armazena empréstimos nem identifica usuários.

## 3. Casos planejados

| ID | Classe / operação | Entrada ou condição | Resultado esperado | Obtido | Status |
|---|---|---|---|---|---|
| CT-01 | `new Livro(...)` | Título válido | `isDisponivel() == true` | Pendente | Não executado |
| CT-02 | `emprestar()` | Livro disponível | `true`; disponível passa a `false` | Pendente | Não executado |
| CT-03 | `emprestar()` | Livro já emprestado | `false` | Pendente | Não executado |
| CT-04 | `devolver()` | Livro emprestado | `true`; disponível passa a `true` | Pendente | Não executado |
| CT-05 | `devolver()` | Livro disponível | `false` | Pendente | Não executado |
| CT-06 | `registrar(7)` | Prazo positivo | Mensagem `Empréstimo registrado.` | Pendente | Não executado |
| CT-07 | `registrar(-2)` | Prazo inválido | Mensagem `Erro: Prazo deve ser positivo.` | Pendente | Não executado |

**Observação:** CT-06 e CT-07 exigem captura da saída do console para automação, ou registro de execução manual. Não estão cobertos pelo exemplo básico de `LivroTest`.

## 4. Registro de execução

```text
Data/hora:
Comando executado:
Total de testes executados:
Aprovados:
Falharam:
Ignorados:
Resumo do console:
```

Inclua aqui uma referência a captura de tela ou a um relatório gerado em `target/surefire-reports/` (não confundir com resultado já obtido).

## 5. Registro de defeitos

| ID defeito | Caso | Descrição | Passos para reproduzir | Prioridade | Estado |
|---|---|---|---|---|---|
| — | — | Preencher se houver | — | — | — |

Estados possíveis: **Aberto**, **Em correção**, **Corrigido**, **Verificado**.

## 6. Avaliação segundo a ISO/IEC 25010

| Característica | Evidência avaliada | Conclusão |
|---|---|---|
| Adequação funcional | CT-01 a CT-05 | Pendente |
| Confiabilidade | CT-06 e CT-07, análise de comportamento inválido | Pendente |
| Capacidade de manutenção | Revisão das classes e testes | Pendente |
| Segurança | Não implementada nessa versão | Não avaliada |
| Usabilidade | Avaliação de mensagens do console | Pendente |

Resultados de testes pontuais não implicam conformidade total com uma característica ou com a norma.

## 7. Conclusão e ações propostas

**Resumo do que foi observado:** preencher após executar.

**Limitações identificadas:** preencher após executar.

**Próximas melhorias sugeridas:**

- [ ] Associar empréstimos a livro, usuário e data.
- [ ] Separar regras de negócio e mensagens de apresentação.
- [ ] Adicionar testes de fronteira (prazo zero, devolução repetida).
- [ ] Adicionar testes de regressão após correções.
- [ ] Atualizar este relatório com evidências reais da execução.

## 8. Referências internas

- [01 — Gestão da qualidade](01-gestao-qualidade.md)
- [02 — Garantia da qualidade](02-garantia-qualidade.md)
- [03 — Normas de qualidade](03-normas-qualidade.md)

**Material-base:** *LIVRO_UNICO-EDS*, Unidade 3, Seções 3.1 a 3.3.
