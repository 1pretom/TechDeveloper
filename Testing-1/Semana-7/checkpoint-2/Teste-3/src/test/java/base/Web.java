package base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Web {

    public static WebDriver createChrome(String url) {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");

        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navegador.manage().window().maximize();

        navegador.get(url);
        return navegador;
    }

}
