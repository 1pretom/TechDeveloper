package MesaGuiada;
public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(100000.00,10000.00);
        cc.sacar(1000.00);
        System.out.println("Imposto R$" + cc.imposto(2.0));
        System.out.println("Saldo bancario, considerando imposto já descontado: R$" + cc.carregarSaldoAtual(2.0));


        ContaPoupanca cp = new ContaPoupanca(1200.00);
        cp.sacar(960.0);
        cp.depositar(100.00);
    }
}
