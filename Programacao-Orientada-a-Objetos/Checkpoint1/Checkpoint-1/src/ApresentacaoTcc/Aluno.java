package ApresentacaoTcc;

import org.w3c.dom.ls.LSOutput;

import static java.lang.System.*;

public class Aluno extends Pessoa{
    private String tituloDoTcc;
    private boolean arquivoEnviado;


    public Aluno(String nome, String sobrenome, String tituloDoTcc, boolean arquivoEnviado) {
        super(nome, sobrenome);
        this.tituloDoTcc = tituloDoTcc;
        this.arquivoEnviado = arquivoEnviado;
    }

    @Override
    public void estarPresente(String presente) {
        if (presente.equals("Sim")) {
            out.println("está presente");
        }else {
            out.println("Ausente");
        }
    }

    public void apresentar ( ){
        out.println("Apresentacao do aluno");
    }
    public int convidarPessoas( int quantidadeDeConvidados){
        return quantidadeDeConvidados;
    }

    public String getTituloDoTcc() {
        return tituloDoTcc;
    }

    public void setTituloDoTcc(String tituloDoTcc) {
        this.tituloDoTcc = tituloDoTcc;
    }

    public boolean isArquivoEnviado() {
        return arquivoEnviado;
    }

    public void setArquivoEnviado(boolean arquivoEnviado) {
        this.arquivoEnviado = arquivoEnviado;
    }
}
