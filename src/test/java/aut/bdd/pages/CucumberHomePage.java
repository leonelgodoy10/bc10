package aut.bdd.pages;

import framework.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static framework.engine.selenium.DriverFactory.getDriver;

public class CucumberHomePage {


    //locators
    By barraBusquedaLocator = By.name("q");
    By btnBuscarConGoogleLocator = By.name("btnK");
    By btnVoyATenerSuerteLocator = By.name("btnI");
    String url = "https://www.google.com";



    public void navegarAlHome() {
        getDriver().navigate().to(url);
    }

    public void buscarConBotonBuscar(String tsoft) {
        getDriver().findElement(barraBusquedaLocator).sendKeys(tsoft);
        getDriver().findElement(barraBusquedaLocator).sendKeys(Keys.ESCAPE);
        getDriver().findElement(btnBuscarConGoogleLocator).click();

    }
}
