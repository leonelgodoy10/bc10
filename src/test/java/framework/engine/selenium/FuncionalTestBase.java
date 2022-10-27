package framework.engine.selenium;

import framework.engine.utils.LoadProperties;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class FuncionalTestBase {

    private DriverFactory driverFactory;
    WebDriver driver;

    @BeforeEach
    void webDriverSetup(){
        driverFactory = new DriverFactory();
        driver = driverFactory.inicializarDriver();
    }

    @AfterEach
    void close(){
        System.out.println("Killing WebDriver");
        if(driver != null){
            driver.quit();
        }
    }
}


