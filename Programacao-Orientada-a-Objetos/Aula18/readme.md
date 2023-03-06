    aula 19
## Design Paterns
#### Padrões de Projeto

Assim como em outras áreas, na programação orientada a objetos também existem padrões que orientam no momento da utilização e criação das funcionalidades para a tecnologia dos softwares. Não é um código pronto, mas sim um modelo padrão para ser seguido a fins de facilitar e melhorar o que é desenvolvido. O **design pattern** conceitualmente deve definir um nome, o problema, a solução, quando aplicar essa solução e as consequencias dessa solução. E definem as relações e interações entre classes ou objetos, sem especificar os detalhes dos envolvidos. <br>
São sugestões de como fazer algo, no caso, de como fazer um software ou resolver problemas.
Ás vezes é vantajoso e às vezes não.


É dividido em 3 categorias, que são: **Creational, Structural e Behavioural**
- Creacional ou Criação: visa **abstrair** o processo de como os objetos são criados na aplicação e seus padrões são:
    - Abstract Factory
    - Factory Method
    - Builder
    - Prototype
    - Singleton
- Structural ou Estruturais: lidam com a **composição** de uma classe ou objeto:
    - Adapter
    - Bridge
    - Composite
    - Decorator
    - Façade
    - Flyweight
    - Proxy
- Behavioural ou Comportamentais: se tratam das **relações** entre objetos e classes e suas distrubuições de responsabilidade na aplicação:
    - Interpreter
    - Template Method
    - Chain of Responsability
    - Iterator
    - Command
    - Mediator
    - Memento
    - Observer
    - State
    - Strategy
    - Visitor


#### De forma geral:
O **Creational** busca fornecer interfaces para criar, copiar objetos e produzir famílias de objetos relacionados sem ter que especificar suas classes concretas. Além de construir objetos complexos passo a passo permitindo usar o mesmo código de construção para diferentes representações e tipos. <br>
O **Structural** Permite a colaboração de objetos com interfaces incompatíveis. Adiciona novos comportamentos a objetos colocando eles em um envoltório de objetos que contém comportamentos. Permite também que faça divisão e hierarquias separadas para classes ou conjunto de classes que são intimamente ligadas. Abstração e implementação que podem ser desenvolvidas independentemente umas das outras. Outra possibilidade é a de composição em estrutura de árvores e trabalhar com essas estruturas como se fossem objetos individuais.<br>
Tendo um bom planejamento e utilizando os **design patterns** é possível ter menos bugs e facilidade na manutenção de código.