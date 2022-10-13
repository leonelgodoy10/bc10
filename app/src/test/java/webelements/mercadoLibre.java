package webelements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

/*
elemento - Enviar a Capital federal

modificar lugar *

elemento - ver todos los beneficios

acceder al link y devolverse a la home

elemento - crea tu cuenta

acceder al link

sacar foto

devolverse al home
elemento - trabaja con nosotros
acceder
presionar boton ver oportunidades
sacar foto
devolverse al Home*/

public class mercadoLibre {
    WebDriver driver;

    By capitalFederalLocalizador = By.xpath("/html[1]/body[1]/header[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[2]");

    By verTodosBeneficios = By.id("view_more");

    By creaTuCuenta = By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/nav[2]/a[1]");

    By botonAutorizacion = By.xpath("/html[1]/body[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]");

    By botonContinuar = By.xpath("/html[1]/body[1]/main[1]/div[1]/div[2]/a[1]/span[1]");

    By home = By.xpath("/html[1]/body[1]/header[1]/div[1]/a[1]");

    By cookiesAcept = By.xpath("/html/body/div[2]/div[1]/div[2]/button[1]");

    By trabajaConNosotros = By.xpath("/html/body/footer/div/div[1]/div/nav/a[1]");
    By oportunidades = By.xpath("/html/body/div/div[2]/main/section[1]/div[5]/div/a/span");
    @BeforeEach
    void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mercadolibre.com.ar");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }

    @Test
    void busquedaMercado() throws InterruptedException, IOException {

       /*WebElement capital = driver.findElement(capitalFederalLocalizador);
       capital.click();*/

        WebElement ben = driver.findElement(verTodosBeneficios);


        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1200)");
        Thread.sleep(3000);

        ben.click();

        driver.navigate().back();

        WebElement creaCuenta = driver.findElement(creaTuCuenta);
        creaCuenta.click();

        WebElement boton= driver.findElement(botonAutorizacion);
        boton.click();

        WebElement bot= driver.findElement(botonContinuar);
        bot.click();

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile,new File("./Pantallazo.png"));

        WebElement home1 = driver.findElement(home);
        home1.click();
        WebElement acept = driver.findElement(cookiesAcept);
        acept.click();

        js.executeScript("window.scrollBy(0,5000)");
        Thread.sleep(3000);

        WebElement trabaja = driver.findElement(trabajaConNosotros);
        trabaja.click();

        WebElement trabaj = driver.findElement(oportunidades);
        trabaj.click();
        FileUtils.copyFile(scrFile,new File("./Pantallazo2.png"));

        driver.navigate().back();
        driver.navigate().back();











    }

    @AfterEach
    void quit() {
        driver.quit();
    }
}
