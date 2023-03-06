package MesaGuiada;

import java.time.LocalDate;

/*Uma classe abstrata sempre é superclasse e ela é abstrata pq nunca criaremos objetos com ela
Serve para agrupar certas classes sobre um critério específico para compartilhar
características e comportamentos em comum. É usado com herança */
public abstract class Impressora {
    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis;
    private Double porcentagemTinta;

    /*Nesse caso daqui o construtor serve apenas para criar as obrigatoriedades na hora de
    instenciar as classes filhas, porém para a classe abstrata o construtor não vai servir de nada.
    O objetivo do construtor aqui é unica e exclusivamente para que consiga
    reutilizar o construtor nas classes filhas*/
    public Impressora(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, Double porcentagemTinta) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
        this.porcentagemTinta = porcentagemTinta;
    }


    //Metodos concretos
    public boolean temPapel(){
        return this.folhasDisponiveis > 0;
    }
    public boolean precisaTinta(){
        if (this.porcentagemTinta > 0) return false;
        else {
            return true;
        }
    }
    //Metodo abstrato
    //Não existe e não pode implementar objetos nela
    //Serve só pra agrupamento de atributos e métodos em comum
    //Como o método não é implementado aqui não se usa {}
    /*Quando é um método abstrato, não tem imprementação no pai. Quando tem alí a palavra abstract
    significa que está OBRIGANDO os filhos a sobrescrever nesse método*/
    public abstract String imprimir();


    //GETTERS e SETTERS
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public Double getPorcentagemTinta() {
        return porcentagemTinta;
    }

    public void setPorcentagemTinta(Double porcentagemTinta) {
        this.porcentagemTinta = porcentagemTinta;
    }
}
