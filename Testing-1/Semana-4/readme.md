    Aulas 10, 11 e 12

## Execução dos casos de teste
- Registrar os identificadores e versões é muito importante para não cometer deslizes.
- Executar testes manualmente ou usando ferramentas de execução de teste.
- Comparar os resultados reais com os resultados esperados.
- Analisar anormalidades para estabelecer suas prováveis causas.
- Relatar os defeitos com base nas falhas observadas.
- Registrar o resultado do teste.
- Repetir as atividades de teste, seja como resultado de uma ação tomada para uma anomalia ou como parte de um teste planejado.

## Testes de fumaça (Smoke test)
Ver se a aplicação funciona por cima e é feito de forma rápida, é superficial e vê se tá tudo em ordem, é como uma passada de olho. Ele é possível de ser automatizado. Sua função é garantir que as funcionalidades essenciais estão funcionando
- Avalia a estabilidade de compilações de software iniciais ou recém-desenvolvidas.
- Corresponde aos conjuntos de teste que cobrem a principal funcionalidade de um componente ou sistema.
- Seu objetivo é garantir que as funcionalidades cruciais do sistema funcionem, mas sem se preocupar com os detalhes.
- Geralmente requerem pouco tempo de execução.

## Testes de regressão
- Correspondem aos conjuntos de testes que nos permitem garantir que qualquer melhoria, atualização ou alteração de código não tenham danificado componentes, interfaces ou sistemas existentes.
- Dentro de um projeto de automação, o ideal é começar com testes de regressão, pois estes são executados muitas vezes e geralmente demoram a evoluir.

## Tesde de acordo com o ambiente
O normal é que tenham apenas dois ambiente, pq os ambientes são caros de serem desenvolvidos e é possível testar tudo que precisa num número reduzido

