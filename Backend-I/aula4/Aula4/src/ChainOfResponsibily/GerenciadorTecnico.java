package ChainOfResponsibily;

//Classes concreta
public class GerenciadorTecnico extends Gerenciador{

    //Todas as vezes que o email cair aqui, vai verificar se o email é dele, se não for, volta para o
    //gerenciador abstrato e ele passa pra outro gerenciador concreto até chegar no spam
    @Override
    public void verificar(Mail mail) {
        if (mail.getDestino().equalsIgnoreCase("tecnica@colmeia.com") ||
                mail.getAssunto().equalsIgnoreCase("tecnica")){
            System.out.println("Enviado ao departamento tecnico");
        }else{
            if (this.getGerenciadorSeguinte() != null){
                this.getGerenciadorSeguinte().verificar(mail);
            }

        }
    }
}
