import model.Leao;
import model.Tigre;

public class Main {
    public static void main(String[] args) {
        Leao leao = new Leao("Simba", 11, true);
        Tigre tigre = new Tigre("Pantro", -1);

        leao.correr();
        try {
            leao.eMaiorQue10();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        tigre.correr();
        try {
            tigre.eMaiorQue10();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
