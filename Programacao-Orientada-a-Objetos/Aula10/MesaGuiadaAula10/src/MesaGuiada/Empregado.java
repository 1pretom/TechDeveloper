package MesaGuiada;

import java.time.LocalDate;

public class Empregado extends Pessoa {
    private Double salario;
    private Double descontos;
    private String arquivo;

    public Empregado(String nome, String cpf, Double salario, Double descontos) { //herança
        super(nome, cpf);
        this.salario = salario;
        this.descontos = descontos;
    }
    public Empregado(String nome, String cpf, Double salario) { //herança e sobrecarga
        super(nome, cpf);
        this.salario = salario;
    }

    @Override
    public void calcularImc(String nome, int valorImc) { //sobrescrita
        System.out.println(nome + " seu IMC é: " + valorImc + ". Preste atenção aos valores e procure um médico.");
    }


    public Double calcularSalario (Double valorHora){ //sobrecarga
        salario = valorHora * 9;
        return salario;
    }
    public Double calcularSalario (Double valorHora, Double quantidadeHoras){ //sobrecarga
        salario = valorHora * quantidadeHoras;
        return salario;
    }
}
