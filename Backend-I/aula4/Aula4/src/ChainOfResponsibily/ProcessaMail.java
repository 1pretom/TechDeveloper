package ChainOfResponsibily;

//Aqui é onde tudo vai ser rodado
public class ProcessaMail {
    public static void main(String[] args) {
        //instanciando classes
        Mail mail1 = new Mail("email@email.com","tecnico@digitalhouse.com","Reclamacao");
        Mail mail2 = new Mail("email@email.com","tecnica@colmeia.com","Gerencia");
        Mail mail3 = new Mail("email@email.com","tecnica@colmeia.com","Reclamacao");
        Mail mail4 = new Mail("email@email.com","comercial@colmeia.com","solicitação de aumento");;

        //imprimindo o processo de verificação de email.
        CheckMail processo = new CheckMail();
        processo.verificar(mail1);
        processo.verificar(mail2);
        processo.verificar(mail3);
        processo.verificar(mail4);

    }
}
