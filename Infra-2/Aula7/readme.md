    Aula 7: Infraestrutura como código: Possível

#### Três ferramentas: Ansible

Na semana passada, exploramos e praticamos no CloudFormation. Durante a aula de hoje, continuaremos com a Ansible. Como surgiu? Como funciona? O que nos permite fazer?

![Ansible](https://assets.digitalhouse.com/content/br/mkt/Tr%C3%AAs%20ferramentas_Ansible_Mesa%20de%20trabajo%201.png)

##### Do que se trata a Ansible?

É um projeto comunitário open source projetado pra auxiliar as organizações e automarizar o fornecimento d einfraestrutura, o gerenciamento da configuração e a implantação de aplicações. Ainda, é importante considerar que ele é fácil de aprender.

Com o Ansible, criam-se arquivos de configuração chamados playbooks, escritos em YAML, que são utilizados pra indicar o estado requisitado da infraestrutura. Ao serem executados, a Ansible é responsável pelo fornecimento da infraestrutura necessária para alcançar o estado descrito.

Isso significa que é possíve, por exemplo, criar uma máquina virtual no fornecedor de infraestrutura - como uma instrancia EC2 dentro da AWS - aplicando metodologias de infraestrutura como código.

###### Os objetivos dessa ferramenta são
- Minimalismo por natureza
- Consistência
- Segurança
- Confiabilidade
- Aprendizagem mínima necessária

###### Ansible ainda permite:
- Gerenciar configurações
- Implantar aplicações
- Manipular IaC

#### Como utilizar o Ansible?

É uma ferramenta que permite gerenciar as configurações da infraestrutura. No momento, as principais vantagens do uso são:

- Não precisa de instalação de agentes.
- Sua configuração é fácil de ler.
- É muito flexível(usa APIs e plugins).
- Por ser baseada em YAML, é fácil de usar.

###### Alguns módulos da Ansible
O coração da Ansible é a execução de arquivos de playbooks, com as instruções necessárias para conseguirmos a infraestrutura que queremos, de modo que não seja preciso escrever a lógica repetidamente em cada caso de uso e, também, para que o nosso código utilize o paradigma declarativo. Para isso, teremos à disposição módulos com problemas comuns já resolvidos.

Nas nossas práticas, utilizaremos o conjunto de módulos do AWS. Enquanto isso, você pode procurar o que for preciso para o tipo de infraestrutura ou fornecedor que esteja utilizando. Clique [aqui](https://docs.ansible.com/ansible/latest/collections/community/aws/index.html#) para visualizar a lista completa de módulos para este fornecedor cloud.

##### Pontos fortes
![pontos fortes](https://assets.digitalhouse.com/content/br/mkt/Voc%C3%AA%20sabia%20que_ansible_Mesa%20de%20trabajo%201%20copia%202.png)

#### Onde podemos usá-lo?

Durante esta aula, você aprendeu a executar playbooks da Ansible, mas… onde podem ser executados?

###### A flexibilidade da Ansible permite fazê-lo em diferentes espaços:

- No seu computador.
- Em um servidor que possa ser utilizado para executar Ansible.
- No projeto de código aberto AWX, que você poderá instalar e usar para gerenciar seus playbooks.

Esta última alternativa tem uma grande vantagem: permite a você gerenciar suas automações e delegar a áreas operacionais sem conhecimentos sobre Ansible, para que elas possam executar seus playbooks conforme necessário. Você só deverá se preocupar em continuar automatizando!

Leia mais sobre AWX na sua [documentação oficial.](https://github.com/ansible/awx/blob/devel/INSTALL.md)

[Documento guia passo a passo - Ansible.pdf](https://github.com/1pretom/TechDeveloper/blob/main/Infra-2/Aula7/%5BPOR%5D%20Guia%20passo%20a%20passo%20-%20Ansible.pdf)

#### Quem usa Ansible?

É uma ferramenta muito flexível que nos permite gerenciar a infraestrutura. Esse é o perfil básico necessário para o uso desta ferramenta:

![Qual tipo de analista de infraestrutura você é se você usa Ansible?](https://assets.digitalhouse.com/content/br/mkt/Que%20tipo%20de%20analista%20de%20infraestrutura_ansible_Mesa%20de%20trabajo%201%20copia%202.png)


#### Prática: 
Durante esta aula, você aprendeu a utilizar a Ansible, percorrendo sua história, conhecendo suas vantagens e descobrindo o que é preciso para executar esta ferramenta no seu computador.

Vamos ao que interessa! Ao trabalhar em tecnologia, receber arquivos com erros é muito frequente. No momento de fazer a primeira tentativa, eles não funcionam bem… É por isso que você precisa da habilidade de identificar erros através de execuções ou debugando.

Dê uma olhada neste exemplo e corrija os erros de sintaxe que você encontrar. Ele tem que rodar sem erros!

[Exercício.pdf](Exercicio.pdf)