package bc10.sherrera;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSizingTest {
    WebDriver driver;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.cl");
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();
        driver.manage().window().setSize(new Dimension(800,600));
    }

    @Test
    void browserSize(){
        //largo y ancho de la venta o browser
        int wight = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;

        //Dimension
        Dimension dimension = driver.manage().window().getSize();
        int wight2 = dimension.getWidth();
        int height2 = dimension.getHeight();

        //Cambiar tamaño de pantalla
        driver.manage().window().setSize(new Dimension(600, 400));
    }

    @Test
    void browserPosition(){
        int x = driver.manage().window().getPosition().getX();
        int y = driver.manage().window().getPosition().getY();

        //Point
        Point posicion = driver.manage().window().getPosition();
        int x1 = posicion.x;
        int y1 = posicion.y;

        //Modificar la posicion de la venta - browser -driver
        driver.manage().window().setPosition(new Point(0, 0));
    }

    @AfterEach
    void close(){
        driver.quit();
    }
}


