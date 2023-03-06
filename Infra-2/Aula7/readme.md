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
