    Aula 7: Hooks

No momento, abordamos aspectos fundamentais do React que nos introduziram ao mundo das aplicações de alto desempenho. Vamos revisar brevemente o que foi visto até agora.

Já sabemos que uma das suas principais vantagens é a fragmentação ou encapsulamento do código através de componentes.Agora podemos reutilizar partes do nosso site quantas vezes quisermos e onde precisarmos sem ter que escrevê-las novamente.

Além da sua eficiência com JSX na hora da escrita de JS e HTML no mesmo arquivo, e todas as melhorias na otimização implementadas pelo sistema de diffing com o virtual DOM. Parece que temos tudo resolvido com esta nova biblioteca.

E o que diria se nos contassem que ainda resta uma das principais inovações do React e seus componentes funcionais? Sim, hoje apresentaremos os hooks.

#### Intro a Hooks

A tradução literal é "gancho". Embora esta informação não pareça fazer muito sentido ou ter relevância, ela pode nos dar uma pista sobre a finalidade deles. Vamos ver a definição formal por parte do React:

“Um Hook é uma função especial que permite se conectar (ou se prender) às características do React.”

Os Hooks são, basicamente, funções que permitem a componentes funcionais incorporar características do React, antes restritas apenas a componentes de classe. Entre outros utilitários, eles fornecem estado interno e ciclo de vida aos componentes funcionais. Além disso (e não menos importante), resolvem problemas com os quais o React lidou durante anos.

Em outras palavras, os Hooks dão superpoderes aos nossos componentes funcionais.

###### São uma forma simplificada de inserir caracteristicas do React, como: 
- Estado
- Ciclo de vida
- Contexto
- Referencias
Em componentes funcionais, sem alterar o funcionamento e as bases do React, como a importância dos componentes, o fluxo de dados e as props.

###### Hooks permitem:
- Reutilização, composição e testing de códigos melhores e mais simples
- Extração da lógica de um componente para sua reutilização e compartilhamento.

###### Principais benefícios:
- Menos quantidade de código.
- Código mais organizado.
- Uso de funções reutilizáveis.
- Mais facilidade para testar.
- Não chama o super() em um construtor de classes.
- Não trabalha com this e bing no uso de manipuladores.
- O estado local está dentro do escopo dos handlers e das funções de efeitos secundários
- Componentes mais reduzidos, que tornam mais fácil o trabalho do React.

##### Características
1. Não chame hooks dentro de condicionais, ciclos ou funções aninhadas.
2. Só chame os Hooks dentro dos componentes funcionais do React.
3. Chame os Hooks no início da função do componente.

##### Por que Hooks, se com as classes estávamos bem?

