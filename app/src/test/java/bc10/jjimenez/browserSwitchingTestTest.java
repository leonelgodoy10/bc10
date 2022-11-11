package bc10.jjimenez;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class browserSwitchingTestTest {


    WebDriver driver;
    WebDriver driver2;

    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
    }

    @Test
    void browserSwitchingTest(){


        driver = new ChromeDriver();
        //driver2 = new ChromeDriver();



        //driver.switchTo().newWindow(WindowType.WINDOW);
        String Window1 = driver.getWindowHandle();
        driver.navigate().to("https://www.google.cl");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https:selenium.dev");


        /*numero de ventana del driver
        String Window2 = driver2.getWindowHandle();
        driver2.navigate().to("https://www.facebook.com/");
        driver2.switchTo().newWindow(WindowType.TAB);
        driver2.navigate().to("https://www.facebook.com/");

        //cambiarme a window 1
        driver.switchTo().window(Window1);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https:selenium.dev");*/



    }
    @AfterEach
    void close(){
        driver.quit();
        driver2.quit();

    }

}
