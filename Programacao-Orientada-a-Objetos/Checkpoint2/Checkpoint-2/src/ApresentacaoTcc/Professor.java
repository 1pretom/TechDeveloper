package ApresentacaoTcc;

import java.util.ArrayList;

import static java.lang.System.out;

    //Classe filha de pessoa
public class Professor extends Pessoa {
  //Parametros

    private boolean tutorDeAluno;
    private ArrayList<Aluno> listaAlunos = new ArrayList<>();

    //Construtores
    public Professor(String nome, String sobrenome ) {
        super(nome, sobrenome);


    }
    //Collections
    public void addAluno(Aluno aluno){
        listaAlunos.add(aluno);
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

    //Getters e Setters


        public boolean isTutorDeAluno() {
            return tutorDeAluno;
        }

        public void setTutorDeAluno(boolean tutorDeAluno) {
            this.tutorDeAluno = tutorDeAluno;
        }

        public ArrayList<Aluno> getListaAlunos() {
            return listaAlunos;
        }

        public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
            this.listaAlunos = listaAlunos;
        }
    }
