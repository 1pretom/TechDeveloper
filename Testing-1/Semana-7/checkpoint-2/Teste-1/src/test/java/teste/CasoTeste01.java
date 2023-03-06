package teste;

import funcionalidade.HomeFunc;
import org.junit.After;
import org.junit.Test;

public class CasoTeste01 {

    HomeFunc homeFunc = new HomeFunc();

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
        homeFunc.pesquisarSelecionarProduto("Amarelo é Desespero", "R$ 39,90");
    }



}
