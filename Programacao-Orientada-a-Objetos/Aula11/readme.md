    Aula 11

##Classe abstrata

Principais diferenças entre classe abstrata e classe concreta.

| Classe abstrata   | Classe concreta|
| :---------- | :--------- | 
|A classe abstrata tem implementação parcial ou nenhuma implementação. | Tem uma implementação completa de ser comportamento. |
|Elas não podem ser instanciadas. | Elas podem ser instanciadas. |
|Pode conter métodos abstratos.| Elas não podem conter métodos abstratos.  |
| Têm que ser estendidos para que sua existência tenha sentido | |
- A importância dela é que serve para agrupar as coisas que são comuns entre um grupo de classes filhas, tanto caracteristicas quanto métodos
- Na hora de criar (instanciar), só se cria as classes filhas.
- No UML coloca-se << abstract >> seguido do nome da classe, ou o nome da classe em *itálico*. Quando o método é abstrato, coloca "abstract" antes do nome do método.
- Quando é abstrato, é obrigatório que seja criada uma sobrescrita
