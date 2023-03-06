package MesaGuiada;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    public void calcularImc(String nome, int valorImc){
        System.out.println(this.nome + " seu IMC é " + valorImc);
    }
    public int calcularIdade(LocalDate dataNascimento){
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
