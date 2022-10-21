package bc10.sherrera.webelements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElements {
    WebDriver driver;
    //Localizadores
    By barrraBusquedaLocalizador = By.name("q");
    By botonBusquedaLocalizador = By.name("btnK");

    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    void busquedaGoogle(){


        // Con WebElemnt capturamos el elemento, a traves de sus atributos
        WebElement barraBusqueda = driver.findElement(barrraBusquedaLocalizador);
        barraBusqueda.clear();
        barraBusqueda.sendKeys("Tsoft");
        barraBusqueda.sendKeys(Keys.ESCAPE);
        WebElement botonBusqueda = driver.findElement(botonBusquedaLocalizador);
        WebElement botonBusqueda1 = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
        botonBusqueda1.click();
        Assertions.assertEquals("Tsoft - Buscar con Google", driver.getTitle());



    }

    @AfterEach
    void clean(){
        driver.close();
    }
}
