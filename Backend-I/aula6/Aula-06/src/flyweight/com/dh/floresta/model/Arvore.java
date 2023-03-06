package flyweight.com.dh.floresta.model;

public class Arvore {
    //artributos
    private String tipo, cor;
    private int altura, largura;

    //atributo para contar a quantidade de arvores
    public static int contador;

    //construtor
    public Arvore(String tipo, String cor, int altura, int largura) {
        this.tipo = tipo;
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        contador++;
    }

    //getters e setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }
}
