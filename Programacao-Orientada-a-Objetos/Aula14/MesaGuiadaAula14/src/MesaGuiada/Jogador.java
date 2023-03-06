package MesaGuiada;

public class Jogador implements Comparable<Jogador>{
    private int numCamisa;
    private String nome;
    private boolean lesionado;
    private boolean titular;

    public Jogador(int numCamisa, String nome, boolean lesionado, boolean titular) {
        this.numCamisa = numCamisa;
        this.nome = nome;
        this.lesionado = lesionado;
        this.titular = titular;
    }



    //Get e Set
    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    //CompareTo
    @Override
    public int compareTo(Jogador o) {
        if (o.numCamisa == this.numCamisa) {
            System.out.println("Os jogadores tem o mesmo número");
            return 0; //se iguais retorna 0
        }else if (o.numCamisa < this.numCamisa){
            System.out.println("O jogador de número: " + o.numCamisa + " é menor que o jogador de número: "+ this.numCamisa);
            return -1; //retorna que o numero do jogador 1 é menor que o 2
        }else {
            System.out.println("O jogador de número: " + o.numCamisa + " é maior que o jogador de número: "+ this.numCamisa);
            return 1; //retorna que o numero do jogador 2 é maior que o 1
        }
    }

}
