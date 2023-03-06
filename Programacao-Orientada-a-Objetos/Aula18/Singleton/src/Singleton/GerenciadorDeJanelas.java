package Singleton;

public class GerenciadorDeJanelas{
    private static final GerenciadorDeJanelas INSTANCE = new GerenciadorDeJanelas("Janela");

    private GerenciadorDeJanelas(String janela){
        System.out.println(janela);
    }

    public static GerenciadorDeJanelas getInstance(){
        return INSTANCE;
    }
}
