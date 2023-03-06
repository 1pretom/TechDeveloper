    Aulas 13(checkpoint), 14, 15 e 16

# Debugging vs. Testing

## O que é debugging?

Ou depuração é o termo usado no processo de encontrar e remover os erros que podem acometer softwares e hardwares. A ideia é depurar e refinar o código para poder remover os erros.

Pra que consigamos trabalhar com debug, devemos utilizar os **breakpoints**, que são pontos de parada tidos como intervalos a fins de reduzir o tamanho do que está sendo debugado e só no final rodar o código todo para ver se está nos conformes.

Existem ferramentas específicas para fazer o debug e são essenciais principalmente para quem trabalha com front-end. Alguns exemplos são:
- Nodejs inspector
- React Developer Tools
- Visual Studio Code
- Web inspector
- Chrome DevTools
- Firefox Developer Tools

O debug melhora a gestão de tempo, pois agiliza os trabalhos do tester pois quando é feito o debug algns erros são detectados logo no início e isso evita que grandes projetos tenham que ser refeitos ou mesmo jogados fora.

## Debugging x Testing
|Testing|Debugging|
|-|-|
|Teste é um processo onde é verificado que o sistema ou componente funciona conforme o esperado, tem como objetivo a busca de erros.|Depuração é um processo dedutivo para corrigir erros encontrados durante os testes.|
|Os testes nos permitem identificar as falhas de um código implementado.|A depuração nos permite dar solução para a falha do código.|
|Com testes, nós visualizamos os erros.| Com a depuração, nós conseguimos investigar e detectar o erro.|
|Teste geralmente é realizado por testador ou QA.|Depuração é feita pelo programador ou desenvolvedor, exceto para código gerado pelo testador como parte de scripts de testes automatizados.|
|Teste pode ser feito tanto por pessoas internas quanto por pessoas externas, geralmente uma pessoa externa não pode depurar pois não deve ter acesso ao código.|Depuração é realizada apenas por pessoas internas.|
|É uma etapa do ciclo de vida do desenvolvimento de software.|Não é um aspecto do ciclo de vida, pois ocorre como consequência de testes.|
|É composto pela validação e verificação do software.|Busca combinar o sintoma com a causa, oque leva à correção do erro.|
|Iniciam antes de ler o código (testes estáticos) ou depois que o código é escrito (testes dinâmicos).|A depuração começa com a execução do código devido a um caso de teste reprovado.|

## Introdução ao Testing de Componente | Teste unicário | Teste de unidade

É o tipo de teste que é o mais basal, o **primeiro nível de testes** e é um **teste de caixa branca**, como estudado, nele é possível testar a menor parte testável de um código, de forma individual. Geralmente são automatizados, escritos e executados pelos desenvolvedores.

É feito em 3 etapas: 
- **Acordo ou critério de aceitação**
Onde são definidos os requisitos que o código principal deve atender.
- **Escrita de teste**
O processo de criação, onde os resultados a serem analisados são acumulados.
- **Confirmação**
É considerado o momento em que verificamos se os resultados agrupados estão corretos ou incorretos. Dependendo do resultado é validade e continuado, ou é reparado, para que o erro desapareça (debug).

***

## O processo do Teste Unitário
1. O código do software é criado; 
1. Os resultados esperados são definidos;
1. O teste é executado.

A) Se o teste é ***APROVADO***, o resultado esperado é confirmado.
B) Se o teste ***FALHAR***, o código é modificado para solucionar o defeito encontrado.

|Vantagens|Desvantagens|
|-|-|
|Código vai ficando mais limpo|Leva tempo para escrever casos de teste|
|Detecta bug mais cedo|É difícil escrever testes para código legado|
|Detecta bug de regressão|Exige muito tempo para manutenção|
|Torna o código fácil de refatorar|

***
### Alguns comandos de Jest
`npm init` cria nome etc e tal ou `npm init -y` para criar o package.json
`npm install --save-dev jest` para criar o jest framework no projeto que vamos usa-lo
Arquivos terminados em `.test.js` são identificados como arquivos de configuração de teste pelo Jest
`"test": "jest --watchAll"` para fazer o teste sempre que algo novo for inserido no código e indicar que iremos usar o framework jest, no arquivo package.json
`"test": "jest --coverage"` para saber a cobertura do teste
`describe()` para gerar agrupamento de testes unitários

[Documentação de teste unitário com jest no devmedia](https://www.devmedia.com.br/teste-unitario-com-jest/41234)
[Documentação de configuração do coverage no Jest em inglês](https://www.valentinog.com/blog/jest-coverage/#:~:text=Jest%20is%20collecting%20coverage%20only,a%20fraction%20of%20our%20code.&text=Now%20Jest%20is%20identify%20correctly%20what%20needs%20to%20be%20tested.)