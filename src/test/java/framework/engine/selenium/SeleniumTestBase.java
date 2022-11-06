package framework.engine.selenium;

import framework.engine.utils.LoadProperties;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Properties;

public class SeleniumTestBase {

    private DriverFactory driverFactory;
    WebDriver driver;
    static Properties properties;

    public void cambiarPag() {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        driver.close();
        driver.switchTo().window(tabs2.get(1));
    }


    @BeforeAll
    public static void LoadProperties() {
        properties = LoadProperties.loadProperties();
    }

    @BeforeEach
    void webDriverSetup() {
        String browserName = properties.getProperty("browser");
        driverFactory = new DriverFactory();
        driver = driverFactory.inicializarDriver(browserName);
    }


    @AfterEach
    void close() {
        driver.quit();
    }


}
