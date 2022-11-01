package framework.engine.selenium;
import framework.engine.utils.LoadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Properties;

public class DriverFactory {

    public static ThreadLocal<WebDriver> hiloLocal = new ThreadLocal<>();

    /**
     * inicializa el WebDriver segun la seleccion del browser
     * @return Webdriver
     */
    public static WebDriver initDriver(){

        Properties properties = LoadProperties.loadProperties();
        String browser = properties.getProperty("browser");
        System.out.println("browser value is: "+browser);
        switch (browser) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                hiloLocal.set(new FirefoxDriver());
                getDriver().manage().deleteAllCookies();
                getDriver().manage().window().maximize();
                getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
                return getDriver();
            case "edge":
                WebDriverManager.edgedriver().setup();
                hiloLocal.set(new EdgeDriver());
                getDriver().manage().deleteAllCookies();
                getDriver().manage().window().maximize();
                getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
                return getDriver();
            default:
                throw new RuntimeException("Navegador no configurado: " + browser);
        }
    }

    /**
     * retorna el WebDriver desde el ThreadLocal
     * @return WebDriver
     */
    public static synchronized WebDriver getDriver(){
        return hiloLocal.get();
    }

    public static void closeDriver(){
        if(getDriver() != null){
            getDriver().close();
        }
    }
}