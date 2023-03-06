package teste;

import funcionalidade.HomeFunc;
import org.junit.Test;

public class CasoTeste02 {

    HomeFunc homeFunc = new HomeFunc();

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
        homeFunc.pesquisarSelecionarProduto("Erarr", "R$ 39,90");
    }



}
