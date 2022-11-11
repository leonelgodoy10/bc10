package webelements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.time.Duration;
/*
    - elemento - Lupa
        - R:
    - elemento - quienes somos
        - R:
    - elemento - imagen Pagos
        - R:
    - elemento - Armados SP Labs
        - R:
 */
public class busquedaspdigital {

    WebDriver driver;
    //Localizador
    By searchboxLocalizador = By.xpath("//input[@placeholder='Busca los mejores productos y marcas :)']");
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div/span[1]/form/div/button")
    WebElement lupa;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[4]/section[1]/div/section/div/span[1]/a")
    WebElement home;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[4]/section[1]/div/div[1]/span[1]/a")
    WebElement home2;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[4]/section[1]/div/div[1]/div/span[1]/a")
    WebElement home3;
    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div[4]/section[16]/div/div[1]/span/span[2]/ul/li[1]/a/span")
    WebElement quienesSomos;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[4]/section[15]/div/div/span[3]/span[1]/a/img")
    WebElement imagenPagos;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/div/a[1]/div/span")
    WebElement gaming;
    @FindBy(xpath = "//span[normalize-space()='Armados SP Labs']")
    WebElement armados;

    @BeforeEach
    void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.spdigital.cl");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        PageFactory.initElements(driver, this);//Para crear una instancia de los elementos

    }

    @Test
    void BusquedaSpdigitalTest() throws InterruptedException {

        WebElement searchbox = driver.findElement(searchboxLocalizador);
        searchbox.sendKeys("Teclados");
        lupa.click();

        home.click();

        quienesSomos.click();
        home2.click();


        imagenPagos.click();
        home3.click();

        Actions act = new Actions(driver);

        act.moveToElement(gaming).perform();

        armados.click();





    }


    @AfterEach
    void quit(){
        driver.quit();
    }


}
