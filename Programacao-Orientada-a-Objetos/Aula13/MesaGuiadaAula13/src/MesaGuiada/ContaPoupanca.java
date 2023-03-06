package MesaGuiada;
public class ContaPoupanca extends Conta{

    public ContaPoupanca(Double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(Double valor) {
        if(valor <= informarSaldo()){
            setSaldo(informarSaldo() - valor);
            System.out.println("Saque de R$" + valor + " efetuado com sucesso!");
        }else {
            System.out.println("Não tem limite.");
        }

    }

    public void cobrarJuros(){
        double juros = 0.05;
        setSaldo( informarSaldo() * (1+juros));
    }
}
