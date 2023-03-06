package model;

public class Endereco {
    private Integer id;
    private String rua;
    private String numero;
    private String cidade;
    private String bairro;

    public Endereco(Integer id, String rua, String numero, String cidade, String bairro) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.bairro = bairro;
    }
    public Endereco(String rua, String numero, String cidade, String bairro) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
