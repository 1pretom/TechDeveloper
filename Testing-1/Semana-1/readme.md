    Aulas 1, 2 e 3

## 7 Princípios do Teste de Software
1. Teste demonstra a presença de defeitos;
    - Não encontrar um defeito não sifnifica que ele não exista;
2. Teste exaustivo é impossível;
    - Se for testar absolutamente tudo, vai levar meses até terminar e mesmo assim pode continuar existindo problemas. Quanto mais testar melhor, mas quase nunca é possível testar tudo, o que determina quando parar de procurar é o tempo;
3. Teste antecipado;
    - Prefenir é melhor que remediar, desde a criação do código é importante que já esteja sendo testado;
4. Agrupamento de defeitos;
    - Princípio de Pareto, 80,20;
5. Paradoxo do pesticida;
    - Bug que se finge de morto, as vezes um bug só acontece de uma determinada maneira em uma determinada ferramenta e no teste ela funciona normalmente, é como se o bug estivesse "escondido", por isso é importante fazer a varredura usando ferramentas diferentes;
6. Teste depende do contexto;
    - Na maioria das vezes não é possível aplicar o mesmo teste de um sistema X em um sistema Y;
7. A ilusão da ausencia de defeitos;
    - Sistema sem bug mas não atende as necessidades dos usuários, não serve de nada. Ou seja, não necessariamente não ter defeito significa que tá tudo ok.

## Etapas do Ciclo de Vida de Teste de Software

1. Análise de requisitos
    - Identificar os tipos de testes que devem e podem ser executados. Entender o que vai ser desenvolvido pra entender o que vai ser testado. Saber para que serve a aplicação para saber qual tipo de teste vai usar
2. Fase de planejamento;
    - Elaborar o plano de teste, escolher as ferramentas que vai usar, estimar o tempo e o custo;
3. Integração do caso de teste;
    - Elaboração do script e do caso de teste, é escrever o que vai ser testado;
4. Configuração do ambiente de teste;
    - Onde que eu vou testar? Configurar o ambiente e fazer uma lista de requisitos do sistema. O certo é ter 4 ambientes de teste, mas o normal são 2, as vezes 3. O normal é uma ambiente de desenvolvimento e um de homologação, o terceiro é geralmente um de QA;
5. Fase de implementação
    - Nessa fase é o teste em sí "faz isso e deveria fazer aquilo", teste e documenta nessa fase evidenciando o que funciona e o que não funciona. Com data, hora e versão.
6. Encerramento
    - Discutir os resultados, ver o que deu certo, o que não deu e o que vai melhorar na proxima versão e no proximo ciclo.

## O ciclo de vida de um defeito

![app screenshot](https://github.com/1pretom/CertifiedTechDeveloper/blob/main/Testing-1/Semana-1/Ciclo%20de%20vida%20de%20um%20defeito.png?raw=true) 

1. Novo/Inicial * Em teste
2. Atribuido - Para quem o defeito irá para ser consertado
3. Em progresso - Está arrumando * Em desenvolvimento
4. Corrigido * Em desenvolvimento
5. Aguardando verificação - Volta para o testador * Em teste
6. Em verificação 
7. Verificado * Em teste
8. Fechado e vai pro proximo, ou volta pra atribuição caso esteja acontecendo o defeito ainda 

Erro e defeito que não se repente, não é erro nem defeito.

## Erros, defeitos e falhas
Erro - é um mano;
Defeito - Processo ou definição incorretos, algo não tá funcionando q pode ser provocado por um erro, mas não necessariamente. O que é certo é que o defeito provoca uma falha;
Falha - algo que vc espera é diferente do que tá acontecendo.

[Template do Ciclo de vida de um defeito.](https://github.com/1pretom/CertifiedTechDeveloper/blob/main/Testing-1/Semana-1/partes-relatorio-de-defeito.pdf) 

## O que é teste?
Processo de execução de um programa com a intenção de encontrar erros.