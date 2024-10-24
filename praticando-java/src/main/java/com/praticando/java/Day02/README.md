## Revisão: Manipulação de Entrada e Saída, Conversão e Convenções de Nomenclatura

### 1. Classe String e o método `format()`

- O método `format()` da classe **String** facilita a formatação de números.
- Exemplo:
  ```java
  System.out.println("Digite seu peso: ");
  String peso = scanner.nextLine();
  double metadePeso = Double.parseDouble(peso) / 2;
  System.out.println("A metade do peso " + peso + " é " + metadePeso);

### 2. Scanner para Entrada de Dados

Outra coisa super útil que aprendi foi como usar o Scanner para deixar o usuário inserir dados enquanto o programa está
rodando. Com ele, conseguimos pegar diferentes tipos de dados, como:

    scanner.nextLine() para ler uma String.
    scanner.nextInt() para ler um int.
    scanner.nextDouble() para ler um double.

### 3. Conversão de Valores: parse vs. Casting

Quando você quer transformar uma String em um número, usa o método parse. Por exemplo:

    Integer.parseInt("123") transforma "123" em um int.
    Double.parseDouble("123.45") transforma "123.45" em um double.

Agora, se você quer converter de um tipo primitivo para outro, como transformar um double em int, você faz o famoso
casting:

double valor = 10.99; 

int valorInteiro = (int) valor;

### 4. Convenções de Nomenclatura

É super importante seguir as convenções de nomeação para manter o código organizado e fácil de ler. Aqui estão as
principais regras que aprendi:

    Pacotes: com.nomedaempresa
    Classes: NomeDaClasse
    Métodos: nomeDoMetodo()
    Variáveis: nomeDaVariavel
    Constantes: NOME_DA_CONSTANTE
    Objetos: nomeDoObjeto