package framework.engine.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class FuncionalTestBase {

    @BeforeEach
    void webDriverSetup(){
        DriverFactory.initDriver();
    }

    @AfterEach
    void close(){
        System.out.println("Killing WebDriver");
        DriverFactory.closeDriver();
    }
}


