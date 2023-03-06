package TemplateMethidPattern;

public class Contratado extends Funcionario{
        //Atributos
    private double valorHora;
    private int horas;

        //Construtores
    public Contratado(String nome, String sobrenome, String numeroConta, String localDeposito, double valorHora, int horas) {
        super(nome, sobrenome, numeroConta, localDeposito);
        this.valorHora = valorHora;
        this.horas = horas;
    }

        //Métodos
    @Override
    public double calcularSalario() {
        return valorHora*horas;
    }

        //Getters e Setters
    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }


}
