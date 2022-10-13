package bc10.jjimenez;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class busquedagoogle {
    WebDriver driver;

    @BeforeEach
    void googleBusquedaTest() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    void setUp() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement searchbox = driver.findElement(By.xpath("//input[@title='Buscar']"));

        searchbox.clear();
        searchbox.sendKeys("Youtube");

        searchbox.submit();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @AfterEach
    void quit(){
        driver.quit();
    }

}
