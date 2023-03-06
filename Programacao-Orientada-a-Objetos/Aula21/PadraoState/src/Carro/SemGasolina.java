package Carro;

public class SemGasolina implements EstadoCarro{

    private Carro v;


    // Construtor que injeta a dependência na classe atual

    public SemGasolina(Carro v)

    {

        this.v = v;

    }


    @Override

    public void acelerar() {

        System.out.println("ERROR: O veiculo se encontra sem combustivel");

    }


    @Override

    public void freiar() {

        System.out.println("ERROR: O veiculo se encontra sem combustivel");

    }


    @Override

    public void ligar() {
        System.out.println("ERROR: O veiculo se encontra sem combustivel");

    }



}




