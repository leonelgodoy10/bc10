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
    By searchboxLocalizador = By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/span[1]/form/div/input");
    By lupaLocalizador = By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/span[1]/form/div/button");
    By homeLocalizador = By.xpath("/html/body/div[1]/div[1]/div[4]/section[1]/div/section/div/span[1]/a");
    By HomeLocalizador2 = By.xpath("/html/body/div[1]/div[1]/div[4]/section[1]/div/div[1]/span[1]/a");
    By HomeLocalizador3 = By.xpath("/html/body/div[1]/div[1]/div[4]/section[1]/div/div[1]/div/span[1]/a");
    By quienesSomosLocalizador = By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[4]/section[16]/div/div[1]/span/span[2]/ul/li[1]/a/span");
    By imagenLocalizador = By.xpath("/html/body/div[1]/div[1]/div/div[4]/section[15]/div/div/span[3]/span[1]/a/img");
    By Gaming_y_StreamingLocalizador = By.xpath("/html/body/div[1]/div[1]/div/div[3]/div/a[1]/div/span");
    By ArmnadosLocalizador = By.xpath("//span[normalize-space()='Armados SP Labs']");

    @BeforeEach
    void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.spdigital.cl");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }

    @Test
    void BusquedaSpdigitalTest() throws InterruptedException {

       WebElement lupa = driver.findElement(lupaLocalizador);
        WebElement searchbox = driver.findElement(searchboxLocalizador);
        searchbox.sendKeys("Teclados");
        lupa.click();

        WebElement home = driver.findElement(homeLocalizador);

        home.click();

        WebElement quienesSomos = driver.findElement(quienesSomosLocalizador);

        quienesSomos.click();
        WebElement home2 = driver.findElement(HomeLocalizador2);
        home2.click();

        WebElement imagenPagos = driver.findElement(imagenLocalizador);

        imagenPagos.click();

        WebElement home3 = driver.findElement(HomeLocalizador3);

        home3.click();

        WebElement gaming = driver.findElement(Gaming_y_StreamingLocalizador);

        Actions act = new Actions(driver);

        act.moveToElement(gaming).perform();

        WebElement armados = driver.findElement(ArmnadosLocalizador);

        armados.click();





    }


    @AfterEach
    void quit(){
        driver.quit();
    }


}
