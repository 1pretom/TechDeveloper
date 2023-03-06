package vacinacaoProxyPattern;
//Interface
public interface Vacinar {
    //todos os métodos de interfaces são abstratos
    void vacinarPessoa(Pessoa pessoa);

    //quando se cria uma classe abstrata e ela só tem métodos abstratos, ela é uma interface
    //só deve ser classe abstrata quando dentro dela tem algum método concreto.
    //usa interface quando obrigatoriamente tem que usar os métodos que estão dentro, como um contrato
    //quando tem classe abstrata, a classe concreta não precisa usar todos os métodos
    //a classe abstrata tem atributos, construtores e métodos.


}
