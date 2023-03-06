package base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaBase extends Web{


    protected static WebDriver driver;

    public PaginaBase(String url){
        if(driver == null){
            driver = Web.createChrome(url);
        } else {
            driver.get(url);
        }
    }

    public PaginaBase(){

    }

    protected void escreverTexto(By by, String texto){
        driver.findElement(by).sendKeys(texto);
    }

    protected void clicarElemento(By by){
        driver.findElement(by).click();
    }

    protected void clicarElementoLista(By by, int index){
        driver.findElements(by).get(index).click();
    }

    protected void validarTextoElemento(By by, String texto){
        Assert.assertEquals(driver.findElement(by).getText(), texto);
    }

    protected void validarSeTextoEstaNaPagina(String texto){
        Assert.assertTrue(driver.getPageSource().contains(texto));
    }

}
