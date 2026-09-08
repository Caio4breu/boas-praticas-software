# boas-praticas-software

Projeto Java desenvolvido para a atividade prática de Normas de Configuração de Software e Boas Práticas (SENAI FATESG).

## Questão final

1. Qual era o principal problema do código original?
O código original concentrava toda a lógica dentro do método `main`, e se utilizando de nomes pouco descritivos para as variáveis (`n`, `a`, `b`, `c`). Isso dificulta a compreensão do que cada parte do código fazia sem a necessidade de analisar linha por linha, além de misturar cálculo, decisão e apresentação de resultado em um único bloco.

1. Quais melhorias você realizou?
Renomeei as variáveis para nomes descritivos (`nomeAluno`, `provaN1`, `provaN2`, `media`), substituí o número mágico `6` por uma constante nomeada (`mediaMinima`) e dividi o código em três métodos com responsabilidade única: `calcularMedia`, `verificarSituacao` e `apresentarResultado`. O `main` passou a apenas orquestrar as chamadas, sem conter lógica de negócio.

1. Como a modularização facilitou a organização do código?
Cada método passou a ter uma única responsabilidade bem definida, o que tornou o código mais fácil de ler, testar e modificar isoladamente. Se for necessário alterar a regra de aprovação, por exemplo, a mudança fica restrita ao método `verificarSituacao`, sem risco de afetar o cálculo da média ou a exibição do resultado.

1. Como o Git ajudou a controlar as alterações realizadas no sistema?
O Git permitiu registrar a versão inicial do sistema antes das melhorias e desenvolver a refatoração em uma branch separada (`melhoria-boas-praticas`), sem afetar a versão estável na `main`. Isso possibilitou comparar as mudanças através do Pull Request antes de integrá-las definitivamente, mantendo um histórico claro da evolução do código.