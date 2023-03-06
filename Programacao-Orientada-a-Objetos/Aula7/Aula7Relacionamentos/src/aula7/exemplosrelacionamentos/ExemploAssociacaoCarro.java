package aula7.exemplosrelacionamentos;

public class ExemploAssociacaoCarro {

    private int velocidadeMaxima;
    private String marca;

    //cria os relacionamentos; pode ser criado como um atributo do tipo da classe

    // 1 p 1 - cria o relacionamento com a classe Motor
    private ExemploAssociacaoMotor motor; //nesse caso aqui só está referenciando

    // 1 p n - cria o relacionamento com a classe Roda
    private ExemploAssociacaoRoda[] roda;

    public ExemploAssociacaoCarro(int velocidadeMaxima, String marca) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.marca = marca;

        //maneira de fazer como parâmetro de um constructor dentro de um construtor
        ExemploAssociacaoMotor motor = new ExemploAssociacaoMotor(); //nesse caso aqui a relação já é criada
    }

    //maneira de fazer como parâmetro de um método
    public void teste(ExemploAssociacaoMotor motor) {
        System.out.println("atividade do metodo");
    }

    //maneira de fazer como parâmetro de um método
    public void teste1(ExemploAssociacaoRoda[] qtdRodas) {
        System.out.println("atividade do metodo");
    }

}
