    Aulas 4, 5 e 6

## Switch de caso de teste
São vários casos de testes compilados no mesmo documento. <br>
[Esse é um exemplo de switch de caso de teste](https://github.com/1pretom/CertifiedTechDeveloper/blob/main/Testing-1/Semana-2/Switch-de-Caso-de-Teste-Washington.xlsx).<br>
No momento em que essa planilha é preenchida, a ação e o resultado esperado devem ser o mais detalhado possível, para que a pessoa que for testar, possa identificar com facilidade os passos que devem ser seguidos. 
A declaração de um ***requisito*** deve atender às caracteristicas: 
- Necessário
- Apropriado
- Preciso e claro
- Completo
- Exclusivo
- Viável
- Verificável
- Correto
***
## Ciclo de vida do teste de software
Não existe um processo único universal, existem atividades comuns que nos ajudam a atingir as metas estabelecidas

#### O processo de teste no contexto
Alguns fatores influenciam o processo de teste como:
- Modelo de ciclo de vida de desenvolvimento e metodologias de projeto
- Níveis e tipos de evidencia
- Riscos do produto e projeto
- Domínio de negócios
- Restrições operacionais, como prazo e complexidade, mas não somente elas. Outro exemplo de restrição é o de ferramentas.

### Planejamento
Define os objetivos e o foco do teste nas restrições impostas pelo contexto. 

**Sub-atividades:**
- Determinar o escopo, objetivos e riscos
- Definir a abordagem e estratégia geral
- Integrar e coordenar as atividades a serem realizadas durante o ciclo de vida do software, ou seja, quem vai ficar responsável por o que.
- Definir as especificações técnicas, tarefas de teste apropriadas, pessoas e outros recursos necessários, sabendo-se o escopo consegue definir as etapas que vai seguir e como desenvolver isso. 
- Estabelecer um cronograma de teste pra cumprir um prazo limite
- Gerar o plano de teste

**Documentos de saída:** o que precisa ser concluído aqui pra passar pra proxima etapa?
- Plano de teste - geral e/ou por nível de teste.

O ideal é passar pra proxima fase só quando essa termina, mas sabemos que no mundo real ainda existem coisas em planejamento quando se inicia a proxima, que é:
### Acompanhamento e controle
O objetivo é reunir informações, fornecer feedback e visibilidade sobre as atividades de teste. Afins de controle, ações corretivas podem ser tomadas, como a mudança na prioridade dos testes, cronograma e reavaliar critérios de entrada e saída.

**Sub-atividades**
- Verificar os resultados e registros dos testes em relação com critérios de cobertura específicados.
- Determinar se mais testes são necessários, dependendo do nível de cobertura que deve ser alcançado.

**Documentos de saída**
- Relatório de progresso do teste

### Análise
Determina "O que testar". Vê se tudo tá sendo feito à risca.

**Sub-atividades**

- Analisar a base de teste correspondente ao nível de teste considerado -- informações de design e implementaçao, a implementação do componente ou do sistema em si, relatórios de análise de risco, etc.
- Identificar defeitos de diferentes tipos nas bases de teste -- ambiguidadres, omissões, inconsistências, imprecisões, etc.
- Identificar os requisiros a serem testados e definir as condições de teste para cada requisito.
- Capturar a rastreabilidade entre a base de teste e as condições de teste.

**Documentos de saída**

- Contratos de teste que contêm condições de teste.

### Design
É aqui que se determina "Como testar"

**Sub-atividades**
- Projetar e priorizar casos de teste e conjuntos de casos de teste de alto nível.
- Identificar os dados de teste necessários.
- Projetar o ambiente de teste e identificar a infraestrutura e ferramentas necessárias
- Capturar a rastreabilidade da base, condições, casos e procedimentos de teste

**Documentos de saída**
- Casos de teste de alto nível projetados e priorizados.

### Implementação
Os produtos de teste necessários para a execução do teste são concluídos, incluindo o sequenciamento de casos de teste em procedimentos de teste.

**Sub-atividades**
- Desenvolver e priorizar procedimentos de teste.
- Criar suítes de teste (test suite) a partir de procedimientos de teste.
- Organizar as suítes de teste dentro de um cronograma de execução.
- Construir o ambiente de teste e verificar se tudo o que é necessário foi configurado corretamente.
- Preparar os dados de teste e certificar-se de que estão carregados corretamente.
- Verificar e atualizar a rastreabilidade entre a base, as condições, os casos, os procedimentos e os conjuntos de teste.


**Documentos de saída**
- Procedimentos e dados de Teste.
- Cronograma de execução.
- Suíte de Testes.

### Execução 
Aqui é realizada a execução dos casos de teste.

**Sub-atividades** 
- Registrar os identificadores e as versões dos itens ou objetos de teste.
- Executar e registrar o resultado do teste de forma manual ou utilizando ferramentas.
- Comparar os resultados reais com os resultados esperados.
- Reportar sobre os defeitos em função das falhas observadas.
- Repetir as atividades de teste, seja como resultado de uma ação tomada para uma anomalia ou como parte do teste planejado  — reteste ou teste de confirmação.
- Verificar e atualizar a rastreabilidade entre a base de teste, as condições de teste, os casos de teste, os procedimentos de teste e os resultados de teste.

**Documentos de saída**
- Relatório de defeitos.
- Relatório de execução de testes.

### Conclusão
São coletadas informações de atividades concluídas e produtos de teste. Pode ocorrer quando um sistema de software é lançado, um projeto de teste é concluído  — ou cancelado —, uma iteração de um projeto ágil termina, um nível de teste é concluído ou uma versão de manutenção é concluída.

**Sub-atividades**
- Verificar se todos os relatórios de defeitos estão finalizados.
- Finalizar, arquivar e armazenar o ambiente, os dados, a  infraestrutura e outros produtos de teste para reutilização posterior.
- Transferir produtos de teste para outras equipes que podem se beneficiar do seu uso.
- Analisar as lições aprendidas com as atividades de teste concluídas
- Utilizar as informações coletadas para melhorar a maturidade do processo de teste.

**Documentos de saída**
- Relatório de resumo de teste.
- Lições aprendidas.
***
## Níveis de teste
### Teste de componente/unidade/unitário
é o teste que o desenvolvedor que faz, e não o QA, nesse teste o código que é trabalhado.

**Objetivos especícicos**
- Reduzir o risco.
- Verificar se os comportamentos funcionais e não funcionais do componente estão conforme o esperado.
- Construir confiança na qualidade do componente.
- Encontrar defeitos no componente.
- Evitar a propagação de defeitos para n´vieis de teste mais altos.

**Base de teste**
- Código.
- Modelo de dados.

**Objetos de teste**
- Componentes, unidades ou módulos.
- Códigos e estruturas de dados.
- Aulas.
- Módulos de banco de dados.

**Defeitos de falhas caracteristicas do teste**
- Funcionamento incorreto - por exemplo> não funciona conforme descrito nas especificações do projeto.
- Problemas de fluxo de dados.
- Código e lógica incorretos.

### Teste de integração
**Objetivos específicos**
- Verificar se os comportamentos funcionais e não funcionais das interfaces estão conforme projetado e especificado.
- Criar confiança na qualidade das interfaces.
- Impedir a propagação de defeitos para níveis mais altos

**Base de teste**
- Design de software.
- Casos de uso.
- Arquitetura.

**Objetos de teste**
- Subsistemas.
- Bases de dados.
- Microsserviços.

**Defeitos de falhas caracteristicas do teste**
- Dados relacionados.
- Incompatibilidade de interface. (na hora de juntar dois códigos, não combinar)
- Falhas de comunicação entre componentes
### Teste de sistema ou end 2 end

**Objetivos específicos**
- Verificar se os comportamentos funcionais e não funcionais do sistema estão conforme projetado e especificado.
- Validar se o sistema está completo.
- Considerar o sistema como um todo.
- Prevenir o prolongamento de defeitos na produção

**Base de teste**
- Relatórios de análise de testes.
- Casos de uso.
- Manuais do sistema e do usuário.

**Objetos de teste**
- Aplicativos, sistemas operacionais.

**Defeitos de falhas caracteristicas do teste**
- Cálculos errados.
- Falhas de tarefas funcionais de ponta a ponta.
- Falha em ambientes produtivos.
- Falha do sistema para funcionar conforme descrito nos manuais.
### Teste de Aceitação
Ele é um nível de teste que engloba todos os níveis como um todo. Ele é pra te perguntar se tá seguindo a documentação feita e os passos planejados para os testes. O teste de aceitação é como se fosse a piramide em si, e os outros testes os níveis dessa pirâmide. Sendo o de sistema mais alto e o de componente o mais baixo.
**Objetivos específicos**
- Estabelecer confiança na qualidade dos sistema como um todo
- Validar se o sistema está completo e se funcionará conforme o esperado
- Verificar se os comportamentos funcionais e não funcionais estão conforme especificado.

**Base de teste**
- Processos de negócios.
- Regulamentos, contratos legais e normas.
- Documentação do sistema ou do usuário.

**Objetos de teste**
- Sistemas em teste.
- Sistemas de recuperação e sites críticos.

**Defeitos de falhas caracteristicas do teste**
- Os fluxos do sistema não atendem aos requisitos de negócios ou do usuário.
- O sistema não atende aos requisitos contratuais ou regulamentares.
- Vulnerabilidades de segurança ou eficiência de desempenho inadequada.
***
## Tipos de teste
### Teste funcional 
- Inclui testes que avaliam as funções que o sistema deve executar. As funções descrevem o que o sistema faz.
- Analisa o comportamento de software
### Teste não funcional
- Testam "quão bem" o sistema se comporta.
- O design e a execução de testes não funcionais podem envolver habilidades ou conhecimentos especiais, como o conhecimento de fraquezas inerentes a um design ou tecnologia (por exemplo, vulnerabilidades de segurança associadas a determinadas linguagens de programação).

### Modelos de desenvolvimento de software
- Método tradicional.
- Método ágil com as metologias ágeis.

### Teste negativo e positivo
Teste negativo é pra mostrar que não funciona. No teste negativo, se você testa esperando que dê errado, mas dá certo, tem problema. Quando espera que erra e erre, tá certo.

Teste positivo é pra mostrar que tá acontecendo o que se esperava. No teste positivo, se você testa esperando que dê certo, mas dá errado, tem problema e vira teste negativo. QUando espera que acerta e acerta, tá certo também.