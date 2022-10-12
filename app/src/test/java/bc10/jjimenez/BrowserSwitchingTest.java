package bc10.jjimenez;
// selenium driver version estudiar la lista solucionar el tema del test hacer que cambien ala otra ventana
// que se pueda
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

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

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));


        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https:selenium.dev");

    }
    @AfterEach
    void close(){
        driver.quit();

    }

}
