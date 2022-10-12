package bc10.jjimenez;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSizing {

    WebDriver driver;

    @BeforeEach
    void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.cl");
        //Maximisar pantalla
        driver.manage().window().maximize();
        //Minimizar pantalla
        driver.manage().window().minimize();
        // f11
        driver.manage().window().fullscreen();
        driver.manage().window().setSize(new Dimension(800,600));

    }


    @Test
    void browserSize(){

        /*Datos que podemos obtener
            - Largo ancho de la ventana browser
         */

        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().getHeight();

        //Dimension

        Dimension dimension = driver.manage().window().getSize();
        int widht2 = dimension.getWidth();
        int heigth2 = dimension.getHeight();

        // Cambiar el tamano de la ventana
        driver.manage().window().setSize(new Dimension(600,400));
    }

    @Test
    void browserPosition(){

        int pos_x =  driver.manage().window().getPosition().getX();
        int pos_y =  driver.manage().window().getPosition().getY();

        //Point
        Point posicion = driver.manage().window().getPosition();

        int pos_x1 = posicion.x;
        int pos_y1 = posicion.y;

        //Modificar la posicion de la ventana - browser -  driver
        driver.manage().window().setPosition(new Point(0,0));

    }



    @AfterEach
    void close(){driver.quit();}

}
