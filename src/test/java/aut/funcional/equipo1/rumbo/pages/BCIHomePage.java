package aut.funcional.equipo1.rumbo.pages;

import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BCIHomePage extends SeleniumWrapper {

    public BCIHomePage(WebDriver driver) {
        super(driver);
    }

    //locators
    By btnBancoEnLinea = By.id("//a[@id='intro-step2']");


    //methods
    public void aceptarCookie() {
        if (isDisplayed(btnBancoEnLinea) == true) {
            click(btnBancoEnLinea);
        }
    }



}
