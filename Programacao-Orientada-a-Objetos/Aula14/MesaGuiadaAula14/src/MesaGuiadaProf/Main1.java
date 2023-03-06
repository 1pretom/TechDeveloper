package MesaGuiadaProf;

public class Main1 {
    public static void main(String[] args) {

        Jogador1 jogador1 = new Jogador1(7, "Carol", true, true);
        Jogador1 jogador12 = new Jogador1(24, "Diego", true, true);
        Jogador1 jogador13 = new Jogador1(5, "Ronaldo", false, false);
        Jogador1 jogador14 = new Jogador1(45, "Yana", false, true);

        Equipe1 equipe = new Equipe1("Turma1");

        equipe.addJogador(jogador1);
        equipe.addJogador(jogador12);
        equipe.addJogador(jogador13);
        equipe.addJogador(jogador14);

        equipe.mostrarJogadoresTitulares();

        System.out.println("Quantidade de jogadores lesionados: " + equipe.getQuantidadeJogadoresLesionados());

        System.out.println(jogador14.compareTo(jogador1));
        System.out.println(jogador1.compareTo(jogador14));


    }
}
