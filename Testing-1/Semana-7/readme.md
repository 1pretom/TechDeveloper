    Aulas 20, 21 e 22

## Automatização de teste

A automação de teste ajuda essencialmente na questão de velocidade, pois abrange muito mais a aplicação do que ir passo a passo testando coisa por coisa e pode ser realizado de forma repetitiva, testando vários acessos ao mesmo tempo.

Algumas ferramentas de automação de testes:
- Robot Framework;
- Selenium;
- Cyprest, etc

### Selenium
É um framework para automação web que consiste no desenvolvimento de scripts que, através de uma linguagem de codigicação específica, permitem a execução de um fluxo fixo de navegação. Desta forma garante que o comportamento desse fluxo seja preservado ao longo da vida da página web.

**Selenium IDE** (Integrated Development Evironment) ou *Silenium Recorder*, é uma ferramenta de automação que permite gravar, editar e depurar testes, sem a necessidade de usar uma linguagem de programação.
É para aplicativos baseados na web e permite tarefas Record&Play de fluxos de teste. Os fluxos registrados estão contidos em um script que pode ser editado e parametrizado para se adaptar a diferentes casos, e o que é mais importante, sua execução pode ser repetida quantas vezes desejar.
Seu principal objetivo é automatizar testes funcionais repetitivos para posteriormente facilitar o trabalho do tester, assim como testes de regressão. Permite que você faça referência a objetos DOM com base em ID, CSS, name ou via XPath.
Além disso, as ações podem ser executadas passo a passo.​


**Selenium WebDriver** é uma ferramenta que permite automatizar testes de interface de usuário de aplicações web.
Algumas das linguagens suportadas pelo Selenium WebDriver são: Java, C#, Python, Ruby, PHP e JavaScript.
É bem útil poder simular o jeito que usuários reais interagem com apps web. Para isso essa ferramenta oferece uma série de métodos para ativar e validar qualquer elemento dentro de uma interface gráfica.

**Selenium Grid** permite projetar testes automatizados para apps web em várias plataformas.
Também possibilida a execução de testes em vários servidores em paralelo. Por isso reduz custos e tempo de execução devido a sua execução em vários navegadores e sistemas operacionais.
O Selenium Grid tem dois componentes: Selenium Hub e Remote Control.