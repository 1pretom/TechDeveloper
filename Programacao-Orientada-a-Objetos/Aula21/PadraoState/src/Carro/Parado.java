package Carro;

public class Parado implements EstadoCarro{



    private Carro v;



    public Parado(Carro v)

    {

        this.v = v;

    }


    @Override

    public void acelerar()  {



        if (v.getCombustivelAtual() > 0)

        {

            v.setEstado(new EmMarcha(v));

            System.out.println("O veiculo se encontra EM MARCHA");

            v.modificarVelocidade(10);

            v.modificarCombustível(-10);



        }
        else

        {



            v.setEstado(new SemGasolina(v));

            System.out.println("O veiculo se encontra sem combustivel");

        }





        @Override

        public void freiar()

        {

            System.out.println("ERROR: O veiculo se encontra parado.");

            {





                @Override

                public void ligar()

                {

                    v.setEstado(new Desligado(v));

                    System.out.println("O veiculo se encontra desligado.");

                }
