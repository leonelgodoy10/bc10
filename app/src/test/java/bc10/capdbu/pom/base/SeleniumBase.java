package bc10.capdbu.pom.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SeleniumBase {
    //Atributo
    private WebDriver driver;
    //Constructor
    public SeleniumBase(WebDriver driver){
        this.driver = driver;
    }

    //Funciones Wrapper
    public void navigateToPage(String url){
        driver.navigate().to(url);
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }
    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }
    public String getText(By locator){
        return driver.findElement(locator).getText();
    }
    public void type(String inputText, By locator){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public Boolean isSelected(By locator) {
        try {
            return driver.findElement(locator).isSelected();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public Boolean validateMessage(String text, By locator){
        try{
            return driver.findElement(locator).getText().equals(text);
        } catch (org.openqa.selenium.NoAlertPresentException e){
            return false;
        }
    }
    public void modifySizeDriver(int width, int heigth){
        driver.manage().window().setSize(new Dimension(width,heigth));
    }

    public int getHeight(){
        return driver.manage().window().getSize().height;
    }
    public int getWidth(){
        return driver.manage().window().getSize().width;
    }

    public  WebDriver getDriver(){
        return driver;
    }

}
