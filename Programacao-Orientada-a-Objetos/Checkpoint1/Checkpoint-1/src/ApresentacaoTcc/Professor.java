package ApresentacaoTcc;

import static java.lang.System.out;

public class Professor extends Pessoa {
    private String disciplina;
    private boolean tutorDeAluno;

    public Professor(String nome, String sobrenome, String disciplina, boolean tutorDeAluno) {
        super(nome, sobrenome);
        this.disciplina = disciplina;
        this.tutorDeAluno = tutorDeAluno;
    }

    @Override
    public void estarPresente(String presente) {
        if (presente.equals("Sim")) {
            out.println("está presente");
        }else {
            out.println("Ausente");
        }
    }

    public int avaliar(int nota ){
        return nota;
    }
    public boolean aprovar(String aprovado){
        if (aprovado.equals("Sim")){
            return true;
        }else{
            return false;
        }
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public boolean isTutorDeAluno() {
        return tutorDeAluno;
    }

    public void setTutorDeAluno(boolean tutorDeAluno) {
        this.tutorDeAluno = tutorDeAluno;
    }
}
