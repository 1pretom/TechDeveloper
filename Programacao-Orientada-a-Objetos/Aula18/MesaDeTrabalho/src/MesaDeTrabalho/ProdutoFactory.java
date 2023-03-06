package MesaDeTrabalho;

public class ProdutoFactory {

    private static ProdutoFactory instance;

    private ProdutoFactory(){}
    public static ProdutoFactory getInstance(){
        if (instance == null){
            instance = new ProdutoFactory();
        }
        return instance;
    }




}
