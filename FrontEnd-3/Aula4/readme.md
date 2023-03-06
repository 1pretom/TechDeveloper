    Aula 4: Pensando no React

O conceito principal da arquitetura do React é baseada na utilização e reutilização de componentes. Porém, é possível que ainda estejamos nos perguntando o que são os componentes e como funcionam.

#### O que é um componente?

Um componente é uma classe ou uma função que devolve um elemento HTML, normalmente expresso através da sintaxe JSX (esses conceitos foram abordados na aula anterior). A sua finalidade principal é permitir separar a interface de usuário em partes independentes, reutilizáveis e, também, pensar cada parte de forma isolada.

##### Característidas dos componentes
1. Alinhamento: Um componente pode ser exibido dentro do outro
2. Reusabilidade: Se bem construído pode ser reutilizado em qualquer aplicação
3. Customização: O conteúdo pode ser customizado dependendo do local onde for usado
4. Ciclo de vida: Desde o registro-montagem até sua "desmontagem".

###### Componentes de classe 

Para criar um componente de classe, devemos estendê-lo a partir do React.Component, que é a classe “pai” fornecida pelo React, a qual age como uma espécie de “molde” para que os nossos componentes possam ser registrados e utilizados dentro da nossa aplicação. 
Entretanto, o nosso componente irá dispor de um método “render”, para o qual deveremos retornar (toda vez que utilizarmos esse componente) o JSX que desejamos renderizar. Embora existam outras particularidades ligadas a este tipo de componentes, a anterior é a sintaxe básica que devemos utilizar para criar um componente de classe. 

###### Componentes funcionais


Como indicado pelo nome, um componente funcional nada mais é do que uma função que devolve o JSX que queremos renderizar para cada componente, neste caso, para criar o nosso componente não é preciso utilizar nenhuma super classe ou método. Basta declarar a função e retornar o que queremos renderizar. 

>Como consequência do anterior e devido ao surgimento dos “hooks”, o mais utilizado atualmente para a criação de novas aplicações no React é o paradigma funcional. Entretanto, e como mencionado pelo React na sua documentação, até hoje ainda não existe um plano imediato para remover os componentes de classe, portanto, provavelmente estaremos trabalhando em projetos nos quais ambos os tipos de componentes coexistem, mas, como nesta disciplina focaremos na criação de projetos utilizando as últimas versões do React, nossa atenção será no uso de componentes funcionais e hooks (que serão abordados mais à frente).

#### Reutilização de componentes

Conforme visto, uma das principais finalidades do React é criar interfaces de usuário através de componentes. Isto implica “partir” a nossa aplicação em diferentes partes, representando cada uma delas através de componentes.

Da mesma forma, sendo que outro objetivo é buscar a maior reutilização de componentes possível, podemos particionar cada parte de nossa interface repetidamente, até alcançar um nível que possibilite aproveitar ao máximo esta funcionalidade.

###### Vamos pensar no esquema a seguir:

