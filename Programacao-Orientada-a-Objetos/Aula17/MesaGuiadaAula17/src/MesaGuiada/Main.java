package MesaGuiada;

public class Main {
    public static void main(String[] args) {
        try {
            Data data = new Data(1, 12, 2022);
        }catch (DataException e){
            System.err.println(e.getMessage());
        }
    }
}
