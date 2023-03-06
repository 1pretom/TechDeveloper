package MesaGuiada;

public class ThrowsException {
    private int dia, mes;
    private int ano;

    //throws Exception: obriga alguém a lançar a exceção
    public ThrowsException(int dia, int mes, int ano) throws Exception{
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12){ //se entrar nessa condição, vai chamar o erro
            throw new Exception ("Os valores não são válidos");
    }
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
    }
}
