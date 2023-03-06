package Carro;


public class Desligado implements EstadoCarro{




    private Carro v;




    public Desligado(Carro v)

    {

        this.v = v;

    }


    @Override

    public void freiar() {

        System.out.println("ERROR: O veiculo esta desligado. Ligue o carro");


    }


    @Override

    public void ligar() {



        if (v.getCombustivelAtual() > 0)

        {

            v.setEstado(new Parado(v));

            System.out.println("O veiculo se encontra PARADO");

            v.setVelocidadeAtual(0);

        }

        else

        {

            v.setEstado(new SemGasolina(v));

            System.out.println("O veiculo se encontra sem combustivel");

        }


        @Override
        public void acelerar() {


            System.out.println("ERROR: O veiculo está desligado. Ligue o carro!");



        }

    }
