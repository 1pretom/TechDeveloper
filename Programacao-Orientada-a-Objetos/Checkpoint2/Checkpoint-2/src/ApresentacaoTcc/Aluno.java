package ApresentacaoTcc;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

import static java.lang.System.*;

    //Classe filha de pessoa
public class Aluno extends Pessoa{
    public String setNome;
    private String tituloDoTcc;
    private boolean arquivoEnviado;


    //Construtores
    public Aluno(String nome, String sobrenome, String tituloDoTcc, boolean arquivoEnviado) {
        super(nome, sobrenome);
        this.tituloDoTcc = tituloDoTcc;
        this.arquivoEnviado = arquivoEnviado;
    }

    //Sobrescrição
    @Override
    public void estarPresente(String presente) {
        if (presente.equals("Sim")) {
            out.println("está presente");
        }else {
            out.println("Ausente");
        }
    }

    //Métodos
    public void apresentar ( ){
        out.println("Apresentacao do aluno");
    }
    public int convidarPessoas( int quantidadeDeConvidados){
        return quantidadeDeConvidados;
    }

    //Getters e Setters
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
