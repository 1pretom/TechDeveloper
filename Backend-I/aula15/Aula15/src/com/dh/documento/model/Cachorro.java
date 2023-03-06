package com.dh.documento.model;

import java.io.Serializable;

//temos que informar que a classe pode ser serializada
// antes de tentar serializar ela, criando com a interface Serializable
public class Cachorro implements Serializable {
    private int idade;
    private String nome;

    public Cachorro(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }
    public Cachorro() {

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
