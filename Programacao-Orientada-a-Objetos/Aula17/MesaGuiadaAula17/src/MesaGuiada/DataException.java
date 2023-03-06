package MesaGuiada;

//quase nunca é diferente disso

public class DataException extends Exception{
    //para garantir que todos os erros vão cair aqui
    public DataException() {
        super();
    }

    //para personalizar as mensagens
    public DataException(String messagem) {
        super(messagem);
    }

    //sobrescrever o métido toString para retornar as mensagens
    @Override
    public String toString() {
        return "A seguinte exceção ocorreu " + this.getCause() + "\n"
                + "Mensagem: " + this.getMessage() + "\n";
    }


}
