package MesaGuiada;

import java.util.ArrayList;
import java.util.Collections;

public class Equipe {
    private String nome;
    private ArrayList<Jogador> listaJogadores = new ArrayList<>();
    //para pegar só os nomes
    private ArrayList<String> listaNomes = new ArrayList<>();

    public Equipe(String nome) {
        this.nome = nome;
    }

    //adicionar na lista   (TipoParametro-classe    momeParametro)
    public void addJogador(Jogador jogador){
        listaJogadores.add(jogador);
    }

    //Somente os nomes
    public void addJogadorSomenteNomes(Jogador jogador){
        listaNomes.add(jogador.getNome());
    }

    //ordena a list em ordem crescente, caso decrescente seria .reverseorder()
    public void mostrarJogadoresTitulares(){
        Collections.reverseOrder(); //ordena a list em ordem crescente, caso decrescente seria .reverseorder()
        /*For Each usa quando quer ver TODOS, é muito mais comum usar ele*/
        //  Classe        nome: de onde vai receber)
        for (Jogador jogadorAnalisado : listaJogadores){ //O while serve pra quando está procurando um dado só, já os for servem pra percorrer a lista inteira
            //Para cada Jogador da listaJogadores ele analisa o if
            if (jogadorAnalisado.isTitular()){
                System.out.println("Nome: " + jogadorAnalisado.getNome() + " camisa: " +
                        jogadorAnalisado.getNumCamisa());
            }
        }
    }
    public int getQuantidadeJogadoresLesionados(){
        int i = 0;
        for (Jogador jogador: listaJogadores){
            if (jogador.isTitular() && jogador.isLesionado()){
                i++;
            }
        }return i;
    }

    //Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