![Reutilização de componentes](https://assets.digitalhouse.com/content/ar/td/frontiiiv3/frontIIIA4A.png)

Aqui, podemos começar a nossa partição dividindo a aplicação em dois grandes componentes: Header e Main. Porém, como vemos, poderíamos então subdividir o conteúdo de Main em um componente Content que seja reutilizável. Por sua vez, Content poderia ser novamente subdividido em dois componentes (Text e Button) que poderão ser utilizados futuramente.

Vamos para o importante: o limite desta subdivisão está nas necessidades da nossa aplicação e na nossa capacidade de análise e abstração de componentes que possam ser reutilizados em várias partes dela.

A criação e uso de componentes reutilizáveis exige a análise da Arquitetura de componentes. Vamos aprender sobre esta arquitetura neste vídeo.

##### Componentes puros

Quando falamos em reutilização de componentes, um dos principais conceitos a considerar é o de componentes puros. Mas do que se trata?

Antes de respondermos a essa pergunta, vamos relembrar o conceito de “função pura”. Uma definição normalmente aceita indica que uma função é “pura” quando, com os mesmos argumentos, retorna sempre o mesmo resultado. Sua principal característica é que elas não têm a possibilidade de gerar nenhum efeito secundário (side effect), tais como a alteração de uma variável global ou a alteração do estado da aplicação.

Se levarmos esse conceito para o React, poderíamos dizer que um componente será “puro” quando a sua finalidade for exclusivamente de apresentação.Em outras palavras, um componente puro irá receber determinadas propriedades (como veremos mais à frente) e será limitado a retornar um elemento JSX baseado nas informações recebidas, sem gerar nenhum tipo de efeito secundário. Tendo as mesmas propriedades, o conteúdo do JSX que irá retornar o componente será idêntico.

Se falarmos em reutilização de componentes, a possibilidade de criar componentes o mais puros possíveis nos permitirá utilizá-los ao longo de toda a aplicação, sem necessidade de nos preocupar com prováveis efeitos secundários que eles poderiam introduzir no nosso código.

#### O que são as props?

Até agora, vimos o que é um componente e como ele pode ser utilizado para tornar mais rápido o nosso processo de trabalho. Mas, o que podemos fazer se queremos que o conteúdo do componente seja dinâmico?

As props são dados internos de um componente e representam informações que são enviadas no momento em que ele é utilizado, permitindo que as informações internas do componente sejam variáveis, de modo que possamos ter estruturas HTML realmente dinâmicas e 100% reutilizáveis.

Vejamos esses conceitos mais profundamente no vídeo a seguir!


##### Children + Fragment
###### Children

Quando trabalhamos com o React, é possível criar componentes que agem como caixas ou containers genéricos de outros componentes. Nesse caso, talvez desejemos utilizar esses containers em diferentes partes da nossa aplicação. Diante disso, o desafio que se nos coloca é que, no momento de criar os contêineres, ainda não sabemos quais serão seus filhos (pois isto irá depender de cada caso onde eles forem implementados). 
Para resolvermos este problema, o React fornece um tipo de “prop” especial, conhecida como children. Esta propriedade permite passar elementos filhos diretamente no momento de invocar o componente container. Assim, os nossos componentes podem ser aninhados arbitrariamente, utilizando containers genéricos. Vamos ver um exemplo: 


    import React from "react";
    import ReactDom from "react-dom";

    const Pai = (props) => {
        return (
            <div
                style={{
                    width: "75%",
                    background: "#FFEFD5",
                    height: "200px",
                    padding: "20px",
                }}
            >
                <h5>Sou um pai</h5>
                {props.children}
            </div>
        );
    };
    const Filho = (props) => {
        return (
            <div
                style={{
                    width: "50%",
                    background: "#FA8072",
                    height: "100px",
                    padding: "10px",
                    color: "white",
                    fontSize: "30px"
                }}
            >
                {props.autor}
            </div>
        );
    };

    const App = () => {
        return (
            <Pai>
                <Filho autor="Sou um filho" />
            </Pai>
        );
    };

    ReactDom.render(<App />, document.getElementById("root"));

Como vemos, dentro do componente `<Pai/>`, temos uma tag `<h5/>` seguida de props.children que indica que, independentemente do componente aninhado dentro de `<Pai/>`, esse componente irá aparecer após o texto “Eu sou um pai”.
Após isso, ao utilizar o componente `<Pai/>` na nossa aplicação, vamos adicionar o componente `<Filho/>` dentro dele. 

###### Fragment
Assim como desejamos aninhar um componente dentro de outro, é possível que, em determinados casos, desejemos retornar vários componentes que estão no mesmo nível. Por exemplo, poderíamos ter um componente Columns como o seguinte:

    const Colums = () => (
        <td>Hello</td>
        <td>World</td>
    );

Bem, agora, se tentarmos utilizar este componente, obteremos um erro, pois o React permite a cada componente retornar apenas um elemento JSX como “pai”. 
Para resolver este problema, basta “agrupar” as nossas tags <td/> dentro de um container comum, por exemplo:

    import React from "react";
    import ReactDom from "react-dom";

    const numbers = [1, 2, 3, 4, 5, 6, 7, 8];

    const listItems = numbers.map(number) => (
        <div>
            <td>Nº </td>
            <td>{number}</td>
        </div>
    );
    
    ReactDOM.render(
        <div>{listItems}</div>,
        document.getElementById('root')
    );

O problema disso é que serão criadas desnecessariamente tags HTML vazias, como por exemplo num código que seriam agrupadas tags `<span/> e <p/>` dentro de uma tag `<div/>`. Se revisar o DOM vai ter muita tag criada exclusivamente para agruapar cada um dos elementos renderizados. Embora isto não seja um problema importante, um conteúdo desnecessário está sendo adicionado na nossa aplicação, podendo torná-la mais difícil de inspecionar caso seja necessário.

Para resolver isso, o React nos proporciona a tag `<Fragment>`, que nos permite agrupar elementos sem criar nós extras. Dessa vez vamos trocar a tag `<div>` por Fragment:

    import React from "react";
    import ReactDom from "react-dom";

    const numbers = [1, 2, 3, 4, 5, 6, 7, 8];

    const listItems = numbers.map((number) =>
    <React.Fragment>
        <span>Nº </span>
        <p>{number}</p>
    </React.Fragment>
    );

    ReactDOM.render(
    <>{listItems}</>,
    document.getElementById('root')
    );

Inspecionando a nossa aplicação novamente, obteremos um resultado sem tags `<div/>` desnecessárias tornando o código mais legível

Existem duas formas de utilizar Fragment:
- A sintaxe abordada anteriormente, através da tag `<Fragment>`, que pode ser importada a partir do React, ou
- Através da sintaxe abreviada, representada pelos sinais <> e </>.
