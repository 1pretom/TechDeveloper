package funcionalidade;

import pagina.CarrinhoTela;
import pagina.HomeTela;
import pagina.PaginaProdutoTela;

public class HomeFunc {



    public void pesquisarSelecionarProduto(String produto, String preco){
        new HomeTela()
                .clicarConcordoCookies()
                .digitarPesquisaElemento(produto)
                .clicarPrimiraOpcaoListaResultados();

        new PaginaProdutoTela()
                .validarPrecoProduto(preco)
                .clicarEscolherTamanho()
                .clicarEscolherCor(3)
                .clicarComprar()
                .clicarVerSacola();

        new CarrinhoTela()
                .validarMensagemCartaoFidelidade(" Voc� est� acumulando 1 ponto no cart�o fidelidade")
                .clicarFecharPedido();
    }

}
