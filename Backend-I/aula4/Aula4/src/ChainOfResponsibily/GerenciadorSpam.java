package ChainOfResponsibily;

//Classes concreta
public class GerenciadorSpam extends Gerenciador{

    //Só precisa colocar para mandar imprimir, pq não se encaixou em nenhum dos outros três
    //Esse cara aqui só imprime que é o spam.
    @Override
    public void verificar(Mail mail) {
        System.out.println("Email marcado como spam");
    }
}
