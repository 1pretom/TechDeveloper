package pagina;

import base.PaginaBase;
import org.openqa.selenium.By;

public class PaginaProdutoTela extends PaginaBase {

    public PaginaProdutoTela() {

    }


    By ByLabelPreco = By.xpath("//*[@id=\"product-main-right\"]/div[1]/div[2]/div/p[1]");

    By bylistaTamanhos = By.xpath("//div[contains(@rel,'F-G')]");

    By byListaCores = By.className("product-color-option");

    By byBtnComprar = By.xpath("//*[@data-text='Selecione a opção desejada nos campos acima']");
    By byBtnVerSacola = By.xpath("//a[contains(text(),'Ver sacola')]");


    public PaginaProdutoTela validarPrecoProduto(String preco){
        validarTextoElemento(ByLabelPreco, preco);
        return this;
    }

   public PaginaProdutoTela clicarEscolherTamanho(){
       clicarElemento(bylistaTamanhos);
        return this;
    }

    public PaginaProdutoTela clicarEscolherCor(int index){
        clicarElementoLista(byListaCores, index);
        clicarElementoLista(byListaCores, index);
        return this;
    }

    public PaginaProdutoTela clicarComprar(){
        clicarElemento(byBtnComprar);
        return this;
    }

    public PaginaProdutoTela clicarVerSacola(){
        clicarElemento(byBtnVerSacola);
        return this;
    }

}
