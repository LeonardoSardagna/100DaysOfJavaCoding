# Revisão sobre Construtor, modificadores de acesso, encapsulamento e funções

## **Construtor**

Toda classe já vem com um construtor básico, mesmo que vazio. O construtor serve para inicializar o objeto quando ele é
criado.

## Modificadores de Acesso

Ajudam a definir quem pode ver e usar classes, métodos e atributos. São essenciais para proteger o
código.

- public: qualquer parte do programa pode acessar.
- default (sem palavra-chave): acesso apenas para quem está no mesmo pacote.
- private: super restrito, acessível só dentro da própria classe.
- protected: acesso para quem está no mesmo pacote ou em subclasses.

## Encapsulamento

A ideia é proteger os dados, deixando-os acessíveis apenas por métodos específicos. Por exemplo, em vez de o
motorista mudar diretamente a velocidade do carro, ele usa um método chamado “acelerar”.
Isso deixa o código mais organizado, fácil de alterar e com menos chance de erro.

## Função Recursiva

É uma função que chava a si mesma para resolver problemas menores de um tarefa maior
Para evitar chamadas infinitas é essencial definir uma condição de parada,
onde a função deixa de se chamar.

Exemplo:

``` java
public static int fatorial(int num){
    if(num == 0){
    return 1;
    }
    
    if(num < 0){
    throw new IllegalArgumentException("Não pode negativo");
    }
    
    return num * fatorial(num-1);
}
```

## Função Sobrecarga

É quando criamos várias versões de uma mesma função com assinaturas diferentes,
ou seja, eles tem o mesmo nome, mas aceita tipos ou quantidade diferentes de parâmetro.