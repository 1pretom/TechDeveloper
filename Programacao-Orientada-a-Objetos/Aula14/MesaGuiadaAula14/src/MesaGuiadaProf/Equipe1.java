package MesaGuiadaProf;

import java.util.ArrayList;
import java.util.Collections;

public class Equipe1 {

    private String nome;

    private ArrayList<Jogador1> listaJogadores = new ArrayList<>();

    public Equipe1(String nome) {
        this.nome = nome;
    }

    public void addJogador(Jogador1 jogador1){
        listaJogadores.add(jogador1);
    }

    public void mostrarJogadoresTitulares(){
        Collections.sort(listaJogadores); // ordena a list em ordem crescente, caso decrescete seria .reverseorder()

        //Para cada Jogador da listaJgadores ele adiciona no jogador
        for (Jogador1 jogador1 : listaJogadores ) {
            if (jogador1.isTitular()){
                System.out.println("Nome: " + jogador1.getNome() + " Número camisa: " +
                        jogador1.getNumeroCamisa());
            }
        }
    }

    public int getQuantidadeJogadoresLesionados(){
        int contador = 0;
        for (Jogador1 jogador1 : listaJogadores) {
            if (jogador1.isLesionado() && jogador1.isTitular()){
                contador++;
            }
        }
        return contador;
    }
}
