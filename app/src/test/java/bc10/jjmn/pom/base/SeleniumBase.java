package bc10.jjmn.pom.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Clase Base de Selenium WebDriver, nos servira para
 * enmascarar la tecnologia de Selenium - Wrapper
 */

public class SeleniumBase {

    private WebDriver driver;

    public SeleniumBase(WebDriver driver) {
        this.driver = driver;
    }
    public void navegarAPagina(String url) {
        driver.navigate().to(url);
    }
    public void cambiarTamanhoDriver(int width, int height) {driver.manage().window().setSize(new Dimension(width, height));}
    public void maximizarTamanhoDriver() {
        driver.manage().window().maximize();
    }
    public int obtenerWidth() {
        return driver.manage().window().getSize().width;
    }
    public int obtenerHeight() {
        return driver.manage().window().getSize().height;
    }
    public WebElement encontrarElemento(By locator) {
        return driver.findElement(locator);
    }
    public String obtenerAtributo(By locator, String atributo) {return driver.findElement(locator).getAttribute(atributo);}
    public String obtenerTitulo() {
        return driver.getTitle();
    }
    public String obtenerTexto(By locator) {
        return driver.findElement(locator).getText();
    }
    public void clickear(By locator) {
        driver.findElement(locator).click();
    }
    public WebDriver getDriver() {
        return driver;
    }
    public String validarTitulo(By locator) {
        encontrarElemento(locator);
        clickear(locator);
        return obtenerTitulo();
    }
    public void enviarDatos(By locator,String informacion) {encontrarElemento(locator).sendKeys(informacion);}
    public void cambiarIndex(By locator,int index) throws InterruptedException {
        clickear(locator);
        new Select(encontrarElemento(locator)).selectByIndex(index);
    }

}
