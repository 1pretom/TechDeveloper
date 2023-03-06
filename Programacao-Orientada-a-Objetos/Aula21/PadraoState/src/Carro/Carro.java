package Carro;

public class Carro implements EstadoCarro{



    private EstadoCarro estado;

    // Status atual do veículo (desligado, parado, em marcha, sem combustível)



    private int velocidadAtual = 0; // Velocidade atual do veículo



    private int combustivelAtual = 0; // Quantidade de combustível restante


    public Carro(int combustivel)     {

        this.setCombustivelAtual(combustivel);

        // TODO

        // Indicar um estado inicial (Desligado)

        this.setEstado(new Desligado(this));

    }



    public void setCombustivelAtual(int combustivelAtual) {

        this.combustivelAtual = combustivelAtual;

    }



    public void setEstado(StateAuto estado) {

        this.estado = estado;

    }



    public void setVelocidadeAtual(int velocidadeAtual) {

        this.velocidadeAtual = velocidadeAtual;

    }



    public int getVelocidadeAtual() {

        return velocidadeAtual;

    }



    public int getCombustivelAtual() {

        return combustivelAtual;

    }



    public StateAuto getEstado() {

        return estado;

    }



    @Override

    public void acelerar()       {

        getEstado().acelerar();

        System.out.println("Velocidade atual: " + getVelocidadeAtual() + ". Combustivel  restante: " + getCombustivelAtual());

    }



    @Override

    public void freiar()        {

        getEstado().freiar();

    }



    @Override

    public void ligar()      {

        getEstado().ligar();

    }

    public void modificarVelocidade(int kmh)      {

        setVelocidadeAtual(getVelocidadeAtual() + kmh);

    }



    public void modificarCombustivel(int decilitros)  {

        setCombustivelAtual(getCombustivelAtual() + decilitros);

    }



}
