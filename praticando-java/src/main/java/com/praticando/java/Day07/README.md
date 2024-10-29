# Explorando Estruturas de Dados e Coleções em Java

Hoje dei uma aprofundada em algumas das estruturas de dados e coleções mais usadas em Java, como ArrayList, LinkedList,
Map, HashMap, Set, HashSet, TreeSet e LinkedHashSet.

## ArrayList

ArrayList é uma lista que cresce e encolhe conforme você adiciona ou remove itens.

### Características:

- Mantém a ordem de inserção dos itens.
- Permite duplicatas.
- Rápido para acessar itens, mas lento para inserir/remover no meio.
- Quando Usar: Use se a ordem dos itens importa e você não precisa mudar muito os elementos no meio da lista.

## LinkedList

LinkedList é uma lista onde cada item sabe quem está antes e depois dele (como uma corrente).

### Características:

- Também mantém a ordem de inserção.
- Permite duplicatas.
- Melhor para inserir/remover no meio, mas um pouco mais lento para acessar itens diretamente.
- Quando Usar: Boa escolha se você precisa inserir ou remover muitos itens no meio da lista e a ordem é importante.

## Map e HashMap

### Map

Interface que armazena dados em pares chave-valor (tipo um dicionário).

### HashMap:

Implementa Map e usa uma tabela de hash para guardar os pares chave-valor.

### Características:

- Não mantém a ordem de inserção.
- Chaves são únicas (não se repetem), mas valores podem ser iguais.
- Rápido para procurar ou adicionar pares.
- Quando Usar: Ideal quando você quer associar chaves a valores e não liga para a ordem dos itens.

## Set e HashSet

### Set

Interface que representa um conjunto sem itens duplicados.

### HashSet:

Implementa Set usando uma tabela de hash.

### Características:

- Não mantém ordem.
- Não permite duplicatas.
- Rápido para adicionar e verificar itens.
- Quando Usar: Bom para guardar itens únicos quando a ordem não importa.

## TreeSet

Implementa Set e organiza os itens em uma árvore de pesquisa.

### Características:

- Mantém os itens em ordem.
- Não permite duplicatas.
- Um pouco mais lento que HashSet porque organiza os itens.
- Quando Usar: Use se precisa de itens únicos e quer mantê-los ordenados.

## LinkedHashSet

Combina HashSet com uma lista ligada para manter a ordem de inserção.

### Características:

- Mantém a ordem em que os itens foram adicionados.
- Não permite duplicatas.
- Quando Usar: Quando você quer guardar itens únicos e preservar a ordem de inserção.