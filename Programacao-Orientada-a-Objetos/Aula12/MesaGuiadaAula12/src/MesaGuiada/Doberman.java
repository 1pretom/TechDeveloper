package MesaGuiada;

public class Doberman extends Cachorro{
    public Doberman(String nome, String cor, int idade) {
        super(nome, cor, idade);
    }

    @Override
    void latir() {
        System.out.println("Eu lato como um Doberman: auf auf");
    }
    public void morderComoDoberman(){
        System.out.println("Eu mordo como um doberman");
    }
}
