package framework.engine.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.devtools.v96.indexeddb.model.Key;

import java.util.List;

public class SeleniumWrapper {

    private final WebDriver driver;

    //Constructor Base
    public SeleniumWrapper(WebDriver driver) {
        this.driver = driver;
    }

    //Wrappers Selenium
    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public void write(String inputText, By locator) {
        isDisplayed(locator);
        driver.findElement(locator).sendKeys(inputText);
    }

    public void sendKeys(Keys key, By locator) {
        driver.findElement(locator).sendKeys(key);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public Boolean isEnabled(By locator) {
        try {
            return driver.findElement(locator).isEnabled();
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

    public void navigateTo(String url) {
        driver.navigate().to(url);
    }

    public void scroll(int horizontal, int vertical) {
        ((JavascriptExecutor) driver).executeScript("scroll(" + horizontal + "," + vertical + ")");
    }

    public void clear(By locator) {
        WebElement areaDeEscritura = driver.findElement(locator);
        areaDeEscritura.clear();
    }

    public void select(By locator, String dato) {
        WebElement elemento = driver.findElement(locator);
        Select seleccionar = new Select(elemento);
        seleccionar.selectByVisibleText(dato);
    }

    public String getUrlTitle() {
        return driver.getTitle();
    }

    public void navegarAceptarCookie(String url, By locator) throws InterruptedException {
        navigateTo(url);
        Thread.sleep(3000);
        click(locator);
    }

    public void seleccionFechaIda(int diai, int mesi, int anhoi, int diav, int mesv, int anhov, By locator) {
        if (anhoi == 2022) {
            if (mesi == 11) {
                click((By.xpath(("(//button[@type='button'][normalize-space()='" + diai + "'])[2]"))));
            } else if (mesi == 12) {
                click(locator);
                click((By.xpath(("(//button[@type='button'][normalize-space()='" + diai + "'])[2]"))));
            }
        } else if (anhoi == 2023) {
            int NumeroMes = mesi - 1;
            click(locator);
            click(locator);
            for (int i = 0; i < 12; i++) {
                if (NumeroMes == i) {
                    click((By.xpath(("(//button[@type='button'][normalize-space()='" + diai + "'])[2]"))));
                    break;
                } else {
                    click(locator);
                }
            }
        }

        if (mesi == mesv) {
            click((By.xpath(("(//button[@type='button'][normalize-space()='" + diav + "'])[2]"))));
        } else {
            click(locator);
            click((By.xpath(("(//button[@type='button'][normalize-space()='" + diav + "'])[2]"))));
        }

    }

}
