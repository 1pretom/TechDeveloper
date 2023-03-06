import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class selenium {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://chicorei.com/");

        //Botão aceitar política do site
        WebElement botaoAceitar = driver.findElement(By.id("confirmPolicyButton"));
        botaoAceitar.click();

        //pesquisar por nome
        WebElement pesquisa = driver.findElement(By.id("header-search-input-desktop"));
        pesquisa.sendKeys("Amarelo é desespero");

        //esperar
        //new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/div/div")));



        //ver todos os resultados
        WebElement selecionarCamisa = driver.findElement(By.xpath("//form/div/div/div/div/div"));
        selecionarCamisa.click();

        //selecionar se é masculina ou feminina
        WebElement tipoCamisa = driver.findElement(By.xpath("//*[@id=\"product-variations\"]/div[1]/div/div[2]/div/nav[1]"));
        tipoCamisa.click();

        //selecionar tamanho
        WebElement botaoTamanho = driver.findElement(By.xpath("//*[@id=\"product-variations\"]/div[1]/div/div[3]/nav/div[3]"));
        botaoTamanho.click();

        //selecionar cor
        WebElement botaoCor = driver.findElement(By.xpath("//*[@id=\"product-variations\"]/div[1]/div/div[4]/nav/div[1]/div"));
        botaoCor.click();

        //selecionar botão de compra
        WebElement botaoCompra = driver.findElement(By.xpath("//*[@id=\"product-buy-button-container\"]/button"));
        botaoCompra.click();

        //selecionar carrinho de compra
        WebElement botaoCarrinho = driver.findElement(By.xpath("//div[@id='header-cart-desktop']/div/a/div"));
        botaoCarrinho.click();

        //Selecionar finalizar compra
        WebElement botaoFinalizarCompra = driver.findElement(By.xpath("//div[@id='cart-finish']/button[2]"));
        botaoFinalizarCompra.click();


      //  String textoElement = String.valueOf(driver.findElement(By.xpath()))






    }

    private static void assertEquals(String validar_o_valor_do_produto_, String textoElement) {
    }
}
