package Carro;

public class EmMarcha implements EstadoCarro{

    private final int VELOCIDAD_MAXIMA = 200;


    private Carro v;


    public EmMarcha(Carro v)

    {

        this.v = v;

    }


    @Override

    public void acelerar() {

        if (v.getCombustivelAtual() > 0)

        {

            if (v.getVelocidadeAtual() >= VELOCIDAD_MAXIMA)

            {

                System.out.println("ERROR: O carro atingiu a velocidade maxima");

                v.modificarCombustivel(-10);



            }

            else

            {



                v.modificarVelocidad(10);

                v.modificarCombustivel(-10);

            }



        }

        else

        {



            //estado = SEM COMBUSTÍVEL

            v.setEstado(new SemGasolina(v));

            System.out.println("O veiculo ficou sem combustivel");

        }

    }


    @Override

    public void ligar() {

        System.out.println("ERROR: A ignição não pode ser cortada durante o funcionamento!");

    }


    @Override

    public void freiar() {

        v.modificarVelocidade(-10);

        if (v.getVelocidadeAtual() < 0)

        {

            //estado = PARADO;

            v.setEstado(new Parado(v));

            System.out.println("O veiculo se encontra PARADO");



        }
    }

}


