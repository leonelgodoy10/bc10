package bc10.jjimenez;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSwitchingTest {

    WebDriver driver;

    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
    }

    @Test
    void browserSwitchingTest(){


        driver = new ChromeDriver();
        // numero de ventana del driver
        String originalWindow = driver.getWindowHandle();
        driver.navigate().to("https://www.google.com");
        //crear new window y cambiarme a esta nueva ventana
        driver.switchTo().newWindow(WindowType.WINDOW);
        String newWindow = driver.getWindowHandle();
        driver.navigate().to("https://www.google.cl");

        //cambiarme a window 1
        driver.switchTo().window(originalWindow);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https:selenium.dev");

        //cambiarme a windows 2
        driver.switchTo().window(newWindow);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https:selenium.dev");

    }
    @AfterEach
    void close(){
        driver.quit();

    }

}
