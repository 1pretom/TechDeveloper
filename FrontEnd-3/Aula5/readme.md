    Aula 5: Trabalhando com componentes

Nesta aula será introduzido o conceito da imutabilidade que é homogêneo em toda a indústria do software e está muito presente no React. Além disso serão estudados os conceitos frequentemente usados **props key** e **map()**.
Veremos também como integrar CSS classico e encapsulamento de estilos com CSS module.

##### Conceito de imutabilidade

Acredite ou não, esse conceito já está sendo aplicado faz tempo. Em JS os tipos de dados string, boolea, number, undefined e null são imutáveis. Isto parece um comportamento muito habitual da linguagem, porém, na realidade, acontece porque o tipo de dado string é imutável. Cada variável tem uma localização diferente na memória, por isso, a alteração de uma não afeta a outra.

Entretanto, alguns exemplos de mutabilidade em JS são os objetos e os arranjos.
Os objetos (dados mutáveis em JS), embora sejam variáveis diferentes, pertencem à mesma parte da memória. Assim, se uma delas for alterada, a outra será, portanto, modificada. 

Bem, agora, o conceito de imutabilidade é aplicado e utilizado no mundo do React com muita frequência. As valiosas props dos componentes do React são objetos read-only, ou seja, imutáveis. Embora JS permita mutar objetos, aplicado ao contexto da biblioteca, isso seria um erro. 
Futuramente, vamos conhecer os aspectos de um componente que pode ser mutado e como fazê-lo. Mas, no momento, vamos nos ater ao fato de que as props são imutáveis.

###### Algumas vantagens da implementação são:
- Side effects free: com esta implementação, garantimos que os nossos objetos e componentes não sejam modificados em locais inesperados, afetando com isso a execução do nosso programa.  
- Código muito mais limpo e previsível.
- Mudanças centralizadas: sabemos que os objetos imutáveis são atribuídos apenas uma vez, por isso, rastrear o seu valor seria fácil. 
- Mais facilidade na hora de testar e debugar.

##### Prop key + map()

Agora, vamos apresentar dois personagens que vêm de mãos dadas e são comumente utilizados no mundo da programação com o React. Como você já deve ter adivinhado, estamos falando da propriedade key e o método map().

Vamos imaginar que temos um arranjo de personagens e que desejamos renderizar uma card na nossa app , por cada um deles. Como fazemos? Bom, embora agora sejamos programadores do React, não devemos nos esquecer de todo o aprendizado sobre JavaScript. Tendo as informações armazenadas em um arranjo, podemos utilizar sem problemas o nosso confiável amigo map(), para conhecer toda a lista de pessoas e devolver uma card por cada uma delas.

Através desta solução, só resta sermos cautelosos com uma seção. Embora cada um dos nossos personagens possui um nome diferente, o React e o DOM Virtual consideram que todos eles são exatamente iguais. Portanto, se uma alteração for realizada em um deles (o usuário remove ou altera um dos nossos personagens), o React, ao invés de perceber que alguns deles podem ficar intactos, irá alterar todos, talvez até mesmo a maior parte.

Para resolvermos este problema e evitar baixa de desempenho da nossa app, dispomos da propriedade key que, embora seja denominada “propriedade” e seja atribuída da mesma forma que as props são atribuídas a um componente, ambas são partes completamente diferentes. Este atributo não tem por objetivo passar informações para o componente que está sendo renderizado, antes, ele só será utilizado pelo React na hora de identificar cada elemento como único. É possível imaginá-lo como um ID para o nosso componente.


##### Exemplos de map e keys
###### Map
Já dissemos que o map é chamado a partir de um array, e que devolve um novo array de resultados. Vamos supor que temos um array de personagens de Among Us e queremos ter um array que indique quais personagens não eram o impostor e qual, sim, era o impostor. O array possui objetos literais com o nome do personagem e uma bandeira (flag) indicando se é tripulante ou impostor:


    const tripulantes = [
    {nome: "Mr. Poindibags", eImpostor: true},
    {nome: "Bombom", eImpostor: false},
    {nome: "Tito", eImpostor: false},
    {nome: "X-Ray", eImpostor: false},
    {nome: "Fixfox", eImpostor: false},
    ];

