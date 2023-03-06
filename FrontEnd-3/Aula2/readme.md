    Aula 2: Ferramentas e primeiro projeto

#### Integração do JSX no React

O react permite implementar uma nova extensão chamada JSX que habilita a escrever Javascript e HTML no mesmo arquivo. Com Vite e Create App é possibel criar um projeto do zero em segundos.

- JSX == javascript xml
- permite criar arvores html ou elementos de react como se fossem variáveis de js
- JSX não é estritamente necessário, mas é mais prático na hora de criar elementos, exibir erros e advertencias.

- A comunidade dev prefere usar JSX

exemplo de sintaxe no formato jsx:

      const title = <h1>Hello JSX!</h1>

#### Create-react-app e ViteJS

O Vite é rápido, mas se formos escrever os testes, teremos que fazer o setup manualmente, já o CRA dá pra começar a escrever-los instantaneamente contudo está depreciado.

o esbuild(bundler utilizado pelo Vite) é superior ao webpack (utilizado pelo CRA), por isso ao trabalhar com projetos grandes, a sua superioridade de desempenho e velocidade é significativa


#### React Developer Tools
- Chrome devtools 
- React Developer Tools

Pra adicionar dependencias pelo vite é no yarn e daí add o nome da dependencia