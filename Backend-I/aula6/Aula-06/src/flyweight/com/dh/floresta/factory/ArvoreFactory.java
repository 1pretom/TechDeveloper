package flyweight.com.dh.floresta.factory;

import flyweight.com.dh.floresta.model.Arvore;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ArvoreFactory {
    //o valor sempre vai estar dentro por ser static// armazena a chave e o valor
    static Map<String, Arvore> TIPO_ARVORES = new HashMap<>(); //instancia como HashMap

    //método static pra não precisar criar instancia ao chamar ele
    //se não tiver a arvore, ele instancia uma nova
    public static Arvore getArvorePorTipo(String tipo, int altura, int largura, String cor){
        Arvore arvore = TIPO_ARVORES.get(tipo);
        if(Objects.isNull(arvore)){
            arvore = new Arvore(tipo, cor, altura, largura);
            TIPO_ARVORES.put(tipo, arvore);
        }
        return arvore;
    }
}
