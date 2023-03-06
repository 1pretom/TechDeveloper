package flyweight.com.dh.floresta;

import flyweight.com.dh.floresta.model.Arvore;
import flyweight.com.dh.floresta.model.Floresta;

public class Main {
    public static void main(String[] args) {
        Floresta floresta = new Floresta();
        for (int i = 0; i < 1000000; i++){
            floresta.plantarArvore("Ornamentais", 200,400,"Verde");
            floresta.plantarArvore("Ornamentais", 200,400,"Azul"); //não vai plantar essa pq já tem ornamental verde
            floresta.plantarArvore("Frutiferas", 500,300,"Vermelho");
            floresta.plantarArvore("Florifera", 100,200,"Azul");
            floresta.plantarArvore("Florifera", 500,200,"Azul");
        }
        //para saber o quanto de memória tá utilizando
        Runtime runtime = Runtime.getRuntime();
        System.out.println(Arvore.contador);
        System.out.println(Floresta.getFLORESTA().size());
        System.out.println("Memoria utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }
}
