package ChainOfResponsibily;

//Classes concreta
public class GerenciadorComercial extends Gerenciador{

    //Todas as vezes que o email cair aqui, vai verificar se o email é dele, se não for, volta para o
    //gerenciador abstrato e ele passa pra outro gerenciador concreto até chegar no spam
    @Override
    public void verificar(Mail mail) {
        if (mail.getDestino().equalsIgnoreCase("comercial@colmeia.com") ||
                mail.getAssunto().equalsIgnoreCase("comercial")){
            System.out.println("Enviado ao departamento comercial");
        }else{
            if (this.getGerenciadorSeguinte() != null){
                this.getGerenciadorSeguinte().verificar(mail);
            }

        }
    }
}
