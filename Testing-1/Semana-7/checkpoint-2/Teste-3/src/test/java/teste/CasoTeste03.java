package teste;

import funcionalidade.HomeFunc;
import org.junit.Test;

public class CasoTeste03 {

    HomeFunc homeFunc = new HomeFunc();

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
        homeFunc.pesquisarSelecionarProduto("Nem Te Vi", "R$ 39,90");
    }



}
