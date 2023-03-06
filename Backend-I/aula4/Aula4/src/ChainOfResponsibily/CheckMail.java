package ChainOfResponsibily;

//A classe checkMail que fica responsável por criar a corrente de desponsabilidade e decide quem é o primeiro
//Quem é o segundo, quem vai ser chamado depois
public class CheckMail {
    //Atributo do tipo da classe abstrata
    Gerenciador inicial;

    //Construtor vazio que vai definir a ordem de checagem
    public CheckMail() {
        this.inicial = new GerenciadorGerencia();
        Gerenciador comercial = new GerenciadorComercial();
        Gerenciador tecnico = new GerenciadorTecnico();
        Gerenciador spam = new GerenciadorSpam();

        //aqui define quem é o proximo de quem.
        this.inicial.setGerenciadorSeguinte(comercial);
        comercial.setGerenciadorSeguinte(tecnico);
        tecnico.setGerenciadorSeguinte(spam);
    }

    //Método para executar e dar o gatilho para validar.
    public void verificar(Mail mail){
        inicial.verificar(mail);
    }
}
