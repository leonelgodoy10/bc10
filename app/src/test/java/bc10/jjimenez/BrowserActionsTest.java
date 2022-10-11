package bc10.jjimenez;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActionsTest {
    WebDriver driver;

    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
    }

    @Test
    void browserActionsTest(){

        String titulo;

        driver = new ChromeDriver();
        //abrir una url web 1
        driver.get("https://www.google.com");
        // abrir una url web 2
        driver.navigate().to("https://www.selenium.dev");

        titulo = driver.getTitle();
        System.out.println("El titulo de la url abierta es : "+titulo);

        //Back: (Cuando uno presiona la flecha hacia atras del navegador la pagina anterior)
        driver.navigate().back();
        titulo = driver.getTitle();
        System.out.println("El titulo de la url abierta es : "+titulo);
        //Forward
        driver.navigate().forward();
        titulo = driver.getTitle();
        System.out.println("El titulo de la url abierta es : "+titulo);
        //refresh hace f5 navegador
        driver.navigate().refresh();
        titulo = driver.getTitle();
        System.out.println("El titulo de la url abierta es : "+titulo);


    }
    @AfterEach
    void close(){
        driver.quit();

    }



}
