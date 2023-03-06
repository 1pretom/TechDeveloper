package MesaDeTrabalho;

public class Jogador implements Comparable<Jogador>{
    private int numCamisa;
    private String sobrenome;
    private String posicao;
    private String titular;

    public Jogador(int numCamisa, String sobrenome, String posicao) {
        this.numCamisa = numCamisa;
        this.sobrenome = sobrenome;
        this.posicao = posicao;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public int compareTo(Jogador o) {
        if (o.numCamisa == this.numCamisa) {
            return 0;
        } else if (o.numCamisa < this.numCamisa) {
            return -1;
        } else return 1;
    }
}
