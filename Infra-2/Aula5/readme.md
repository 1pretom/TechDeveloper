    Aula 5: Infraestrutura como código no AWS: CouldFormation

#### Do que se trata?

Vamos analisar mais de perto as ferramentas mais populares no domínio da Infra-estrutura como Código (IaC). Como elas são definidas? Como as utilizamos? Estas são apenas algumas das questões que vamos explorar. Começamos com a CloudFormation.

#### Do que se trata a CloudFormation?

CloudFormation é uma ferramenta nativa da Amazon Web Services (mais conhecida como AWS). Mas... por que é uma ferramenta tão popular? Porque nos dá a capacidade de implementar práticas de Infraestrutura como Código (IaC) nativamente dentro da AWS.

A CloudFormation cria e configura a infraestrutura que previamente definimos em um modelo de acordo com os requisitos que precisamos. Isso nos oferece algumas vantagens, como a criação de repositórios com nossos modelos para que eles sejam acessíveis ou para que os recursos de infraestrutura possam ser entregues rapidamente.

Ao longo da aula, aprenderemos como usar a ferramenta, em quais ambientes podemos usá-la e quais funções executam os modelos criados para a CloudFormation. Vamos começar!

##### Descobrindo a CloudFormation
Por que a CloudFormation surgiu e que problemas ela esperava resolver? Vamos descobrir mais sobre a ferramenta nativa AWS e em que elementos ela consiste.

Permite criar e configurar a estrutura que previamente definimos em um modelo com os requisitos que necessitamos, podendo criar repositórios com os modelos pra que sejam acessíveis e tenham entregas rápidas de recursos de infraestrutura, os modelos são reutilizaveis e parametrizaveis, escritos em JSON ou YML, Template ou TXT, em um modelo é possível escrever uma instancia completa do Amazon EC2

###### Caracteristicas mais notáveis da CloudFormation:

- Modelos parametrizáveis: Diferentes serviços podem ser escritos simplesmente alterando os parametros
- Automatizável: Os templates podem ser utilizados dentro de pipelines
- Rollback: É automatico destruindo o que foi produzido no caso de qualquer etapa da criação de infraestrutura falhar
- Preço: CloudFormation é livre para uso.

No fim das contas, as vantagens da cloudformation são de que ela nos permite gerenciar a infraestrutura em um ambiente controlado e previsível, reduzindo os tempos de implantação e acelerando a netrega de recursos.

#### Como utilizá-la?
Para nos apresentar como a ferramenta funciona, vamos considerar três conceitos importantes:

- Modelos: um arquivo de texto em formato JSON (JavaScript Object Notation) que descreve os recursos que queremos criar juntamente às suas propriedades.
- Pilha: esta é uma unidade gerada pela CloudFormation para a criação ordenada de recursos.
- Mudanças: um resumo das mudanças propostas para antecipar o resultado final.

###### Pontos fortes do CloudFormation:
- Podemos delegar tarefas e controlar o acesso com o IAM da AWS
- Atualmente, 37% do uso da nuvem  é com AWS
- Podemos fazer uma versão de nossos modelos utilizando o serviço S3
- No caso da CloudFormation detectar um erro no processo, o rollback é automático
- CloudFormation é parte da certificação "AWS Certified Solutions Architect - Associate" para formalizar nosso conhecimento sobre a nuvem.

#### Onde o usamos?

Como vimos ao longo desta aula, a CloudFormation pode ser usada em vários domínios diferentes:

- Podemos fazer isso por linha de comando a partir de nossos computadores.
- Em scripts (como PowerShell).
- Em pipelines, como parte de um conjunto de tarefas automatizadas encadeadas, formando um pipeline com um início e um fim.

Na guia a seguir, implementaremos um aplicativo WordPress com seu banco de dados e todos os recursos necessários para fazê-lo funcionar, tudo isso em poucos cliques graças ao CloudFormation!

[Criar um servidor WordPress com MySQL](Criar-um-servidor-WordPress-com-MySQL.pdf)

Documentação
Nos links a seguir, você encontrará a documentação do exemplo que fizemos no guia:

[Soluções de exemplo](https://docs.aws.amazon.com/pt_br/AWSCloudFormation/latest/UserGuide/sample-templates-applications-us-west-1.html)

[CloudFormation template#](https://s3.us-west-1.amazonaws.com/cloudformation-templates-us-west-1/WordPress_Single_Instance.template)


#### Quem o utiliza?

Os modelos CloudFormation permitem que os analistas de infraestrutura deleguem tarefas de criação de recursos a outras áreas, através do controle do mesmo código que as automações. Mas qualquer tipo de usuário pode executá-los?

Nesta seção, analisaremos o que deve ser considerado ao autorizar usuários fora da área de infraestrutura.

###### Que tipo de analista de infraestrutura você é se utiliza esta tecnolgia?
- Analista de infraestrutura de qualquer Seniority para executar CloudFormation a partir de qualquer ambiente.
- Analista de Infraestrutura Pleno ou Senior para escrever seus próprios modelos e executá-los a partir de qualquer ambiente
- Lider técnico ou Desenvolvedor Senior para executar um modelo de CloudFormation - com as permissões necessárias dentro do AWS - a partir do AWS CLI ou console web.
- Desenvolvedor de qulquer Seniority para executar os modelos dados a partir do console web.



wordpress-access é o nome do par de chaves
senha da "pilha" é: DBPassword: Bregobff2
DBUser: Bregobff2
DBRoot: Bregobff2