package framework.engine.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class FuncionalTestBase {

    private DriverFactory driverFactory;
    WebDriver driver;

    @BeforeEach
    void webDriverSetup(){
        driverFactory = new DriverFactory();
        driver = driverFactory.initDriver();
    }

    @AfterEach
    void close(){
        System.out.println("Killing WebDriver");
        if(driver != null){
            driver.quit();
        }
    }
}