![Teste de acordo com o ambiente](https://github.com/1pretom/CertifiedTechDeveloper/blob/main/Testing-1/Semana-4/Tipos-de-teste-de-acordo-com-o-ambiente.png?raw=true)

O tester geralmente não tem acesso ao ambiente de produção. Nas poucas vezes que tem
- Não se deve exercutar ações que geram dados.
- Existe o risco de inserir dados indesejados.
- Os dados de rastreamento sofrem interferência.

### DEV
**Tstes unitários ou de componentes:** Também conhecidos como testes de módulo. Se concentram em componentes que podem ser testados separadamente. Tem como objetivo encontrar defeitos no componente e verificar se os comportamentos funcionais e não funcionais do mesmo estão de acordo com o que foi projetado e especificado.
**Testes de integração**: Se concentram nas interações entre componentes ou sistemas. Os objetivos do teste de integração incluem encontrar defeitos nas próprias interfaces ou nos componentes ou sistemas e verificar se os comportamentos funcionais e não funcionais das interfaces estão de acordo com o que foi projetado e especificado.

### QA

**Testes funcionais:** Inclui testes que avaliam as funções que o sistema deve realizar. Os requisitos funcionais podem ser descritos em produtos de trabalho, como especificações de requisitos de negócio, user story, casos de uso e especificações funcionais. 

**Testes de casos de uso:** Proporcionam testes transacionais baseados em cenários que devem simular o uso do sistema.

**Testes de precisão:** Compreendem a conformidade da aplicação com os requisitos especificados ou implícitos e pode também abranger a precisão do cálculo.

**Testes de adequação:** Envolvem avaliar e validar a eficiência de um conjunto de funções para realizar as tarefas especificadas previstas. Estes testes podem ser baseados em casos de uso.

**Testes de sistema:** Se concentram no comportamento e nos recursos de todo um sistema ou produto, geralmente levando em consideração as tarefas de ponta a ponta que o sistema pode realizar e os comportamentos não funcionais que exibem durante a realização destas tarefas.

**Testes de regressão:** Implicam na  realização de testes para detectar efeitos secundários não desejados, logo após alterações feitas em uma parte do código que podem afetar acidentalmente o comportamento de outras partes do mesmo.

**Testes de confirmação:** Consiste em re-executar os passos para reproduzir a falha ou as falhas causadas por um defeito na nova versão do software, uma vez que o defeito foi corrigido, a fim de confirmar que o defeito original foi satisfatoriamente resolvido ou para detectar efeitos colaterais indesejados.

**Sanity test:** É um teste de regressão limitado que se concentra em uma ou algumas poucas áreas de funcionalidade. É usado para determinar se uma pequena seção da aplicação ainda está funcionando após uma pequena alteração.


**Smoke tests:** Um teste de fumaça é realizado para garantir que as funções mais importantes de um programa estejam funcionando corretamente, mas sem se preocupar com os detalhes mais sutis.


### UAT

**Testes de aceitação:** Normalmente, se concentram no comportamento e nos recursos de todo um sistema ou produto. Além disso, podem produzir informações para avaliar o grau de preparação do sistema para implantação e uso por parte do cliente (usuário final).

**Testes exploratórios:** Os testes informais (não predefinidos) são projetados, executados, registrados e avaliados dinamicamente durante a execução do teste. Os resultados são utilizados ​​com o objetivo de aprender mais sobre o componente ou sistema e criar testes para as áreas que necessitem ser testadas com maior intensidade.

**Testes de usabilidade:** Avaliam a facilidade com que os usuários podem utilizar ou aprender a utilizar o sistema para atingir um objetivo específico em um determinado contexto.


**Testes de acessibilidade:** Incluem e avaliam a acessibilidade do software para aqueles com necessidades específicas ou restrições de uso. Isso inclui os usuários com deficiência.

### STG (staging)

**Testes de manutenção:** Se concentram no teste de alterações no sistema, bem como no teste de peças não modificadas que podem ter sido afetadas pelas alterações. A manutenção pode incluir lançamentos planejados e não planejados.

**Testes de segurança:** Os testes de segurança podem ser definidos como o conjunto de atividades realizadas para encontrar falhas e vulnerabilidades no sistema, visando reduzir o impacto de ataques e perda de informações importantes.

**Testes de desempenho:** São implementados e executados para avaliar as características relacionadas ao desempenho do local do teste, como perfis de tempo, fluxo de execução, tempos de resposta e a confiabilidade e os limites operacionais. Eles também podem ser executados em STG.

**Testes de carga, estresse e escalabilidade:** Um teste de carga garante que um sistema possa controlar um volume de tráfego esperado. Um teste de estresse é quando o sistema é submetido a condições extremas de uso para garantir sua robustez e confiabilidade. Os testes de escalabilidade garantem a escalabilidade de um sistema, ou seja, que ele possa suportar o aumento da demanda na operação. Também podem ser realizados no ambiente QA.

**Testes de infraestrutura:** Incluem todos os sistemas internos de TI, os dispositivos externos associados, redes de internet, a nuvem e testes de virtualização.

**Testes de gestão de memória:** Avaliam o estado e a integridade da memória do sistema para identificar problemas em potencial.

**Testes de compatibilidade:** Incluem testes para verificar se o sistema é compatível com todos os navegadores de Internet e todos os sistemas operacionais do mercado.

**Testes de interoperabilidade:** Referem-se àqueles em que é realizada a avaliação da correta integração entre diferentes aplicações, sistemas, serviços ou processos que constituem uma plataforma ou solução tecnológica.

**Testes de migração de dados:** Incluem testes realizados durante a transferência de dados entre diferentes tipos de dispositivos de armazenamento, formatos ou sistemas de computador.

>Fazendo analogia dos ambientes de teste pensando em uma casa o **DEV** testa as fundações, vigas e amarrações. o **QA** testa se os muros estão bem levantados, se tá chovendo fora e molhando dentro. o **UAT** testa quando já tem telhado e pintura se o calor do sol tá entrando demais na casa. O **Staging** é a casa pronta, mas ainda não é o morador nela, então teste se a casa é facil de arrombar, se as tomadas estão funcionando, se tem luz natural como planejado, se vai tremer janela, parede e porta quando tocar som alto. O morador só entra no ambiente de produção.