[Descubra clicando aqui](https://github.com/1pretom/CertifiedTechDeveloper/blob/main/FrontEnd-3/Aula7/2.4.%20Por%20que%20Hooks_%20Se%20com%20as%20classes%20est%C3%A1vamos%20bem..pdf)

#### Hook: useState()

Até agora, com o React tudo estava certo. Escrevíamos os nossos códigos com o JSX, separávamos a nossa aplicação em componentes, deixávamos que a biblioteca comparasse o nosso código através do diffing, tudo isso sem preocupações. Porém, vamos imaginar o que aconteceria caso desejássemos salvar um valor dentro de um componente.

        //Isto não funcionaria
    const Post = () => {
        let likes =  0
    return (
        
        {likes}
        )
    }
        
Se o React tentasse atualizar o DOM neste momento (e também o Post que tínhamos dentro), o seu valor não seria mantido, e sim "desapareceria" e seria criado novamente com todo o componente.

Isto poderia gerar grandes conflitos. Vamos supor que queremos contar a quantidade de likes que teve o nosso Post, mas, quando entramos e interagimos, estamos alterando o componente. Então, disparamos uma renderização novamente e o Post é criado outra vez e, portanto, a variável likes é inicializada de novo em 0. Deve existir alguma forma para “manter” ou salvar as informações de um componente em um estado interno, não é? Felizmente, o React já pensou nisso.

##### O que é useState? 

No React, a interface de usuário representa o estado no momento da renderização inicial. Se alguma parte desse estado atualizar o seu valor, o React renderizará novamente os componentes envolvidos nessa parte de estado após comparar o virtual DOM com o DOM salvo na memória. O objetivo disso tudo é que a atualização seja eficiente e esteja baseada na diferença entre ambos os DOM.
A partir do lançamento de Hooks, os componentes funcionais podem declarar e atualizar o seu estado interno através do hook useState, que é uma função que cria uma variável que permite armazenar uma parte de estado interno e, ao mesmo tempo, atualizar esse valor em um componente funcional. 

    const [state, setState] = useState("Learning");


Cada componente tem uma lista interna de “células de memória” associadas. Essas células são traduzidas em objetos literais de JavaScript, onde incluímos os nossos dados. Quando invocamos o useState, a função vai lendo as células uma por uma e, assim, múltiplos chamados ao useState obtêm múltiplos estados locais correspondentes.
Teoricamente, isso nos permitirá declarar infinitas const do useState. 

    const [count, setCount] = useState(0);
    const [phone, setPhone] = useState("");
    const [username, setUsername] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [confirmPassword, setConfirmPassword] = useState("");
    const [otaku, setOtaku] = useState(false);
    const [loveLevel, setLoveLevel] = useState({day: "orange", night: "blue"});

Podemos incluir useState quantas vezes quisermos, tendo como única condição que seja chamada a partir de um nível superior de código, e não de um bloco.

**Incorreto**

    const Post = () => {
    const istoEstaErrado = () => {
        const [likes, setLikes] = useState(0);
    }
    return <h3>{istoestaErrado}</h3>;
    };

**Correto**

    const Post = () => {        
    const [likes, setLikes] = useState(0);
    return <h3>{likes}</h3>;
    };


#### state vs. setState()

Como já vimos, o estado de um componente é quem permite a ele salvar informações internamente. O estado de um componente é chamado de “state”, e é um objeto literal (chave/valor) que irá armazenar as informações que desejamos. Por outro lado, o setState() é um método que permitirá atualizar o estado quando acharmos necessário.

Por que dizemos atualizar e não alterar? Porque, de fato, o estado é imutável.

##### Imutabilidade outra vez?

O conceito de imutabilidade já foi introduzido em aulas anteriores. Já afirmamos que algo é imutável quando o seu valor não pode ser alterado e, portanto, mutável é a sua definição oposta.

No momento, este conceito foi aplicado apenas nas props, e elas foram definidas como imutáveis, mas dissemos também que existe uma parte dentro do componente cujo valor poderá, sim, ser atualizado à vontade. Como você já tenha imaginado, estamos falando em estado. Mas se o estado é imutável, como ele pode ser mutável? Na realidade, não vamos fazer isso.

Toda vez que quisermos “alterar” o estado interno de um componente, o que realmente faremos será devolver ou criar um estado completamente novo. Então, não estamos realmente alterando o seu valor.

Na prática, não precisamos nos preocupar com essa lógica extra. Basta usar a função setState() e ela se encarregará de criar esse novo estado com a modificação que você deseja fazer.

Nas aulas anteriores já vimos as vantagens que a imutabilidade oferece na área de programação, e tanto props quanto state não ficam de fora.

##### setState() em ação

Vamos pensar novamente no exemplo de um Post que tem, dentro dele, um contador de likes. Agora, com o useState() sabemos que a quantidade de likes do nosso Post será mantida mesmo após uma re-renderização. Vamos ver como vamos atualizar esse estado. 

Observemos que o nome a ser colocado no estado é irrelevante, pois estamos realizando um destructing, onde o importante é a posição no array e não o nome em si. A primeira posição será sempre o valor do estado (neste caso, likes), e a segunda, a função que nos permitirá “mutar” o nosso state. Ela é normalmente chamada de função atualizadora, com a palavra set + nome do nosso estado. Desta vez, iremos nomear o nosso estado como likes, por isso, a nossa função atualizadora será setLikes. 
Vamos ver como ficaria agora o nosso componente utilizando a nossa função para atualizar a quantidade de likes:

    const Post = (props) => {
    const [likes, setLikes] = useState(0);
    return (
        <div>
            <h1>{likes}</h1>
            <button onClick={ ()=> setLikes(likes+1) }>
            ♥
            </button>
        </div>
    )}

Embora pareça que estamos apenas adicionando uma unidade ao valor de likes, o que realmente estamos fazendo é criar, através de setLikes, um estado totalmente novo. 
O exemplo a seguir mostra a sua implementação caso tenhamos mais de um valor armazenado no mesmo estado: 

    const Post = (props) => {
    const [state, setState] = useState({
        likes: 0,
        vistas: 0
    });


    return (
        <div>
        //Acessamos os likes e views pela sua key 
            <h1>{state.likes}</h1>
            <h1>{state.vistas}</h1>
        
        //Com prev acessamos o valor "prévio à mudança” do estado
    <button onClick={ ()=> setState(prev => ({...prev, likes: likes+1})) }>
            ♥
        </button>
    </div>
    )}

Agora, ao invés de armazenar um único valor, estamos salvando um objeto. Após isso, para acessar cada valor do nosso estado, utilizaremos a mesma sintaxe utilizada para acessar qualquer objeto (key/value). E, agora, para atualizar o nosso estado, o assunto muda um pouco. Vamos ver a sintaxe a fundo:

    setState(prev => ({...prev, likes: likes+1}))

Como vemos, “prev” é um parâmetro (próprio da função set) que nos dá acesso ao valor que o estado tinha. Para atualizar o valor do state, faremos agora uma cópia de tudo o que tínhamos anteriormente (com o [spread operator](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Operators/Spread_syntax)) e só mudaremos o atributo que queremos alterar.  
Vale mencionar que “prev” não é uma palavra reservada da linguagem, mas sim um parâmetro, e é possível nomeá-la à vontade.
