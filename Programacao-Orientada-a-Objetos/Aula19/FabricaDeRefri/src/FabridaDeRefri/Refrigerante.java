package FabridaDeRefri;

public abstract class Refrigerante{

    private String nome;

    public String getName(){
        return nome;
    }

    public void abrir (){
        System.out.println ("Você abrir uma lata de: " + getName());
    }
}