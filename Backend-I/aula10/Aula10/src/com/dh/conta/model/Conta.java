package com.dh.conta.model;

public class Conta {
    //atributos
    private int id;
    private String nome, numConta;
    private double saldo;

    //construtores

    public Conta(int id, String nome, String numConta, double saldo) {
        this.id = id;
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    //getters e setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //método para aumentar o saldo
    public double aumentarSaldo(double valor){
        this.saldo += valor;
        return this.saldo;
    }
}
