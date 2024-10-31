# Revisão sobre Construtor, modificadores de acesso e encapsulamento

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