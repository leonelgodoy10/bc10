package aut.funcional.rumbo.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RumboHomePageHotel extends SeleniumWrapper {

    public RumboHomePageHotel(WebDriver driver) {
        super(driver);
    }

    //locators
    By BtnaceptarCookiesLocator = By.xpath("//button[@class='iubenda-cs-accept-btn iubenda-cs-btn-primary']");
    By btnHotelLocator = By.xpath("//div[@class='display-1dpcy4y-HubNavigationMenu-styled e10w470p3']//a[@title='Hoteles'][normalize-space()='Hoteles']");
    By pagoFraccionadoLocator = By.xpath("//body/div/div[contains(@class,'e19fnmvl0 display-f38482-HubRow-withBoxModel-withBoxModel e1gf7ux32')]/div[contains(@class,'hub-container mobile e1gf7ux30 display-1d1x1j2-Container-layouts-layouts-HubRow-HubRow eg3h3jz0')]/div[contains(@class,'e5okb9y0 display-vdrm12-Row-styles-scrollbars-Row-styles e1sskiuc0')]/div[4]/div[1]/div[3]/a[1]");
    By btnEchaleUnVistazoLocator = By.xpath("//a[normalize-space()='Échale un vistazo']");
    By buscarAlojamientoEnLocator = By.xpath("//input[@id='mui-1']");
    By primeraOpcionDespAlojamientolegadaLocator = By.xpath("//li[@id='mui-1-option-0']");


    By fechadeEntradaLocator = By.xpath("//button[@class='display-q24bix-DateInput-styled']");
    By fechaDeSalidaLocator = By.xpath("//button[contains(@class,'display-19sl708-DateInput-styled-DateInput-styled')]");

    By seleccionFechaDeEntradaLocator10102022 = By.xpath("//button[@class='display-1yiau9q-Day-styled-Day-styled-Day-styled-Day-styled']");
    By seleccionFechaDeSalidaLocator13102022 = By.xpath("//button[contains(@class,'display-s2qfcl-Day-styled-Day-styled-Day-styled')][normalize-space()='13']");

    By seleccionHotelesRuralesLocator = By.xpath("//h4[normalize-space()='Hoteles rurales']");

    By seleccionHotelFincaLosLlanosLocator = By.xpath("//span[normalize-space()='Hotel Finca Los Llanos']");
    //methods

   By elegirTipoHabitacionLocator = By.xpath("//button[normalize-space()='Elegir tipo de habitación']");

   By aplicarFiltroSoloAlojamientoLocator = By.xpath("//button[normalize-space()='Solo alojamiento']");

   By aplicarFiltroDesayunoInLocator = By.xpath("//button[normalize-space()='Desayuno incluido']");

   By verDetallesHabitacionLocator = By.xpath("(//div[normalize-space()='Ver detalles'])[1]");

   By ocultarDetallesHabitacionLocator = By.xpath("(//div[normalize-space()='Ocultar detalles'])[1]");


    public void aceptarCookie() {
        click(BtnaceptarCookiesLocator);
    }

    public void selectorHotel() {
        click(btnHotelLocator);
    }

    public void selecionarFraccionado() {
        click(pagoFraccionadoLocator);
    }

    public void echaleUnVistazo() {
        click(btnEchaleUnVistazoLocator);
    }

    public String textoUrlTitulo() {
        return getUrlTitle();
    }

    public void navegarAlHome() {
        navigateTo(BASE_URL_AUT);
    }

    public void buscarAlojamientoEn(String dato) {
        click(buscarAlojamientoEnLocator);
        write(dato, buscarAlojamientoEnLocator);
        click(primeraOpcionDespAlojamientolegadaLocator);

    }

    public void fechaCalendario(int i, int s) {
        click(fechadeEntradaLocator);
        click(seleccionFechaDeEntradaLocator10102022);
        click(fechaDeSalidaLocator);
        click(seleccionFechaDeSalidaLocator13102022);

    }

    public void seleccionHotelesRurales(){
        click(seleccionHotelesRuralesLocator);
    }

    public void seleccionHotelFincaLosLlanos(){
        click(seleccionHotelFincaLosLlanosLocator);

    }

    public void elegirTipoHabitacion(){
        click(elegirTipoHabitacionLocator);
    }

    public void aplicarFiltrosHabitacion(){
        click(aplicarFiltroSoloAlojamientoLocator);
        click(aplicarFiltroDesayunoInLocator);
    }

    public void detallesHabitacion(){
        click(verDetallesHabitacionLocator);
        click(ocultarDetallesHabitacionLocator);
    }


}
