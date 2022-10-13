package webelements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class busquedagoogle {
    WebDriver driver;
    //Localizador

    By searchboxLocalizador = By.xpath("//input[@title='Buscar']");
    By btnBuscarGoogleLocalizador = By.name("btnK");

    @BeforeEach
    void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }

    @Test
    void busquedaGoogle() throws InterruptedException {

        WebElement searchbox = driver.findElement(searchboxLocalizador);

        searchbox.clear();

        searchbox.sendKeys("Tsoft");

        //searchbox.sendKeys(Keys.ESCAPE);

        //Thread.sleep(500);

        WebElement btnBuscarConGoogle = driver.findElement(btnBuscarGoogleLocalizador);

        btnBuscarConGoogle.click();

        //searchbox.submit();

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        assertEquals("Tsoft - Buscar con Google",driver.getTitle());

    }


    @AfterEach
    void quit(){
        driver.quit();
    }

}
