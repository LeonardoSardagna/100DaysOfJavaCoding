# Revisão de conceitos de Java

Este README documenta os conceitos revisados sobre estruturas de controle e operadores lógicos em Java, incluindo
condicionais `if`, `if-else`, `else`, e os conectivos lógicos `&&` e `||`.

## Conceitos Revisados

### 1. Condicionais `if`, `if-else`, `else`

- **`if`**: Estrutura de decisão usada para executar um bloco de código se uma condição específica for verdadeira.
- **`if-else`**: Usado para tratar duas possibilidades, onde uma ação é executada se a condição for verdadeira (`if`) e
  outra se for falsa (`else`).
- **`else if`**: Permite adicionar condições adicionais ao fluxo, criando uma sequência de verificações.

**Exemplo:**

```java```
int numero = 10;

if (numero > 0) {
System.out.println("O número é positivo.");
} else if (numero < 0) {
System.out.println("O número é negativo.");
} else {
System.out.println("O número é zero.");
}

### 2. Operadores Lógicos

Operadores lógicos permitem combinar ou modificar condições:

- && (E lógico): Utilizado para garantir que ambas as condições precisam ser verdadeiras para que o bloco de código seja
  executado.
- || (OU lógico): Usado para cenários onde pelo menos uma das condições deve ser verdadeira para que o bloco de código
  seja executado.

#### Tabela Verdade:

Para o operador &&:

- true && true = true
- true && false = false
- false && true = false
- false && false = false

Para o operador ||:

- true || true = true
- true || false = true
- false || true = true
- false || false = false