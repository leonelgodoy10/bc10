package bc10.sherrera.webelements;

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
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class Waits {
    WebDriver driver;
    //Localizadores
    By link1Loc = By.xpath("//a[@href ='/dynamic_loading/1']");
    By  btnStartLoc = By.xpath("//button[normalize-space()='Start']");
    By HellowAsincLoc = By.xpath("//h4[normalize-space()='Hello World!']");

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        // waits:: implicit (va a intentar encontrar el elemento si es que no esta inmediatamente habilitado)
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));
    }

    @Test
    void waits(){
        driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading");
        WebElement link1 = driver.findElement(link1Loc);
        link1.click();
        WebElement btnStart = driver.findElement(btnStartLoc);
        btnStart.click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        /* wait.until(ExpectedConditions.elementToBeClickable(HellowAsincLoc));*/
        //espera explicita de un webElement

        //fluent wait
        Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofMillis(100))
                                .ignoring(NoSuchElementException.class);

        fluentwait.until(ExpectedConditions.elementToBeClickable(HellowAsincLoc));

        Assertions.assertEquals("Hello World!", driver.findElement(HellowAsincLoc).getText());
    }

    @AfterEach
    void clean(){

        driver.close();
    }
}

