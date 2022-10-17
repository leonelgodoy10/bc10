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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class busquedagoogle {
    WebDriver driver;
    //Localizador

   @FindBy(xpath = "//input[@title='Buscar']")
    WebElement searchbox;
    By btnBuscarGoogleLocalizador = By.name("btnK");

    @BeforeEach
    void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        PageFactory.initElements(driver, this);//Para crear una instancia de los elementos

    }

    @Test
    void busquedaGoogle() throws InterruptedException {


        searchbox.clear();

        searchbox.sendKeys("Tsoft");

        //searchbox.sendKeys(Keys.ESCAPE);

        //Thread.sleep(500);

        WebElement btnBuscarConGoogle = driver.findElement(btnBuscarGoogleLocalizador);

        btnBuscarConGoogle.click();

        //searchbox.submit();

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       // assertEquals("Tsoft - Buscar con Google",driver.getTitle());

    }


    @AfterEach
    void quit(){
        driver.quit();
    }

}
