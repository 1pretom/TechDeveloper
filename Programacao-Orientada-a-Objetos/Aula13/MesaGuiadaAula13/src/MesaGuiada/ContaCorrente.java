package MesaGuiada;
public class ContaCorrente extends Conta implements GravarImposto, Teste{

    private Double valorPermitido;

    public ContaCorrente(Double saldo, Double valorPermitido) {
        super(saldo);
        this.valorPermitido = valorPermitido;
    }

    //sobrescrita da classe pai
    @Override
    public void sacar(Double valor) {
        if(valor <= informarSaldo()){
            setSaldo(informarSaldo() - valor);
            System.out.println("Valor sacado é de R$" + valor);
        }else {
            System.out.println("Não tem limite.");
        }

    }

    //implementação da interface
    @Override
    public Double imposto(Double porcentagem) {
        return informarSaldo()*(porcentagem/100);
    }
    public Double carregarSaldoAtual(Double porcentagem) {
        return informarSaldo() - (informarSaldo()*(porcentagem/100));
    }

    @Override
    public void outroMetodo() {
        //vazio
    }

    public Double getValorPermitido() {
        return valorPermitido;
    }

    public void setValorPermitido(Double valorPermitido) {
        this.valorPermitido = valorPermitido;
    }



}
