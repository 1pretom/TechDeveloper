    Aula 10

Nessa aula foi feita a prática no JAVA de como fazer:
- Herança.
- Sobrescrita.
- Sobrecarga.

Lembrando: para identificar corretamente os tipos de relacionamento entre as classes, devemos lembrar das palavras em *português*:
- *É um* ]----> **Herança**
- *Tem um* ou *usa um* ----> **Associação**
- *Faz parte de* um todo ----<> **Agregação**
- *Não existem sem o outro* ----< o > **Composição**

- Para ler, devemos verificar as setas do UML e fazer as identificações corretas.
<br><br>

# Anotações

## Herança
- Se tem um atributo no pai, não precisa ter no filho.
- Usa um 'extends -nome da classe-' para identificar que o filho pertence a uma classe pai.
- O construtor do filho pega os atributos do pai e faz isso criando dentro dele um 'super' que faz a referencia a super classe, quando usa o this significa que é um atributo específico da classe filha.

## Sobrescrita
- Quando faz sobrescrita não muda o método, apenas o seu conteúdo, a declaração dele não muda, porém no pai ele tem uma função e no filho ele tem outra. Ou seja, sobrescreve a ação do método, mas o método em si continua o mesmo.
- Existem duas formas de fazer, copiar do pai, ou alt+insert > Override Methods (ctlr+0).
- Se não modificar dentro, ele se comporta igual ao pai, então para que seja diferente, é necessário mudar o seu conteúdo.
- Mesmo método, mesmo parâmetro, mesma assinatura, mas dentro dele a ação que faz é modificada.
- Só é possível fazer quando é de pai pra filho.

 ## Sobrecarga
 - Não depende de herança e pode ser feito em qualquer classe.
 - Acontece quando precisa passar mais ou menos parâmetros do que o definido pelo anterior.
 - O java identifica qual ele vai pegar, a depender de quantos valores você colocar.
 - O que muda aqui é a quantidade de parâmetros.
 - É possível sobrecarregar também o construtor.
