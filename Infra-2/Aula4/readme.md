    Aula 4: Infraestrutura como código

#### Infraestrutura como código: o conceito

Usamos o termo Infraestrutura como Código (IaC) para nos referirmos à gestão da infraestrutura através de modelos que têm a capacidade de ser versionados. Desta forma, podemos automatizar os processos manuais necessários para atingir o objetivo final que procuramos.
Assim como toda vez que executamos o código de nossa aplicação obtemos o mesmo resultado, o mesmo acontece com a infraestrutura: obteremos o mesmo resultado de infraestrutura de nosso IaC. Este conceito é muito importante para implementar a metodologia DevOps em nossa vida profissional, pois nos permitirá criar um ambiente muito mais rápido e seguro para nossas aplicações.

##### Infraestrutura como Código (IaC) permite administrar, automação da administração e provisionamento da configuração.

###### Assim podemos automatizar as seguintes coisas:
- Criação de um servidor
- Fornecimento de banco de dados
- Criação de cluster para operar um container

###### Os procedimentos são os seguintes:

- Analisar qual infraestrutura precisamos conforme as exigências da aplicação.
- Calcular quantas réplicas de nossa infraestrutura devem ser construídas
- Escrever o modelo
- Executar o modelo na ferramenta IaC ou fornecer para outra equipe executar quando precisar
- Receber feedback de outra equipe ou a ferramente de automação diz que terminou de executar corretamente.

Na IaC são criados arquivos de configuração que facilitam a edição e distrubuição da infraestrutura
O controle de versão deve ser aplicado aos arquivos de configuração assim como qualquer outro arquivo de fonte de código de software
Eles também podem ser modulares e aplicados de maneiras diferentes na aplicação
###### IaC envolve esses 3 passos:
- Definir e descrever as especificações da infraestrutura
- Os arquivos são criados em um repositório de códigos
- A plataforma IaC toma as ações necessárias para criar e configurar recursos de infraestrutura.
IaC é essencial para DevOps

#### Antes da Infraestrutura como código

Como começar? Quais são os primeiros passos de uma implementação? Que melhorias a infraestrutura nos oferece como código?

Quando estamos fazendo a análise para implementar uma infraestrutura para nossa aplicação, a primeira coisa a definir é a arquitetura que precisamos: qual servidor é o correto ou qual banco de dados precisamos. Uma vez selecionado o tipo de servidor, passamos à configuração e instalação do que nosso sistema operacional requer para ser operacional.

###### Passo a passo:

- Configurar a conexão de comunicação dos servidores para nossos computadores, para a Internet, ou para outros servidores.
- Instalar as dependências da aplicação.
- Implementar a aplicação ou banco de dados que o servidor vai ter.

##### Melhorias e soluções
Mesmo que este processo seja bem documentado, sempre encontraremos obstáculos: o tempo gasto pela tarefa, possíveis incompatibilidades ou inconsistências na documentação. A metodologia de infraestrutura como código oferece uma solução para tudo isso.

Este processo, que é realizado manualmente, está começando a se acelerar diante do rápido progresso tecnológico, dando origem à automação da infraestrutura. Como consequência, os ciclos de desenvolvimento têm melhores tempos de resposta devido à maior disponibilidade e flexibilidade dos ambientes de desenvolvimento de software.

###### Benefícios da infraestrutura como código
1. Reduzir o erro humano
2. Repetitibilidade e previsibilidade
3. Redução de tempo e desperdício
4. Controle de versão
5. Redução de custos
6. Teste
7. Ambientes estáveis e escaláveis
8. Padronização da configuração
9. Documentação
10. Mais velocidade sem descuidar da segurança

#### Dois paradigmas para infraestrutura como Código

Há dois paradigmas de programação aplicados à infraestrutura como código. Ao escrever nosso IaC, podemos optar pelo paradigma imperativo, que nos permite controlar o fluxo de trabalho de nosso código, ou nos concentrar no resultado final e na mudança de nossa infraestrutura, o paradigma declarativo. É o "como" versus o "o quê".

##### Dois paradigmas

###### Paradigma Imperativo:
Usamos o paradigma imperativo ao escrever nosso código, concentramo-nos em como ele será executado através de várias operações e no fluxo de trabalho que ele irá realizar. Vamos definir variáveis constantes e definir decisões. 

Os mais conhecidos são:
- IF 
- ELSE 
- ELIF (em outros idiomas é conhecido como ELSE IF) 
- FOR e FOREACH
- WHILE e DO WHILE 
- SWITCH
- Tratamento de erros com exceções (TRY/CATCH/FINALLY)

Consideramos que o uso de tais controles é imperativo porque estamos controlando explicitamente nosso fluxo de trabalho dentro do código e quais decisões são executadas conforme as condições que definimos.

>As estruturas ou laços de controle são usados para controlar o processo de nosso código.


###### Paradigma Declarativo:
Ao utilizar o paradigma declarativo, vamos trabalhar a lógica do que vai ser executado, sem indicar os detalhes de como vai ser executado. Ao utilizar este método, nosso código será composto de um conjunto de funções que executarão a tarefa que definimos. É muito importante ter testes automatizados para testar nosso código. Ao executá-los e ver os resultados, conseguiremos identificar erros na lógica de nosso código. Podemos dizer que a abordagem declarativa define o estado final de nossa infraestrutura.

>Métodos são usados para processar nosso código e, em seguida, os testes são executados.

##### O princípio da idempotência

A idempotência é um princípio matemático utilizado em infraestrutura. Mas o que é isso? Podemos definir idempotência como a propriedade de usar um número "n" de automação sempre e em todos os casos obtendo o mesmo resultado. Como a idempotência se aplica à infraestrutura como código?

Através das ferramentas Ansible, Terraform ou CLoudFormation, independente de qual seja o ponto de partida, iremos sempre ter o mesmo resultado, assim como nas multiplicações por "0"

###### As etapas da idempotência são: 
- Origem: Configuração com JSON ou YML
- Processo: operações realizadas pela ferramenta IaC com base no arquivo fonte
- Destino: estado final da infraestrutura conforme a necessidade.

###### Benefícios de aplicar a idempotência nessas 3 etapas:
- Modificar o arquivo fonte modifica a infraestrutura
- Facilmente documentávle
- Implementar as práticas de desenvolvimento de software
- Automatizável