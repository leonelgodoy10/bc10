package bc10.sherrera.Ejercicios;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MercadolibreTest {
    WebDriver driver;

    //Localizadores
  /*  @FindBy(xpath = "//a[@class='nav-menu-cp nav-menu-cp-logged']" )
            private WebElement enviar1;
    @FindBy(xpath = "//a[@class='nav-menu-cp nav-menu-cp-logged']\" +\n" +
            "            \"//span[@class='nav-menu-cp-send'][normalize-space()='Enviar a']\"" )
    private WebElement enviar1;*/



    By enviarAlLoc = By.xpath("//a[@class='nav-menu-cp nav-menu-cp-logged']" +
            "//span[@class='nav-menu-cp-send'][normalize-space()='Enviar a']");

    @FindBy(xpath = "//input[@class='andes-form-control__field']")
           private WebElement codigo;

    By btnEnviarCodigoLoc = By.xpath("//button[@type='submit']");
    By beneficiosLoc = By.xpath("//a[@id='view_more']");
    By iframeLoc = By.xpath("(//iframe)[3]");

    @BeforeEach
    void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mercadolibre.com.ar/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        PageFactory.initElements(driver, this); //Para crear una instancia de los elementos

    }

    @Test
    void mercadoLibre() throws InterruptedException {
        WebElement frame = driver.findElement(iframeLoc);
        WebElement enviar = driver.findElement(enviarAlLoc);
        enviar.click();
        driver.switchTo().frame(frame);
        String a = codigo.getAccessibleName();
        System.out.println(a);

        /*WebElement frame = driver.findElement(iframeLoc);
        driver.switchTo().frame(frame);
        WebElement codigo = driver.findElement(codigoPostalLoc);
        codigo.sendKeys("6476");

        WebElement btnenviar = driver.findElement(btnEnviarCodigoLoc);
        btnenviar.click();

        WebElement beneficios = driver.findElement(beneficiosLoc);
        beneficios.click();
        driver.navigate().back();*/



    }

}
