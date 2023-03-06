    aulas 17, 18 e 19

# Introdução a API Testing

## BE Testing

Um aplicativo da web tem 3 camadas: interface (UI), lógica de negócios e um banco de dados.

**Font-end testing:**
Presentation Layer (GUI)

**Back-end testing:**
Business Layer (API)
Database Layer      

O teste de back-end garant que os dados contigos no banco de dados de um aplicativo e sua estrutura atendem aos requisitos do projeto.

## Introdução a API

#### Application Programming Interface
URL(endpoint) => Devolve informações para que outro aplicativo consuma
![O que é API](https://github.com/1pretom/CertifiedTechDeveloper/blob/main/Testing-1/Semana-6/api-img-1.png?raw=true)

**Como funciona?**
![Como funciona API](https://github.com/1pretom/CertifiedTechDeveloper/blob/main/Testing-1/Semana-6/api-como-funciona.png?raw=true)
## HTTP 
Protocolo de transferência de hipertexto, é o protocolo cliente-servidor simples que articula as trocas de informações entre um servidor e uma aplicação que consome esses serviços. Essa comunicação é feita graças ao HTTP, que permite enviar e receber informação.

![](https://github.com/1pretom/CertifiedTechDeveloper/blob/main/Testing-1/Semana-6/api-metodos-http.png?raw=true)

[Status de HTTP em fotos de cachorros](https://httpstatusdogs.com/)
## Postman

É onde iremos usar o API, nele podemos também criar e testar.

No postman podemos escrever os testes, ou usar os Snippets que são como templates de testes.
Os utilizados na aula foram: Status code: 
- Code is 200;
- Response body: Contains string;
- Response time is less than: 200ms.
