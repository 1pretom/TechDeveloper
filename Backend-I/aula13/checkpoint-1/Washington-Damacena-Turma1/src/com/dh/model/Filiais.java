package com.dh.model;

public class Filiais {

    private int id;
    private String nome_filial;
    private String rua;
    private String numero;

    private String cidade;
    private String estado;
    private String cinco_estrelas;

    public Filiais() {
    }

    public Filiais(int id, String nome_filial, String rua, String numero, String cidade, String estado, String cinco_estrelas) {
        this.id = id;
        this.nome_filial = nome_filial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cinco_estrelas = cinco_estrelas;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_filial() {
        return nome_filial;
    }

    public void setNome_filial(String nome_filial) {
        this.nome_filial = nome_filial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCinco_estrelas() {
        return cinco_estrelas;
    }

    public void setCinco_estrelas(String cinco_estrelas) {
        this.cinco_estrelas = cinco_estrelas;
    }

    public String toString() {
        return "Paciente \n" +
                "------------------------------------------------------\n" +
                " id = " + id +
                " nome_filial = " + nome_filial + '\n' +
                " rua = " + rua + '\n' +
                "numero = " + numero + '\n' +
                " cidade = " + cidade + '\n' +
                " estado = " + estado + '\n' +
                " cinco_estrelas = " + cinco_estrelas + '\n';

    }
}