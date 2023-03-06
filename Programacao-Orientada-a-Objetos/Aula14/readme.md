    Aula14
# Collections

É um agrupamento de objetos/itens utilizado quando tem uma relação de **1 p n** ou **n p n** independente do tipo de relacionamento que estamos usando. <br>
Os mais usados são:
- set-list
- array ou ArrayList (array é estático, ArrayList é dinâmico)
- maps

O que devemos usar é o que se encaixar melhor no problema que tivermos pra resolver, mas de uma forma geral, a performance deles é praticamente a mesma.

## Array vs. Coleções

|  | Array | Coleções |
|-|-|-|
| Estrutura|Estática|Dinâmica|
|Tipos de dados|Usa os tipos primitivos | Você deve usar as classes Integer, Float, Double |
|Longitude |`nomes.lenght`|`nomes.size()` |
|Como obter um valor|`nomes[2]`|`nomes.get(2)` |
|Como estabelecer um valor|`nomes[2]="Carlos"`|`nomes.set(2)` |
|Iniciar um elemento| Não é possível | `nomes.add("Juan")`|
|Como remover um elemento|Não é possível|`nomes.remove("Juan")`|
|Acesso a um elemento fora do limite estabelecido|Consegue trabalhar com erros exceções|Não traz erro|
|Ordenamento|Não pode|Pode|

> Traduzindo, a coleção é a evolução de um Array. Por isso é melhor utilizar elas invés de arrays, para podermos ter melhor manutenção e evitar bugs. As arrays servem para quando se tem exatamente a quantidade de posições e o conteúdo delas for pra ser imutável. Quando se usa uma Collection não se tem os valores exatos, então pode-se alterar posteriormente e ordenar.

- Só é possível ordernar uma lista quando tem o  `compareTo` na classe