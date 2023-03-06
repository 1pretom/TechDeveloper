package TemplateMethidPattern;

public abstract class Funcionario {
        //Atributos
    private String nome, sobrenome, numeroConta, localDeposito;

        //Construtores
    public Funcionario(String nome, String sobrenome, String numeroConta, String localDeposito) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroConta = numeroConta;
        this.localDeposito = localDeposito;
    }

        //Métodos
    public void pagamentoDeSalario(){
        double salario;
        salario = calcularSalario();
        imprimirRecibo(salario);
        depositar(salario);
    }

    public abstract double calcularSalario();

    public void imprimirRecibo(double salario){
        System.out.println("O saláro calculado para o funcionário: " +this.nome+ " é de "+ salario);
    }

    public void depositar(double salario){
        System.out.println("O valor de " +salario+ " foi depositado na conta " +this.numeroConta+ " em nome de " +this.nome);
    }

        //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getLocalDeposito() {
        return localDeposito;
    }

    public void setLocalDeposito(String localDeposito) {
        this.localDeposito = localDeposito;
    }
}
