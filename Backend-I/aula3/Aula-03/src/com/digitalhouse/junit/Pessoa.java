package com.digitalhouse.junit;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private LocalDate dataNasc;
    private String nome, sobrenome;

    List<String> colecao = new ArrayList<>();   //criando uma collection

    //Contrutor
    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    //Arraylist para pegar a pessoa
    public void adicionarNomes(Pessoa pessoa){
        int nomeTamanho = pessoa.getNome().length();
        int idade = pessoa.convertIdade();

            if (nomeTamanho >= 5 && idade >= 18){
                colecao.add(pessoa.getNome());
                System.out.println(colecao);
            }
    }

    //Converter a idade do LocalDate para int
    public int convertIdade(){
        int idade = Period.between(this.dataNasc, LocalDate.now()).getYears();
        return idade;
    }


    //Getters e Setters
    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

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

    public List<String> getColecao() {
        return colecao;
    }

    public void setColecao(List<String> colecao) {
        this.colecao = colecao;
    }

    //template toString para a string ficar bonitinha
    @Override
    public String toString(){
        return "Pessoa{" +
                "nome='" +nome+ '\'' +
                ", sobrenome ='" +sobrenome+ '\'' +
                ", idade=" +this.convertIdade()+
                '}';
    }

    //Para testar assert true e false
    public boolean returnTrue(){
        return ((2+2) == 4);
    }
}
