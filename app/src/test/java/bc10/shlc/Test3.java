package bc10.shlc;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
=======
import org.openqa.selenium.edge.EdgeDriver;
>>>>>>> 8275ac648dc68d7791c2744b383571bd80af4f3f

import java.time.Duration;

public class Test3 {
    WebDriver driver;
    //Localizadores
    By btnNewComputerLoc = By.xpath("//a[@id='add']");
    By btnCreateComputerLoc = By.xpath("//input[@value='Create this computer']");
    By escribirNameLoc = By.xpath("//input[@id='name']");
    By mensajeNombreLoc = By.xpath("//div[@class='alert-message warning']");

    @BeforeEach
    void setUp(){
        //Configuracion inicial
<<<<<<< HEAD
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
=======
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
>>>>>>> 8275ac648dc68d7791c2744b383571bd80af4f3f
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.navigate().to("https://computer-database.gatling.io");
    }
    @Test
    void createUserfailed(){
        //Click en boton New Computer
        WebElement btnNewComputer = driver.findElement(btnNewComputerLoc);
        btnNewComputer.click();
        //Se ingresa el nombre del computador
        WebElement escribirNombre = driver.findElement(escribirNameLoc);
        escribirNombre.sendKeys("BC10_SELU");
        //Click boton Create computer
        WebElement btnCreateComputer = driver.findElement(btnCreateComputerLoc);
        btnCreateComputer.click();
        //Se valida el mensaje de computador creado
        WebElement mensajeNombre = driver.findElement(mensajeNombreLoc);
        Assertions.assertEquals("Done ! Computer BC10_SELU has been created", mensajeNombre.getText());
    }

    @AfterEach
    void close(){
        //Se cierra el navegador
        driver.quit();
    }
}
