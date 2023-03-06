package vacinacaoProxyPattern;
import java.util.Date;

//Classe pessoa
public class Pessoa {
    //Atributos
    private String nome, sobrenome, rg, nomeVacina;
    private Date dataLiberacaoVacina;

    //Construtores
    public Pessoa(String nome, String sobrenome, String rg, String nomeVacina, Date dataLiberacaoVacina) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.nomeVacina = nomeVacina;
        this.dataLiberacaoVacina = dataLiberacaoVacina;
    }

    //Getters e setters
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public Date getDataLiberacaoVacina() {
        return dataLiberacaoVacina;
    }

    public void setDataLiberacaoVacina(Date dataLiberacaoVacina) {
        this.dataLiberacaoVacina = dataLiberacaoVacina;
    }
}
