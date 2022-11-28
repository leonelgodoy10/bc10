package aut.funcional.equipo1.rumbo.pages;

import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class BCIHomePage extends SeleniumWrapper {

    public BCIHomePage(WebDriver driver) {
        super(driver);
    }

    //locators
    By btnBancoEnLinea = By.xpath("//a[@id='intro-step2']");
    By cuadreoRut = By.xpath("//input[@id='rut_aux']");
    By cuadroClave= By.xpath("//input[@id='clave']");


    //methods
    public void navegarAlHome() {
        navigateTo(BASE_URL_AUT);
    }
    public void clicBancoEnLinea() {
        if (isDisplayed(btnBancoEnLinea) == true) {
            click(btnBancoEnLinea);
        }
    }
    public void ingresoUsuario(String rut, String clave){
        click(cuadreoRut);
        write(rut,cuadreoRut);
        click(cuadroClave);
        write(clave,cuadroClave);
    }



}
