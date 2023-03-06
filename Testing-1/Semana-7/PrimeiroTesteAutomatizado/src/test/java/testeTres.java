import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeTres {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://chicorei.com/");

        //Botão aceitar política do site
        WebElement botaoAceitar = driver.findElement(By.id("confirmPolicyButton"));
        botaoAceitar.click();

        //pesquisar por nome
        WebElement pesquisa = driver.findElement(By.id("header-search-input-desktop"));
        pesquisa.sendKeys("Nem Te Vi");






}};
