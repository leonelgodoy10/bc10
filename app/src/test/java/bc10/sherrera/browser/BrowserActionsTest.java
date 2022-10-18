package bc10.sherrera.browser;

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
    void browserActionTest(){
        String titulo;
        driver = new ChromeDriver();
        //abrir una url web 1
        driver.get("https://www.google.com");
        titulo = driver.getTitle();
        System.out.println("El titulo de la url abierta es: "+titulo);
        //abrir una url web 2
        driver.navigate().to("https://selenium.dev");
        titulo = driver.getTitle();
        System.out.println("El titulo de la url abierta es: "+titulo);

        //back : volver a la pagina anterior
        driver.navigate().back();
        //Forward
        driver.navigate().forward();
        //Refresh
        driver.navigate().refresh();

    }

    @AfterEach
    void close(){
        driver.quit();
    }

}
