package flyweight.com.dh.floresta.model;

import flyweight.com.dh.floresta.factory.ArvoreFactory;

import java.util.ArrayList;
import java.util.List;

public class Floresta {
    //todas as florestas com o mesmo valor
    private static List<Arvore> FLORESTA = new ArrayList<>();
    //plantando arvore
    public void plantarArvore(String tipo, int altura, int largura, String cor){
        Arvore arvore = ArvoreFactory.getArvorePorTipo(tipo, altura, largura, cor);
        this.FLORESTA.add(arvore);
    }
    //só precisa do getter pq o setter é passado no método acima
    public static List<Arvore> getFLORESTA() {
        return FLORESTA;
    }
}
