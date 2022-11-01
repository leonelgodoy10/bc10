package framework.engine.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class SeleniumBase {


    protected WebDriver driver;

    public SeleniumBase(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        if (driver == null) {
            driver = DriverFactory.getDriver();
        }
        return driver;
    }


    public void get(String url) {
        getDriver().get(url);
    }


    public String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }


    public String getTitle() {
        return getDriver().getTitle();
    }


    public List<WebElement> findElements(By by) {
        return getDriver().findElements(by);
    }


    public WebElement findElement(By by) {
        return getDriver().findElement(by);
    }


    public String getPageSource() {
        return getDriver().getPageSource();
    }


    public void close() {
        getDriver().close();
    }


    public void quit() {
        getDriver().quit();
    }


    public Set<String> getWindowHandles() {
        return getDriver().getWindowHandles();
    }


    public String getWindowHandle() {
        return getDriver().getWindowHandle();
    }


    public WebDriver.TargetLocator switchTo() {
        return getDriver().switchTo();
    }


    public WebDriver.Navigation navigate() {
        return getDriver().navigate();
    }


    public WebDriver.Options manage() {
        return getDriver().manage();
    }


    public void dispose() {
        System.out.println("Killing WebDriver");
        if(driver != null){
            driver.quit();
        }
    }

}
