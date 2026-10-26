# 03 — Normas e modelos de qualidade de software

## Objetivo
Relacionar as normas e os modelos discutidos na Seção 3.3 com práticas verificáveis do projeto **Biblioteca Qualidade Java**.

## Normas e modelos abordados no material

| Referência | Foco | Possível aplicação didática |
|---|---|---|
| ISO 9001:2015 | Sistema de gestão da qualidade | Requisitos, procedimentos e registros de melhoria |
| ISO/IEC 90003:2014 | Orientações para aplicar a ISO 9001 a software | Organização das atividades de desenvolvimento e manutenção |
| ISO/IEC 25010:2011 | Características de qualidade do produto e qualidade em uso | Critérios de avaliação das classes e funcionalidades |
| CMMI (versão 1.3 abordada no livro) | Capacidade e maturidade dos processos | Planejamento, revisão, medição e melhoria de processos |
| MPS.BR (modelo apresentado no livro) | Melhoria de processos considerando o contexto brasileiro | Adoção gradual de processos documentados e controlados |

**Nota sobre versões:** a tabela mantém as versões e a apresentação presentes no material didático. Elas são referências históricas do livro e não constituem verificação das edições mais recentes em vigor.

## Aplicação da ISO/IEC 25010 ao projeto

O material apresenta oito características da qualidade do produto e cinco características da qualidade em uso. A atividade abaixo seleciona características relevantes ao estágio atual do projeto, **sem alegar certificação ou conformidade integral com a norma**.

| Característica | Critério observável | Evidência esperada | Situação inicial |
|---|---|---|---|
| Adequação funcional | Não permitir segundo empréstimo do mesmo livro | CT-02 e CT-03 | A verificar |
| Confiabilidade | Rejeitar prazo de empréstimo inválido | CT-07 | A verificar |
| Usabilidade | Mensagens compreensíveis no console | Inspeção e avaliação por usuário | A verificar |
| Eficiência de desempenho | Tempo de execução aceitável para uma consulta | Medição com cenário definido | Não medido |
| Segurança | Restringir operações por perfil | Testes de autenticação/autorização | Não implementado |
| Compatibilidade | Integração com outro sistema | Teste de integração | Não implementado |
| Capacidade de manutenção | Classes com responsabilidades claras e testes simples | Revisão das classes e testes JUnit | A verificar |
| Portabilidade | Executar com JDK compatível em diferentes sistemas | Execução em dois ambientes | Não verificado |

### Qualidade em uso

As dimensões citadas no material são **efetividade, eficiência, satisfação, uso sem riscos e cobertura de contexto**. Para medi-las é necessário definir tarefas, usuários, ambientes e critérios de observação. A execução isolada de testes JUnit não é suficiente para demonstrá-las.

## Avaliação orientada por evidências

Para cada característica selecionada:

1. Defina o requisito ou a expectativa.
2. Estabeleça um critério observável e um procedimento de teste ou inspeção.
3. Execute a avaliação e registre o resultado.
4. Classifique como **atendido**, **não atendido** ou **não avaliado**.
5. Proponha uma correção e, se aplicável, repita a avaliação.

### Exemplo preenchível

| Campo | Registro |
|---|---|
| Característica | Adequação funcional |
| Requisito | Um livro indisponível não pode ser novamente emprestado |
| Método | Teste automatizado JUnit |
| Caso | CT-03 |
| Resultado esperado | `false` |
| Resultado obtido | **Preencher após execução** |
| Avaliação | **Não avaliado até execução** |

## CMMI e MPS.BR no contexto da disciplina

Os modelos de melhoria de processo ajudam a organizar o trabalho da equipe, e não se reduzem à sintaxe da linguagem Java. Como exercício, mantenha histórico de tarefas, registro de revisão, execução recorrente de testes e propostas de melhoria. **Não** atribua nível de maturidade à turma ou ao repositório sem avaliação formal apropriada.

## Questões para discussão

1. Por que um conjunto de testes aprovados não comprova todas as características da ISO/IEC 25010?
2. Como diferenciar uma melhoria no **produto** de uma melhoria no **processo**?
3. Em qual etapa do desenvolvimento convém definir critérios de qualidade? Por quê?
4. Que evidências concretas seriam necessárias para avaliar segurança e portabilidade neste projeto?

## Referência ao material-base

*LIVRO_UNICO-EDS*, Unidade 3, Seção 3.3, **As normas de qualidade aplicadas no desenvolvimento de software**, pp. 135–146. A ISO/IEC 25010 também é apresentada na Seção 3.2.
