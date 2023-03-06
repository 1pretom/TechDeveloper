package MesaGuiada;
public abstract class Conta {

    private Double saldo;

    public Conta(Double saldo) {

        this.saldo = saldo;
    }

    public void depositar(Double valor){

        System.out.println("Deposito de R$" + valor);
    }

    public abstract void sacar(Double valor);

    public Double informarSaldo(){
        return saldo;
    }


    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
