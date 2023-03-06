	O que é relacionamento entre classes?

- Ela é o que diz como os objetos se comunicam entre si e como trocam mensagens.
- Serve para quando tem relações com bancos de dados, pois os bd tem relações elas não podem ser quebradas e tudo se reflete no Java.
- Em UML as mesmas tabelas podem ter relações alteradas dependendo da regra de negócio
- A cardinalidade deve ser observada para ver a forma que vai ser implementado no Java


	As relações são: 

- Associação ------> *TEM* ou *SABE* == é sempre *UNILATERAL. DESCREVE UMA CONEXÃO ENTRE OBJETOS*. Classe A conhece classe B, mas classe B não conhece classe A.
Ex: Uma pessoa sabe seu endereço, mas o endereço não sabe quem mora lá.
Uma faz sentido sem a outra, mas a outra não faz sentido sem a uma.<br>
Um tem o outro ou sabe do outro.

- Agregação ------<> Losango vazio: *FAZ PARTE DE* == quando a classe não apenas *POSSUI* ou *CONHECE A OUTRA* mas também *FAZ PARTE* dela. Ex: Uma bicicleta tem pneu,
mas o pneu dela pode ser usado em um triciclo. Os elementos - objetos - existem e podem ser usados para a construção de outra classe, mesmo que a classe original seja destruída.
Uma faz sentido sem a outra e a outra faz sentido sem a uma.<br>
Existem sozinhos, mas formam um todo.

- Composição -----< o > Losango preenchido: *SEM O TODO QUANDO UMA CLASSE É COMPOSTA POR OUTRA CLASSE*. É o caso em que uma classe de Objeto A "possui"
uma classe de Objeto B, e B não tem como existir sem A Ex: Uma pessoa é feita de órgãos.<br>
Uma não faz sentido sem a outra.


Onde ficam as relações no JAVA?

- Nos parâmetros, nos construtores ou nos atributos.


> Written with [StackEdit](https://stackedit.io/).
