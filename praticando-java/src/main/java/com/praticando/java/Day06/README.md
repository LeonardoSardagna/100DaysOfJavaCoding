# Revisão de conceitos de Java

Documenta os conceitos revisados sobre constantes, vetores e ArrayList em Java.

## Conceitos Revisados

### 1. Constantes

- **Constantes**: São variáveis cujo valor não pode ser alterado após a sua inicialização. Elas são declaradas usando a palavra-chave `final`, o que ajuda a evitar modificações acidentais.

**Exemplo:**

final int MAX_IDADE = 100;

### 2. Vetores

- **Vetores**: Estruturas de dados que armazenam múltiplos valores do mesmo tipo em uma única variável. Os elementos são acessados por meio de índices, que começam em 0.

Exemplo:

int[] numeros = {1, 2, 3, 4, 5};

System.out.println(numeros[0]); // Saída: 1

### 3. ArrayList

- **ArrayList**: Uma implementação da interface List que permite armazenar elementos dinamicamente. Diferente dos arrays, o ArrayList pode crescer e encolher de tamanho conforme necessário.

Exemplo:

ArrayList<String> frutas = new ArrayList<>();

frutas.add("Maçã");

frutas.add("Banana");

System.out.println(frutas.get(0)); // Saída: Maçã