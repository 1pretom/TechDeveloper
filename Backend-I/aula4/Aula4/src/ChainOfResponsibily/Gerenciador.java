package ChainOfResponsibily;


//Classe abstrata que é o gerenciador de para onde o email vai
public abstract class Gerenciador {
    //Atributos
    Gerenciador gerenciadorSeguinte; //atributo do mesmo tipo da classe pois na hora de decidir vai chamar outro gerenciador

    //Getters e Setters
    public Gerenciador getGerenciadorSeguinte() {
        return gerenciadorSeguinte;
    }

    public void setGerenciadorSeguinte(Gerenciador gerenciadorSeguinte) {
        this.gerenciadorSeguinte = gerenciadorSeguinte;
    }

    //Método
    public abstract void verificar(Mail mail); //Método abstrato do tipo da classe que vai receber
}
