package ChainOfResponsibily;

//Classes concreta
public class GerenciadorGerencia extends Gerenciador{

    //Todas as vezes que o email cair aqui, vai verificar se o email é dele, se não for, volta para o
    //gerenciador abstrato e ele passa pra outro gerenciador concreto até chegar no spam
    @Override
    public void verificar(Mail mail) {
        if (mail.getDestino().equalsIgnoreCase("gerencia@colmeia.com") ||
                mail.getAssunto().equalsIgnoreCase("Gerencia")){
            System.out.println("Enviado ao departamento gerencial");
        }else{
            if (this.getGerenciadorSeguinte()!= null){
                this.getGerenciadorSeguinte().verificar(mail);
             }

        }
    }

}
