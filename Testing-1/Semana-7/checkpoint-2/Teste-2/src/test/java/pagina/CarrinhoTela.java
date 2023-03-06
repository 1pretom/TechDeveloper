package pagina;

import base.PaginaBase;
import org.openqa.selenium.By;

public class CarrinhoTela extends PaginaBase {
    By byBtnFecharPedido = By.xpath("//div[@id='cart-finish']/button[2]");

    public CarrinhoTela validarMensagemCartaoFidelidade(String texto){
        validarSeTextoEstaNaPagina(texto);
        return this;
    }

    public CarrinhoTela clicarFecharPedido(){
        clicarElemento(byBtnFecharPedido);
        return this;
    }

}
