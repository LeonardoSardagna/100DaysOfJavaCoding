# Estudo do Dia

Hoje, o objetivo foi revisar os assuntos que estudei ao longo da semana e colocar em prática os conceitos com alguns exercícios.

## Conceitos Revisados

Os principais tópicos revisados foram:

- Conceitos básicos de Java, como IDE, JRE, JDK, classes e objetos.
- Manipulação de entrada e saída, conversão de valores e convenções de nomenclatura.
- Estruturas de controle e operadores lógicos.
- Estruturas de repetição como `switch`, `while` e `for`.

---

## Exercícios Realizados

### 1. Conceitos Básicos de Java

**Exercício 1: Classe Produto e Cálculo de Desconto**
- Crie uma classe `Produto` com os atributos `nome`, `preco` e `desconto`. Adicione um método que calcule o preço final após aplicar o desconto. Crie uma lista de produtos e exiba o preço final de cada um.

**Exercício 2: Validação de Cadastro**
- Crie uma classe `Usuario` com atributos como `nome`, `idade`, `email` e `senha`. Ao tentar criar um novo usuário, valide a idade para garantir que o usuário tenha pelo menos 18 anos e verifique se a senha possui ao menos 8 caracteres e contém um caractere especial. Caso essas condições não sejam atendidas, mostre uma mensagem de erro e peça para o usuário tentar novamente.

### 2. Manipulação de Entrada e Saída, Conversão e Convenções de Nomenclatura

**Exercício 1: Calculadora de Juros Compostos**
- Crie um programa que calcule o montante final em uma aplicação de juros compostos, recebendo o valor inicial, a taxa de juros anual e o período em anos. Faça a conversão e formatação da entrada para exibir o resultado final com duas casas decimais, usando o método `String.format()`.

**Exercício 2: Conversão e Manipulação de Listas**
- Crie um programa que leia uma sequência de números inteiros inseridos pelo usuário (utilizando `Scanner` e `nextLine` para capturar uma linha inteira) e armazene-os em uma lista. Em seguida, converta a lista para um array de `int` e exiba a média dos valores da sequência.

### 3. Estruturas de Controle e Operadores Lógicos

**Exercício 1: Validação de Login e Sistema de Tentativas**
- Crie um programa que simule um sistema de login onde o usuário tem 3 tentativas para inserir a senha correta. Utilize uma estrutura `if-else` para verificar a senha e operadores lógicos para contar as tentativas. Após 3 tentativas incorretas, bloqueie o acesso.

**Exercício 2: Sistema de Aprovação de Crédito**
- Escreva um programa que simule um sistema de aprovação de crédito. Solicite ao usuário informações como renda mensal e valor solicitado. Verifique se o valor solicitado é até 5 vezes a renda mensal e exiba uma mensagem se o crédito foi aprovado ou negado. Use operadores lógicos para verificar condições adicionais, como idade mínima de 21 anos e histórico de inadimplência (sim/não).

### 4. Estruturas de Repetição (switch, while, for)

**Exercício 1: Cálculo de Fatorial e Exibição de Sequência**
- Crie um programa que calcule o fatorial de um número fornecido pelo usuário usando um loop `for`. Em seguida, exiba a sequência de números de 1 até o número fornecido e seus respectivos fatoriais (1! = 1, 2! = 2, etc.).

**Exercício 2: Controle de Temperatura**
- Crie um programa que peça ao usuário para inserir a temperatura diária por 7 dias. Armazene os valores em um array, e depois use um loop `while` para calcular a média da temperatura da semana. Em seguida, exiba as temperaturas que estiveram acima da média.

---

## Projeto Final: Sistema de Gerenciamento de Biblioteca

**Descrição:**  
Desenvolva um sistema de gerenciamento de biblioteca, com as seguintes funcionalidades:

1. **Cadastro de Livros**: Permita ao usuário cadastrar livros informando o título, o autor, o ano de publicação e o status (`disponível` ou `emprestado`). O sistema deve validar que o título e o autor sejam preenchidos e que o ano de publicação seja um valor positivo.

2. **Empréstimo de Livros**: Permita ao usuário buscar um livro pelo título e, caso esteja disponível, marcar como `emprestado`. Se o livro já estiver emprestado, exiba uma mensagem informando que o livro não está disponível.

3. **Devolução de Livros**: Permita ao usuário buscar um livro pelo título e marcar como `disponível` caso ele esteja emprestado.

4. **Exibição de Livros Disponíveis**: Exiba uma lista de todos os livros com o status `disponível`.

5. **Exibição de Todos os Livros**: Exiba todos os livros cadastrados com todas as informações.

**Requisitos:**
- Utilize uma lista para armazenar objetos `Livro`.
- Implemente um menu para permitir que o usuário escolha entre as operações.
- Adicione validações para garantir que títulos e autores não estejam em branco, e valide o ano de publicação.
- Permita que o sistema funcione até que o usuário escolha a opção de sair.

---

Obs: pedi para o ChatGTP criar os exercícios e corrigir depois de finalizado.