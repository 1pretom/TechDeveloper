package ApresentacaoTcc;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

    Aluno aluno1 = new Aluno("Gabrielle ", "Araujo ", "Abordade sobre a gravidez na adolescencia", true);
    Aluno aluno2 = new Aluno("Julia ", "Carvalho ", "Diagnósticos de Enfermagem identificados em Unidade de Terapia Intensiva Neonatal:", true);
    Aluno aluno3 = new Aluno("Washington ", "Damacena ","Estratégias educativas em saúde para reduzir a incidência de gravidez na adolescencia", false);
        System.out.println("A quantidade de convidados de " + aluno3.getNome() + aluno3.getSobrenome() + " é: " + aluno3.convidarPessoas(1));

    Professor professor1 = new Professor("Diana ", "Salete", "Saude da mulher", false);
    Professor professor2 = new Professor("Aline ", "Gomes", "Introdução a reprodução humana", true);
    Professor professor3 = new Professor("Emerson","Braga","Introdução a obstetricia", false);

    Convidado convidado1 = new Convidado("Josilene", "Lucia","Sim", true);
    Convidado convidado2 = new Convidado("Sofia", "Carvalho","Sim", true);
    Convidado convidado3 = new Convidado("Gabriela", "Vieira","Sim", true);

    Apresentacao apresentacao1 = new Apresentacao(LocalDateTime.of(2022,10,11,10,00), aluno1);
    Apresentacao apresentacao2 = new Apresentacao(LocalDateTime.of(2022,10,11,10,30), aluno2);
    Apresentacao apresentacao3 = new Apresentacao(LocalDateTime.of(2022,10,11,11,00), aluno3);

    }
}
