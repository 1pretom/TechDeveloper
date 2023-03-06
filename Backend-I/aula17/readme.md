    Aula 17

# MVC


#### MVC (Model View Controller)
Model é a camada do bano de dados, Controler é o "garçom" e view é a parte da interface

As vantagens são: 
- Separar a lógica do aplicativo (model) de sua representação (view);
- Facilitar a mobilização do código;
- Simplificar o desenvolvimento de cada camada;
- Maior velocidade da equipe no desenvolvimento;
- Facilitar a realização de testes unitários.

Um usuário percorreu uma lista de produtos através de uma interface gráfica e quer solicitar mais informações sobre o produto 20
|View| Controller| Model|
|-|-|-|
|A **View** se conecta ao **controller** para solicitar os dados.| O **controller** recebe a solicitação, valida se todos os dados estão corretos e solicita à **model** os detalhes do produto 20.| o **model** procura as informações solicitadas e as envia ao **controller**.|
|A **View** mostra ao usuário os dados que recebeu do controller.| O **controller** recebe as informações e envia os dados para a **view**.| <========< |

O Spring MVC tem anotações pra declarar quem são o controller, o service, a entidade, o repository, nessas anotações ele declara quem é cada parte do MVC

#### Definindo um Controller
A anotação @Controller indica que uma classe faz a função de controlador.
Ele serve de intermediário entre uma interface e um algoritmo que o implementa, recebendo os dados do usuário e enviando para as classes de acordo com o método chamado.

##### O trabalho do controller é:
- Obter os parâmetros HTTP (se houver)
- Disparar as regras de negócio
- Disponibilizar o resultado para a View poder fazer uso

Como fazer com que a partir da solicitação, um determinado controller se encarregue de entender o recurso e chamar a view correta?
Digitamos no navegador: https://localhost:8080/hello

##### Request Mapping
Utilizamos o @RequestMapping para relacionar uma URL a uma **classe** ou a um **método** de um controller em específico. Por exemplo:

    @Controller //Esta anotação define a classe HelloController como um controller do Spring MVC. 
    @ResponseBody // para informar que a resposta vem do body
    @RequestMapping("/hello") //Rota que informamos no navegador. Por exemplo: https://localhost/hello
    public class HelloController { 
        @RequestMapping(method = RequestMethod.GET)
        public String printHello(ModelMap model) {
            model.addAttribute("message", "Hello Spring MVC Framework!"); //Informação que enviamos para a View.
            return "hello"; //nome da view, ou seja, hello.html (a extensão padrão é html).
      }
    }

Usando ´@RequestMapping(‘’/hello’’)´ associamos a URL a classe HelloController, ou seja, indicamos que todos os métodos que compreendem esse controller são relativos a rota: ‘’/hello’’.
https://localhost:8080/hello

´@RequestMapping(method = RequestMethod.GET)´ Para que o Spring saiba qual o método do controller que deve processar a solicitação HTTP, podemos especificá-lo associando ao método da classe Java.

###### Outra forma de escrever o mesmo código:
    @Controller
    public class HelloController {
        @RequestMapping(value = "/hello", method = RequestMethod.GET)
        public String printHello(Model model) {
            model.addAttribute("message","Hello Spring MVC Framework!");
        return "hello";
        }
    }
#### Parametros
Os parâmetros da URL possuem uma chave e um valor separados por um sinal de igual (=) e unidos por um e comercial (&).
O primeiro parâmetro está sempre localizado após o ponto de interrogação na URL. Por exemplo:

https://exemplo.com.br/listaOfertas?mes=1&user=google

##### Obter parâmetros HTTP
Considerando o exemplo: 
O parâmetro **mes** terá o valor **1**

    @Controller
    public class ListaOfertasController {
        @RequestMapping(value= "/listaOfertas", method= RequestMethod.GET)
            public String procesar(Model model, @RequestParam("mes") int mes) {
            model.addAttribute("message","Hello Spring MVC Framework!");
        model.addAttribute("mes", mes);
            return "ofertas";
            } 
    } 
@RequestParam associa e converte um parâmetro HTTP em um parâmetro Java.

##### Outras anotações 
@GetMapping, @PostMapping, @PutMapping e @DeleteMapping estão no Spring 4.3 e nos permitem simplificar o manuseio dos diferentes métodos do Spring MVC que definimos com o @RequestMapping.

    @Controller
    public class HelloController { 
        @GetMapping ("/hello")
        public String printHello(Model model) {
            model.addAttribute("message", "Hello Spring MVC Framework!");
            return "hello";
        }
        @PostMapping("/guardar")
        public String guardarProducto(@RequestBody Employee employee) {
            return "has hecho una peticion post";
        }
    }



###### Algumas anotações 
Os testes são feitos na pasta "test"
No mvp a parte do view fica com o front-end
O anotation (anotação(@)) serve pra mudar o comportamento natural de uma classe