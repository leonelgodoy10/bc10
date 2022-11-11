package webelements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class Waits {
    WebDriver driver;

    By link1loc = By.xpath("//a[text()='Example 1: Element on page that is hidden']");
    By btnStartloc = By.xpath("//button[normalize-space()='Start']");
    By helloAsinLoc = By.xpath("//h4[normalize-space()='Hello World!']");


    @BeforeEach
    void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        // waits :: implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));
    }

    @Test
    public void waits(){

        driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading");

        WebElement link1 = driver.findElement(link1loc);
        link1.click();
        WebElement btnStart = driver.findElement(btnStartloc);
        btnStart.click();
        //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        //espera explicita de un web element
        //wait.until(ExpectedConditions.elementToBeClickable(helloAsinLoc));

        Wait<WebDriver> fluentwait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);
        Assertions.assertEquals("Hello World!",driver.findElement(helloAsinLoc).getText());




    }

    @AfterEach
    public void quit(){
        driver.quit();
    }


}
