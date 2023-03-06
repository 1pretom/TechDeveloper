package pagina;

import base.PaginaBase;
import base.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeTela extends PaginaBase {

    static final String URL = "https://chicorei.com/";

    By byBtnConcordoCookies = By.id("confirmPolicyButton");
    By byCampoPesquisa = By.id("header-search-input-desktop");

    By byResultadosPesquisa = By.className("search-suggestion");




    public HomeTela() {
        super(URL);
    }

    public HomeTela clicarConcordoCookies(){
        clicarElemento(byBtnConcordoCookies);
        return this;
    }

    public HomeTela digitarPesquisaElemento(String texto){
        escreverTexto(byCampoPesquisa, texto);
        return this;
    }



    public HomeTela clicarPrimiraOpcaoListaResultados(){
        clicarElementoLista(byResultadosPesquisa, 0);
        return this;
    }

}
