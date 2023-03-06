package MesaGuiada;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Aluno aluno = new Aluno ("Washington", "798797979", 10.0);
    aluno.calcularImc(aluno.getNome(), 5); //chamou de Pessoa(não sobrescreveu)
        System.out.println("A idade do(a)" + aluno.getNome() + " é " + aluno.calcularIdade(LocalDate.of(1980,02,28)));

        Empregado empregado = new Empregado("Henderson", "49251367", 1500.00,8.0);
        empregado.calcularImc(empregado.getNome(), 54); //sobrescrita, chamou do empregado

        System.out.println("Salário: " + empregado.calcularSalario(6.0));   //sobrecarga
        System.out.println("Salário: " + empregado.calcularSalario(6.0,12.0)); //sobrecarga
    }
}
