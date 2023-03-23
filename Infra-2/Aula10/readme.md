    Aula 10: Infraestrutura como código: Terraform(continuação)

#### Os plugins de Terraform: providers e provisioners

A Terraform do ponto de vista da sua arquitetura interna: os plugins e sua forma de falar com a nuvem. É como se fossemos fazer uma radiografia da anatomia e entender o que se passa ao executarmos a Terraform em nossos computadores.

[Bastidores ferraform](bastidoresTerraform.pdf)

#### Domain Specific Language

HCL foi criada para ser amigável para humanos e rapidamente interpretada por computadores, criada pela Hashicorp para nos permitir interagir com serviços de ingraestrutura cloud.

    <BLOCK TYPE>  "<PROVIDER_ELEMENT>" "<BLOCK LABEL>"{
        <IDENTIFIER> = <EXPRESSION>  #Argumento/s
    }

`<BLOCK TYPE>`
- resource
    - Este bloco iniciará o diálogo com nosso fornecedor de nuvens. Especificamente, estamos dizendo: tudo o que acontece e com o que vou trabalhar é um recurso.
`<PROVIDER_ELEMENT>`
- “aws_vpc”
    - Aqui estamos declarando o recurso específico AWS a ser utilizado. Neste caso, um VPC
`<BLOCK LABEL>`
- “mi_vpc”
    - Como vou chamá-lo, como vou referi-lo se eu quiser invocar este elemento de outro módulo?
 `<IDENTIFIER>`
- cidr_block
    - Um valor definido pela HCL. Depende do recurso que declaramos. Neste caso, em "aws_vpc".
`<EXPRESSION>`
- 10.0.0.0/16
    - Representa um valor associado com o identificador. Por exemplo: região = "us-east-1", onde "us-east-1" é o valor.

[Terraform HCL](TerraformHCL.pdf)

##### Hora de praticar!

Já criamos uma VPC e uma instância EC2 em AWS com a Terraform. Agora, é hora de criar um ambiente mais parecido com o que poderíamos encontrar na vida real:

- Uma VPC com Internet Gateway para a saída para internet.
- Duas subnets (uma pública, onde serão instalados os serviços que serão acessíveis a partir da internet; e uma privada, onde estarão os serviços necessários e que estão securitizados do mundo exterior).
- Uma tabela de roteamento custom.
- Exposição de um website.

[Passo a passo](montandoInfraestruturaPassoAPasso.pdf)

Ansible é simples e amigavel
Cloudformation tem muita documentação
Terraform engloba outras usabilidades