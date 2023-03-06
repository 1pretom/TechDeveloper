    Aulas 7, 8 e 9

## Caixa Preta vs Caixa Branca

|Critérios de comparação|Caixa Preta (Tem muito a ver com testes funcionais)|Caixa Branca |
|-|-|-|
|Base de teste|- Requisitos de software <br> - Especificações <br> - Casos de uso <br> - Histórias de usuários|- Arquitetura de software <br> - Projeto de software detalhado <br> - Qualquer outra fonte de informação relacionada à estrutura do software|
|Uso de especificações de software|São a principal fonte de referência para o projeto desses casos de teste.|São frequentemente usados como uma fonte adicional de informações para detectar o resultado esperado dos casos te teste.|
|Cobertura|É medida com base nos itens testados na base de teste e na técnica aplicada à base de teste.|É medida com base nos elementos testados dentro da estrutura selecionada - por exemplo, o código ou as interfaces.|


## Particionamento de equivalência
Os dados são divididos em intervalos,  se por exemplo for fazer uma pesquisa entre pessoas de 16 a 60 anos de idade, esse intervalo é o particionamento de equivalência e os resto é invalidado.
## Análise de valor limite
É uma extensão da técnica anterior na qual é utilizada quando a partição é ordenada e consiste em dados numéricos ou sequenciais. Quando é testado um limite, por exemplo, entre 0 e 5, deve-se testar -1, 0, 1, 4, 5 e 6. Ou seja, pega um antes e um depois dos valores limites.

## Tabela de decisão
Existe para analisar as combinações entre as condições de um teste e assim definir qual o resultado esperado pelas regras de negócio que o sistema deve implementar. Aqui são testadas as variáveis e condições.
|Variáveis|1|2|3|4|
|-|-|-|-|-|
|Cartão válido?|Não|Sim|Sim|Sim|
|Senha válida?|X|Não|Sim|Sim|
|Valor solicitado é <= Saldo?|X|X|Não|Sim|
|Saída esperada|Cartão inválido|Senha inválida|Saldo insuficiente|Saque efetuado com sucesso|
Ela é boa para ser usada em casos de poucas variáveis, quando tem muitas, é um pouco mais complexa de se identificar onde está um problema

## Teste de transição de estado
Mostra os possíveis estados e como o software transita entre seus estados.
||Insere Cartão|Senha OK|Senha NOK|
|-|-|-|-|
|E1 - Iniciar||||
|E2 - Esperar||||
|E3 - 1ª Tentativa||E6|E4|
|E4 - 2ª Tentativa||E6|E5|
|E5 - 3ª Tentativa||E6|E7|
|E6 - Acessar||||
|E7 - Bloquear|E1|||

## Testes estáticos e dinâmicos

|Testes dinâmicos|Testes estáticos|
|-|-|
|Em execução <br> Os testes são realizados enquanto o código está em execução.|Não execução <br> Os testes não são realizados em produtos de trabalho, como documentos de requisitos, casos de teste e código.|
|Detecção<br>Estes testes se concentram na deteclçao de defeitos.|Prevenção<br>Esses testes se concentram na prevenção de defeitos|
|Testes tardios<br>Esses testes são realizados quando o código é implantado.|Testes iniciais<br>Esses testes podem ser realizados desde os primeiros estágios do ciclo de vida do software.|
|Técnicas<br>Tipos de testes são usados: funcionais e não funcionais|Técnicas<br>São utilizadas técnicas como: revisão formal, inspeção, revisão de código.|


## Processo de revisão
As revisões consistem em **examinar tudo com cuidado o produto de trabalho** buscando encontrar e remover erros e pode ser realizado por uma ou mais pessoas. Essas revisões podem ser:
- Revisões formais: Tem funções definidas, seguem um processo e devem ser documentadas. Varia de empresa pra empresa.
- Revisões informais: Não seguem um processo definido e não são formalmente documentadas. É definida por você mesmo.

## Requisitos
**Requisitos Funcionais:** Definem o que um sistema permite fazer do ponto de vista do usuário. Esses requisitos devem ser explícitamente especifícados

**Exemplo:** O campo quantidade aceita apenas valores numéricos com duas casas decimais (testes funcionais ede sistema).

**Requisitos Não Funcionais:** Definir as condições de operação do sistema no ambiente operacional. 

**Exemplos:**
- Requisito de usabilidade: Quão fácil vai ser de uma pessoa ao ver, começar a usar
- Requisito de eficiência: Um exemplo é a quantidade de acessos
- Requisito de disponibilidade: quantas horas por dia está disponível para ser utilizada, nas terças por volta das 19hrs o cs está indisponível
- Requisito de confiabilidade: questão ética de acesso e segurança de dados, rede, virus, etc
- Requisito de integridade: esbarra na confiabilidade dependendo do ponto de vista, um exemplo é: não permitir que sofra alterações nos dados sem a permissão do usuário.
- Requisito de manutenção: atualização e evoluir a aplicação com ela em movimento, ou derruba que precisa testar? É ver a durabilidade da aplicação.

Existem outros requisitos além desses.

## Exemplo prático

||Processo de revisão|
|-|-|
|RF-01|Registro de membro|
|Objetivos associados|Gerenciar parceiros|
|Descrição|O sistema deve se comportar conforme descrito no seguinte caso de uso quando alguém solicita para se juntar a você como membro.|
|Condição prévia|O requerente não é sócio da locadora e tem seu documento de identidade disponível.|
|Sequência normal|<br>1. O funcionário da locadora solicita ao sistema que inicie o processo de registro de um novo membro.<br>2. O sistema solicita os dados do membro.<br>3. O funcionário da locadora solicita os dados necessários e a documentação do novo membro.<br>4. O funcionário da locadora verifica se os dados do novo membro coincidem com os da documentação fornecida.<br>5. O funcionário fornece os dados necessários e solicita que o sistema os armazene.<br>6. O sistema armazena os dados fornecidos, imprime o cartão de associado e informa ao funcionário da locadora que o processo foi concluído com sucesso.<br>7. O funcionário da locadora entrega o cartão ao novo membro.|
|pós-condição|O requerente é membro da locadora e o saldo da sua conta é 0.|
|Exceções|8. Se a documentação fornecida não estiver correta, o funcionário da locadora cancela a operação, então este caso de uso termina.<br>9. Caso o sistema detecte que o novo membro já é membro da locadora, o sistema informa a situação ao funcionário da locadora permitindo que ele modifique os dados fornecidos, então este caso de uso termina.<br>10. Se o funcionário da locadora solicitar o cancelamento da operação, o sistema cancela a operação, então este caso de uso termina.|
|Desempenho|5 segundos|
|Frequência esperada|10 vezes/dia|

