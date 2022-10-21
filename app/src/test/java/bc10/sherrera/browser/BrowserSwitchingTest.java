package bc10.sherrera.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSwitchingTest{
    WebDriver driver;

    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
    }

    @Test
    void browserActionTest() {
        driver = new ChromeDriver();
        //numero de ventana del driver
        String originalWindows = driver.getWindowHandle();
        driver.navigate().to("https://www.google.com.ar");
        //crear new window y cambiarmme a esta nueva ventana
        driver.switchTo().newWindow(WindowType.WINDOW);
        String newWindows = driver.getWindowHandle();
        driver.navigate().to("https://www.google.cl");

        //cambiarme a window1
        driver.switchTo().window(originalWindows);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://selenium.dev");

        //cambiarme a la ventana 2
        driver.switchTo().window(newWindows);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://selenium.dev");




    }

    @AfterEach
    void close(){
        driver.quit();
    }
}
