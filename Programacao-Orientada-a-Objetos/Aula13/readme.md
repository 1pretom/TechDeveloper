    aula 13
## Interfaces
Herança, classe abstrata e interfaces são muito parecidas, por isso é comum haverem confusões.<br>
Interface é uma classe de métodos que não fazem nada, só escreve um contrato, quando implementa a interface, obrigatóriamente é preciso sobrescrever o método.<br>
A principal diferença é que na classe abstrata dá pra ter métodos sem obrigatoriedade de filho sobrescrever e implementar, já na interface é sempre obrigatório, é como um contrato que deve ser seguido, ela é única e exclusivamente para implementar métodos. <br>
Deve-se usar a interface quando um agrupamento de classes tem o mesmo comportamento/ação/método.<br>
Não existe herança multipla, mas pode-se implementar quantas interfaces quiser, justamente pelo fato dela ser só de métodos.
#### Diferenças entre Interface e Classe Abstrata
|Característica|Interface|Classe Abstrata  |
|-|-|-|
|Herança múltipla|Uma classe pode implementar diversas interfaces|Uma classe pode herdar somente uma classe|
|Implementação Padrão|Uma interface não pode contar qualquer tipo de código, muito menos código padrão.|Uma classe abstrata pode fornecer código completo, código padrão ou ter apenas adeclaração de seu esqueleto para ser posteriormente sobrescrita.|