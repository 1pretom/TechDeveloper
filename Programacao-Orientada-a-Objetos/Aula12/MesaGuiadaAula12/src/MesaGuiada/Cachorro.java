package MesaGuiada;

public abstract class Cachorro {
    private String nome;
    private String cor;
    private int idade;

    public Cachorro(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    abstract void latir();

}
