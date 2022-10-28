package aut.funcional.rumbo.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RumboHomePageVuelo extends SeleniumWrapper {

    public RumboHomePageVuelo(WebDriver driver) {
        super(driver);
    }

    //locators
    By BtnaceptarCookiesLocator = By.xpath("//button[@class='iubenda-cs-accept-btn iubenda-cs-btn-primary']");
    By vueloslocator = By.xpath("//div[@class='display-1dpcy4y-HubNavigationMenu-styled e10w470p3']//a[@title='Vuelos'][normalize-space()='Vuelos']");
    By btnBuscarVueloLocator = By.xpath("//button[normalize-space()='Buscar']");
    By mensajeErrorVueloVacioLocator = By.xpath("//span[@class='display-1jbu58d-ValidationMessage-styled-ValidationMessage-styled-ValidationMessage-styled']");
    By btnTopDestinosDeVuelosLocator = By.xpath("(//button[contains(@type,'button')])[13]");
    By btnVuelosABruselasLocator = By.xpath("//a[normalize-space()='Vuelos a Bruselas']");
    By btnOrigenBoxLocator = By.xpath("(//input[@class='lmn-sw-responsive-form-field'])[1]");
    By btnArturoMerinoLocator = By.xpath("//div[@data-value='SCL']//span[2]");
    //methods
    public void aceptarCookie(){
        click(BtnaceptarCookiesLocator);
    }
    public void navegarYAceptarCookies() throws InterruptedException {navegarAceptarCookie(BASE_URL_AUT,BtnaceptarCookiesLocator);}
    public void selectorVuelos(){
        click(vueloslocator);
    }
    public void buscarVuelo(){
        click(btnBuscarVueloLocator);
    }
    public String mensajesDeErrores(){
        return getText(mensajeErrorVueloVacioLocator);
    }
    public String textoUrlTitulo(){return getUrlTitle();}
    public void navegarAlHome(){navigateTo(BASE_URL_AUT);}
    public void scrollear(){scroll(0,3500);}
    public void clickearTopDestinosDeVuelos(){click(btnTopDestinosDeVuelosLocator);}
    public void clickearVueloABruselas(){click(btnVuelosABruselasLocator);}
    public void clickearOrigenBox(){click(btnOrigenBoxLocator);}
    public void escribirChile(){sendKeys("chile",btnOrigenBoxLocator);}
    public void clickearArturoBenitez(){click(btnArturoMerinoLocator);}


}
