package com.dh.farmacia.model;

public class Medicamento {
    //atributos
    private int id, quantidade;
    private String nome, laboratorio;
    private double preco;

    //construtores

    public Medicamento() {

    }

    public Medicamento(int id, int quantidade, String nome, String laboratorio, double preco) {
        this.id = id;
        this.quantidade = quantidade;
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.preco = preco;
    }

    //getters e setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
