package ApresentacaoTcc;

//Classe abstrata
public abstract class Pessoa {
    //Parametros
    private String nome;
    private String sobrenome;

    //Construtores
    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    //Método abstrato
    abstract public void estarPresente( String presente );

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
}
