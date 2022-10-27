package framework.engine.selenium;

import framework.engine.utils.LoadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.picocontainer.Disposable;

import java.util.List;
import java.util.Properties;
import java.util.Set;

public class SeleniumBase implements WebDriver, Disposable {


    private WebDriver driver;
    private DriverFactory driverFactory;
    Properties properties;

    public SeleniumBase(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        if (driver == null) {
            driver = DriverFactory.getDriver();
        }
        return driver;
    }
    private WebDriver initDriver() {
        if (driver == null) {
            properties = LoadProperties.loadProperties();
            driverFactory = new DriverFactory();
            driver = driverFactory.inicializarDriver(properties.getProperty("browser"));
        }
        return driver;
    }

    @Override
    public void get(String url) {
        getDriver().get(url);
    }

    @Override
    public String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }

    @Override
    public String getTitle() {
        return getDriver().getTitle();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return getDriver().findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return getDriver().findElement(by);
    }

    @Override
    public String getPageSource() {
        return getDriver().getPageSource();
    }

    @Override
    public void close() {
        getDriver().close();
    }

    @Override
    public void quit() {
        getDriver().quit();
    }

    @Override
    public Set<String> getWindowHandles() {
        return getDriver().getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
        return getDriver().getWindowHandle();
    }

    @Override
    public TargetLocator switchTo() {
        return getDriver().switchTo();
    }

    @Override
    public Navigation navigate() {
        return getDriver().navigate();
    }

    @Override
    public Options manage() {
        return getDriver().manage();
    }

    @Override
    public void dispose() {
        System.out.println("Killing WebDriver");
        if(driver != null){
            driver.quit();
        }
    }

}
