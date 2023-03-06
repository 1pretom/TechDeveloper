## Singleton

É um **design pattern criacional** que garante que uma classe tenha uma única instancia e define um ponto global de acesso para ela.
- Uma classe gerencia sua própria instancia e evita que outras classe criem instancia dela.
- Para criar uma instância nesse padrão, tem que passar pela classe obrigatóriamente e nenhuma outra classe pode instanciar ela.
- Esse padrão também oferece um ponto de acesso a instancia.
- Caso não tenha uma instancia, ela mesma é que cria e retorna a nova instancia criada.

Como criar uma classe **Singleton**:
- Cria um **atributo estático** do mesmo tipo da classe com o nome instance;
- Todos os **construtores** da classe devem utilizar o modificador **private**;
- Criar um método estático **getInstance()** que retorna o atributo instance.

Como fica isso no UML?

|SingletonExemplo|
|-|
|`- <<static>> instance: SingletonExemplo`|
|`- <<construtor>> SingletonExemplo `<br> `+ <<static>> getInstance(): SingletonExemplo`|
<br>
<br>




É uma abordagem bastante antiga, a classe tem um construtor privado e exportamos um membro estático público para dar a cesso à instância exclusiva:

    public static GerenciadorDeJanelas {
        public static final GerenciadorDeJanelas INSTANCE = new GerenciadorDeJanelas();
        
        private GerenciadorDeJanelas() {  
        }
    }

Sendo o construtor privado, ele não pode ser instanciado em outro local, é criado apenas uma vez dentro de uma única classe para inicializar o campo final estático **INSTANCE**.
<br>
Vemos também a outra forma para implementar o Singleton que é através de um método de fabricação estático:

    public class GerenciadorDeJanelas{
        private static final GerenciadorDeJanelas INSTANCE = new GerenciadorDeJanelas();

        private GerenciadorDeJanelas(){
        }

        public static GerenciadorDeJanelas getInstance(){
            return INSTANCE;
        }
    }

Dessa outra forma todas as chamadas do método `GerenciadorDeJanelas.getInstance()` retornam a mesma referência de objeto.
A grande vantagem é que através de um método público, se torna claro que essa classe é um Singleton. Outra vantagem é que dessa outra forma, retornar uma instância diferente para cada chamada ou alterar o comportamento, seria bastante simples.

###### Em resumo: O padrão SIngleton é utilizado quando necessita-se de um ponto único para criação de uma instancia da classe, e quando precisa-se de apenas uma instancia da classe.
<br>
#### Exemplo:
Normalmente uma classe que só precisa de uma instancia é a classe utilizada pra conexão com banco de dados. Para evitar possíveis problemas de ter mais de uma conexão com o banco de dados, devemos bloquear essa possibilidade e também fazer com que apenas uma instancia dela exista.
###### Código da classe Banco de Dados com o padrão Singleton:

    public class BancoDeDados{
        //Atributo do mesmo tipo da classe
        private static BancoDeDados instance = new BancoDeDados();

        //Construtores privados
        private BancoDeDados(){
            /*Inicializações */
        }
        
        //Método getInstance() estático
        public static BancoDeDados getInstance(){
            
            return instance;
    
        }
    }