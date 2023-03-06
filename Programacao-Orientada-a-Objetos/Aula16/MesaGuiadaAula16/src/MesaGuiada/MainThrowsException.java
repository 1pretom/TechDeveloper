package MesaGuiada;

public class MainThrowsException {
    public static void main(String[] args) {
        try {
            ThrowsException t = new ThrowsException(3,2,2022);//sorround with try/catch pq ele obriga a fazer isso
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
