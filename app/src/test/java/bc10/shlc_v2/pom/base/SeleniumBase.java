package bc10.shlc_v2.pom.base;
import org.openqa.selenium.*;
import java.util.List;

/**
 * Clase Base de Selenium WebDriver, nos servira para
 * enmascarar la tecnologia de Selenium - Wrapper
 */
public class SeleniumBase {

    //Atributo
    private WebDriver driver;

    //Constructor
    public SeleniumBase(WebDriver driver){
        this.driver = driver;
    }

    //Funciones enmascarar o Wrapper de Selenium
    public void navegarAPagina(String url){
        driver.navigate().to(url);
    }

    public WebElement encontrarElemento(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> encontrarElementos (By locator){
        return driver.findElements(locator);
    }

    public WebElement obtenerElementoDeElementos(List<WebElement> tabla,int posicion){
        return tabla.get(posicion);
    }

    public List<WebElement> elementosParaBuscarEnTablas(WebElement tabla, By locator, By locators){
        return tabla.findElement(locator).findElements(locators);
    }

    public String obtenerTextoo (By locator){
        return driver.findElement(locator).getText();
    }

    public void escribir(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void clickear(By locator){
        driver.findElement(locator).click();
    }

    public Boolean estaDesplegado(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public Boolean estaSeleccionado(By locator) {
        try {
            return driver.findElement(locator).isSelected();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void cambiarTamanhoDriver(int width, int height){
        driver.manage().window().setSize(new Dimension(width,height));
    }

    public int obtenerWidth(){
        return driver.manage().window().getSize().width;
    }

    public int obtenerHeight(){
        return driver.manage().window().getSize().height;
    }

    public WebDriver getDriver(){
        return driver;
    }









}