A nossa função map poderia simplesmente usar as informações de cada tripulante para criar uma cadeia (string) com uma frase como: “Mr. Poindibags era o impostor”, ou “Fixfox não era o impostor”.  Para criar um novo array a partir do primeiro, poderíamos usar um laço for, ou, também, usar map. A implementação com o laço for poderia ser assim: 

    // Criamos um novo array
    let tripulacao = [];


    // Iteramos sobre cada elemento no array tripulantes
    for(let i=0; i<tripulantes.length; ++i) {
    let tripulante =
        `${ tripulantes[i].nome} ${tripulantes[i].eImpostor ? '' : 'não ' }era o impostor`;


    // Colocamos cada tripulante no novo array
    tripulacao.push(tripulante);
    }


Por outro lado, para fazer isso com map, devemos invocar a função sobre o array tripulante e passar, como primeiro argumento, uma função que recebe cada elemento (neste caso, o nomeamos tripulante) e usa uma modelo literal (template literal) para ler os dados do elemento tripulante.nome e tripulante.eImpostor e criar a frase:

    tripulante =>
        `${ tripulante.nome} ${tripulante.eImpostor ? '' : 'nao ' }era o impostor`

A função completa tem a seguinte aparência: 

    let tripulacao = tripulantes.map(
    tripulante =>
        `${ tripulante.nome} ${tripulante.eImpostor ? '' : 'nao ' }era o impostor`
    );

Em qualquer um dos casos, o resultado será um array com os cinco elementos:

    0: "Mr. Poindibags era o impostor"
    1: "Bombom não era o impostor"
    2: "Tito não era o impostor"
    3: "X-Ray não era o impostor"
    4: "Fixfox não era o impostor"

Como vemos, o uso do laço for é muito mais detalhado, mas muito eficiente. Porém, usar map permite escrever um código mais simples e é um bom exemplo de programação funcional.

###### Keys 

Vejamos o mesmo exemplo anterior, mas agora com o React. Vamos supor que temos um componente do tipo StatusTripulate que exibe frases e que queremos formar uma lista. Se usarmos um laço for, teríamos algo como: 



    const tripulantes = [
        {nome: "Mr. Poindibags", eImpostor: true},
        {nome: "Bombom", eImpostor: false},
        {nome: "Tito", eImpostor: false},
        {nome: "X-Ray", eImpostor: false},
        {nome: "Fixfox", eImpostor: false},
    ];


    // Criamos
    let tripulacao = [];
    for(let i=0; i<tripulantes.length; ++i) {
        let tripulante = <StatusTripulante {...tripulantes[i]}/>;


        tripulacao.push(tripulante);
    }
    lista = <ul>{ tripulacao }</ul>;

O que a expressão `{...tripulantes[i]}` faz é estender as informações dentro de cada tripulante e passá-las como props. Como vemos, o uso do for produz um código detalhado e bastante complexo. 
Na indústria, prefere-se usar map da seguinte forma: 


    const tripulantes = [
        {nome: "Mr. Poindibags", eImpostor: true},
        {nome: "Bombom", eImpostor: false},
        {nome: "Tito", eImpostor: false},
        {nome: "X-Ray", eImpostor: false},
        {nome: "Fixfox", eImpostor: false},
    ];
        
    let tripulacao = tripulantes.map(
        tripulante => <StatusTripulante {...tripulante}/>
    );


    lista = <ul>{ tripulacao }</ul>;



