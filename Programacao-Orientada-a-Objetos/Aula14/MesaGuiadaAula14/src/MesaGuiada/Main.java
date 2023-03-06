package MesaGuiada;

public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador(9,"Firmino", false, false);
        Jogador jogador2 = new Jogador(11,"Salah", false, true);
        Jogador jogador3 = new Jogador(14, "Henderson", true,true);
        Jogador jogador4 = new Jogador(15,"Ox-Chamberlain", true,false);

        System.out.println(jogador4.compareTo(jogador1)); //Primeiro é lido o que tá dentro do parâmetro, jogador1 comparado com jogador4


        Equipe liverpool = new Equipe("Liverpool");
        liverpool.addJogador(jogador1);
        liverpool.addJogador(jogador2);
        liverpool.addJogador(jogador3);
        liverpool.addJogador(jogador4);

        liverpool.mostrarJogadoresTitulares();
        System.out.println("Qtd de jogadores lesionados e titulares: " + liverpool.getQuantidadeJogadoresLesionados());



    }
}
