    Aula 8: Eventos e Formulários

Damos as boas-vindas à aula 8! Nela, serão abordados assuntos realmente interessantes, e começaremos também a dar vida às nossas aplicações. É hora de nos introduzir em eventos, formulários, componentes controlados, validações e muito mais.

Vamos começar explorando os eventos… E por que não fazê-lo com um vídeo? A seguir, você aprenderá sobre os eventos no React, a chave mágica entre os usuários e as nossas aplicações.

#### Eventos no React

Os eventos de usuário são um pilar fundamental em qualquer aplicação Front-end. Por meio deles, os usuários podem interagir com as camadas visuais e de dados da aplicação, fazendo com que ela seja dinâmica e consiga responder quase instantaneamente às diferentes ações do usuário.

###### Como já vimos, o React nos permite manipular os eventos com algumas particularidades. A modo de revisão, podemos mencionar os seguintes:

- Devem ser nomeados utilizando camelCase
- Um manipulador do evento deve ser passado entre { }, ao invés de uma string.
- Se desejarmos evitar o comportamento por padrão, deveremos usar o método preventDefault em forma expressa. Se utilizarmos Javascript vanilla, bastará retornar false no nosso callback.

Visto que o React permite passar os manipuladores de eventos diretamente no JSX, não será preciso recorrer a métodos addEventListener e removeEventListener, que são utilizados quando trabalhamos com Javascript vanilla. O responsável pela adição e remoção do evento, dependendo se o elemento é renderizado ou não na tela, será o React.

###### Passando argumentos

Em determinados casos, talvez seja necessário passar algum elemento extra para a função responsável pela manipulação do nosso evento. Vamos pensar no seguinte exemplo:


        import React from 'react';

        const Pokemons = () => {
    const pokemonsInfo = [
        {
        id: 1,
        nome: 'Pickachu',
        },
        {
        id: 2,
        nome: 'Bulbasur',
        },
    ];
    
    const removerPokemon = (id, e) => {
        e.preventDefault();
    
        console.log(id);
        // .... lógica para remover o pokemon
    };
    
    return (
        <>
        {pokemonsInfo.map(pokemon => (
            
            {pokemon.nome}
            removerPokemon(pokemon.id, e)}>Remover Pokemon
            
        ))}
        
    );
    };

    export default Pokemons;

Temos aqui uma lista de pokémons, e cada um deles exibirá (além do seu nome) um botão que permitirá removê-lo da lista.

O lógico seria que queiramos utilizar o id do pokemon para filtrar a lista e remover aquele que desejamos. Para isso, precisamos passar para o manipulador de eventos o id como argumento.

Porém, como o nosso manipulador de eventos nada mais é do que uma função, basta adicionar o argumento no momento de declará-la e, então, passar esse argumento quando formos usar essa função no JSX.

Assim, será possível fazer com qualquer argumento extra, além do evento, chegue ao nosso manipulador conforme necessário.


#### Formulários em React

Se falamos em interação, talvez o caso mais icônico seja (e que encontraremos muito no nosso caminho profissional) o formulário.

Dentro de um formulário, podemos encontrar uma variedade de eventos que são disparados à medida que a pessoa interage com ele. No React, os elementos de formulários em HTML funcionam de forma um pouco diferente dos outros elementos do DOM, pois eles mantêm naturalmente algum estado interno.

Mas, antes de mergulharmos na análise e no funcionamento de um formulário no React, é preciso abordar um conceito que será de grande ajuda na hora de realizar essa tarefa: a diferença entre componentes controlados e não controlados.

##### onChange e onSubmit

[onChange e onSubmit.pdf](https://github.com/1pretom/TechDeveloper/blob/main/FrontEnd-3/Aula8/3.4.%20onChange%20e%20onSubmit%20em%20a%C3%A7%C3%A3o%20.pdf)

#### Lembrando validações

Já conseguimos construir um formulário controlado utilizado React, adicionando os eventos necessários para o armazenamento dos dados inseridos e o gerenciamento do envio dessas informações por meio do evento onSubmit. Para completar a nossa aprendizagem, vamos relembrar um tópico já trabalhado nesta track de front-end: validações.

Na vida real, toda vez que uma pessoa envia um formulário, gera-se uma troca de informações entre o front-end e o back-end da aplicação: o front-end recupera as informações do formulário e as envia para o back-end por meio de um request, visando armazenar essas informações ou alterar algumas já existentes.

Essa situação coloca o desafio de nos certificar de que as informações que enviaremos cumpram com uma série de requisitos mínimos que dependem de cada caso em particular. Aplicando validações em um formulário, nos certificamos de que os dados que vamos enviar podem ser recebidos pelo back-end sem problemas.

Ainda, realizando a validação antes do envio das informações, evitamos realizar requisições desnecessárias, sendo que já sabemos que os dados enviados não serão válidos. Então, seja por conta da otimização de recursos ou da integridade dos dados, devemos sempre nos certificar de realizar as validações correspondentes antes de enviar quaisquer tipo de informações para o servidor.

###### Na prática, existem diferentes momentos nos quais as validações nos inputs de um formulário podem ser realizadas:

- à medida que a pessoa vai inserindo os dados
- quando abandona um campo específico (blur)
- quando envia o formulário.

Cada alternativa tem vantagens e desvantagens, então a escolha vai depender de cada caso em particular e da estratégia a ser utilizada.

##### Adicionando validações

[Adicionando validações.pdf](https://github.com/1pretom/TechDeveloper/blob/main/FrontEnd-3/Aula8/4.2.%20Adicionando%20valida%C3%A7%C3%B5es.pdf)