Novamente, o que a expressão `{...tripulante}` faz é estender as informações dentro de cada tripulante e passá-las como props.
Como já foi dito, se deixarmos o código assim, receberemos uma advertência sobre a falta de keys, mas não um erro. 
O que aconteceria se ignorássemos a advertência?

###### IMPORTÂNCIA DAS KEYS

Se não especificarmos esta propriedade nos nossos elementos de mapeamento, duas coisas poderiam acontecer: o desempenho da aplicação poderia diminuir significativamente por causa das alterações na lista, ou poderíamos obter resultados inesperados (bugs), dependendo do tipo de operações realizadas sobre a lista. 
Isto acontece porque, quando o React aplica o seu algoritmo de diferenciação (diffing algorithm) sobre duas árvores do DOM, a primeira coisa que faz é comparar os dois elementos raiz, e o comportamento é diferente dependendo dos tipos de elementos: 
Sempre que eles tiverem tipos diferentes, o React derrubará a árvore atual e construirá a nova árvore do zero. 
- Se os elementos raiz não forem do mesmo tipo, o React observará os atributos de ambos e manterá o mesmo nó DOM subjacente. Então, ele atualizará apenas os atributos alterados e, em seguida, percorrerá os filhos dos elementos.  
- React percorre o nó atual e o novo nó ao mesmo tempo, e, sempre que existir uma diferença entre os elementos, gerará uma mutação. 
 



É aqui onde podemos fazer uma diferença, porque se o usuário adicionar, remover ou atualizar alguns elementos, não será necessário recriar todos. Porém, se o React não identificar cada um dos elementos, alterará todos ao invés de perceber que é possível manter alguns intactos, até mesmo a maioria. 
É por isso que o React suporta o atributo key. Quando os elementos de um mesmo tipo dentro de uma subárvore têm keys, o React as usa para fazer com que os elementos da árvore original coincidam com os elementos da nova árvore. É isso que permite evitar alterações desnecessárias. 
O que pode ser utilizado como key? Os atributos key podem ser uma propriedade ID adicionada, ou alguma composição realizada com algumas partes do conteúdo do elemento. A key só precisa ser única entre irmãos, não globalmente. No nosso exemplo, caso tenhamos um parâmetro ID para os nossos tripulantes, o nosso código com map e key seria assim:


    let tripulacao = tripulantes.map(
        tripulante => <StatusTripulante key={tripulante.id} {...tripulante}/>
    );


    lista = <ul>{ tripulacao }</ul>;

Mas, o que aconteceria se não dispuséssemos de um ID para cada elemento e não houvesse forma fácil de criar um atributo key? 
No nosso caso, cada tripulante tem apenas dois dados: um nome e uma flag chamada eImpostor, sem ID. Vale lembrar como são os nossos elementos:


    {nome: "Mr. Poindibags", eImpostor: true}

Não tem ID, nem nada que possa ser utilizado como tal, pois não é garantido que os nomes sejam únicos.
São nesses casos onde é possível usar o parâmetro index do elemento do array como key, usando o argumento index da função que passamos para map: 
       
    let tripulacao = tripulantes.map(
        (tripulante, index) => <StatusTripulante key={index} {...tripulante}/>
    );

    lista = <ul>{ tripulacao }</ul>;

O uso do parâmetro index do elemento dentro do array como key pode funcionar bem se os elementos da lista nunca forem reordenados, pois esses reordenamentos serão lentos. Além disso, consideremos que, quando o parâmetro index do elemento é utilizado dentro do array como key, os reordenamentos podem também gerar problemas com o estado dos componentes. Se o atributo key for o índice do elemento, então mover um elemento faz com que ele mude aos olhos do React, pois a key será modificada, causando atualizações e formas inesperadas (bugs) nos componentes.







##### Estilos no React

O CSS pode ser feitos em componentes também, da seguinte forma:

Renomear o arquivo para ex.: `Header.module.css` e importar assim: `import styles from './header.modulo.css';`, por fim mudar o class name para: `className={styles.header}`
