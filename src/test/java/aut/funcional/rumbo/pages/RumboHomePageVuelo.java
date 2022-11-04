package aut.funcional.rumbo.pages;

import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
    By siguienteMesLocator = By.xpath("//button[contains(@aria-label,'Next month')]//*[name()='svg']");
    By origenVueloLocator = By.xpath("(//input[@id='mui-1'])[1]");
    By destinoVueloLocator = By.xpath("//input[@id='mui-2']");
    By primeraOpcionOrigenLocator = By.xpath("//li[@id='mui-1-option-0']");
    By primeraOpcionDestinoLocator = By.xpath("//li[@id='mui-2-option-0']");
    By seleccionDeClaseLocator = By.xpath("//div[contains(@class,'display-12cbrmg')]//div//button[contains(@type,'button')]");
    By seleccionViajeroLocator = By.xpath("//div[contains(@class,'display-uq0tvk')]//div//button[contains(@type,'button')]");
    By agregarAdultoLocator = By.xpath("//button[@aria-label='Aumentar el número de adultos']//*[name()='svg']");
    By seleccionNinoLocator = By.xpath("//button[@aria-label='Aumentar el número de niños']");
    By cierreSeleccionViajeroLocator = By.xpath("//button[contains(@class,'display-1ug1iap-Dropdown-styled')]");
    By sinResultadosPorCriterioDeBusquedaLocator = By.xpath("//div[@class='Container__StyledContainer-sc-sb5e2u-0 fzfA-dR NoResultsPanel__Title-sc-148mow5-2 ejrcDf']");
    By masBaratoLocator = By.xpath("//div[contains(@class,'listing-sorting-container')]//div[contains(@class,'sorting-tabs-view__label')][normalize-space()='Más barato']");
    By elMejorLocator = By.xpath("//div[contains(@class,'listing-sorting-container')]//div[contains(@class,'sorting-tabs-view__label')][normalize-space()='El mejor']");
    By masRapidoLocator = By.xpath("//div[contains(@class,'listing-sorting-container')]//div[contains(@class,'sorting-tabs-view__label')][normalize-space()='Más rápido']");
    By ningunaEscalaIda = By.xpath("//div[contains(@class,'stops-filter-container--way0')]//span[contains(@class,'checkboxlist-filter-view__desc desc')][normalize-space()='Ninguna']");
    By unaEscalaIdaLocator = By.xpath("//div[contains(@class,'stops-filter-container--way0')]//span[contains(@class,'checkboxlist-filter-view__desc desc')][normalize-space()='1 escala']");
    By dosEscalasIdaLocator = By.xpath("//div[contains(@class,'stops-filter-container--way0')]//span[contains(@class,'checkboxlist-filter-view__desc desc')][normalize-space()='2 escalas o más']");
    By topDestinosVuelosLocator = By.xpath("//h5[normalize-space()='Top destinos de vuelos']");
    By origenVueloLocato2 = By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    By idaLocator = By.xpath("//div[@class='lmn-sw-switcherBox']");
    By opcionChile = By.xpath("//div[@data-value='SCL']");
    By adultosTopLocator = By.xpath("//div[@data-type='adults']//span[@class='icon icon-plus']");
    By ninosTopLocator = By.xpath("//div[@data-type='children']//span[@class='icon icon-plus']");
    By bebesTopLocator = By.xpath("//div[@data-type='infants']//span[@class='icon icon-plus']");
    By pestanaPersonasLocator = By.xpath("//div[@class='passengersText lmn-sw-responsive-form-field lmn-sw-tooltip-responsive__text']");
    By fechaIdaCalendarioLocator = By.xpath("//div[normalize-space()='Fecha de ida']");
    By siguienteMesTopLocator = By.xpath("//span[@class='icon icon-arrow_right']");
    By buscarTopLocator = By.xpath("//div[contains(text(),'Buscar')]");
    By masBaratoTopLocator = By.xpath("//div[contains(@class,'content-layout-view__column-right col-md-9')]//li[2]");
    By limpiarFiltrosLocator = By.xpath("//button[contains(@class,'Button-sc-1bbve8d-0 NoResultsByFilterPanel__ClearAll-sc-l2dd88-7 gRWIbt kcMhkS')]");
    By informacionLocator = By.xpath("//div[@class='trip-collection-view__trips-container-top']//div[@class='FullWaySummary__Column-sc-43fbz2-5 FullWaySummary__InfoIcon-sc-43fbz2-12 gYsLQj jFkALV']//*[name()='svg']");
    By precioLocalizador = By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[5]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]");
    By ningunaEscalaVuelta = By.xpath("//div[contains(@class,'stops-filter-container--way1')]//span[contains(@class,'checkboxlist-filter-view__desc desc')][normalize-space()='Ninguna']");
    By unaEscalaVueltaLocator = By.xpath("//div[contains(@class,'stops-filter-container--way1')]//span[contains(@class,'checkboxlist-filter-view__desc desc')][normalize-space()='1 escala']");
    By dosEscalasVueltaLocator = By.xpath("//div[contains(@class,'stops-filter-container--way1')]//span[contains(@class,'checkboxlist-filter-view__desc desc')][normalize-space()='2 escalas o más']");
    By esperaEscalasLocator = By.xpath("//div[@class='content-layout-view__column-left col-md-3 col-sm-4']");

    By seleccionarSoloIdaLocator = By.xpath("//div[@class=\"display-xi36x7-ToggleGroup-ToggleGroup\"]");




    //methods
    public void aceptarCookie() {
        if (isDisplayed(BtnaceptarCookiesLocator) == true) {
            WebElement esperaCookie = findElement(BtnaceptarCookiesLocator);
            WebDriverWait esperar = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
            esperar.until(ExpectedConditions.elementToBeClickable(esperaCookie));
            click(BtnaceptarCookiesLocator);
        }
    }

    public void navegarYAceptarCookies() throws InterruptedException {
        navegarAceptarCookie(BASE_URL_AUT, BtnaceptarCookiesLocator);
    }

    public void selectorVuelos() {
        click(vueloslocator);
    }

    public void buscarVuelo() {
        click(btnBuscarVueloLocator);
    }

    public String mensajesDeErrores() {
        return getText(mensajeErrorVueloVacioLocator);
    }

    public String textoUrlTitulo() {
        return getUrlTitle();
    }

    public void origenDestinoSeleccion(String origen, String destino) {
        click(origenVueloLocator);
        clear(origenVueloLocator);
        write(origen, origenVueloLocator);
        click(primeraOpcionOrigenLocator);
        click(destinoVueloLocator);
        clear(destinoVueloLocator);
        write(destino, destinoVueloLocator);
        click(primeraOpcionDestinoLocator);
    }



    public void selectorDeClase(String dato) {
        click(seleccionDeClaseLocator);
        click(By.xpath("//div[normalize-space()='" + dato + "']"));
    }

    public void agregarAdultos(int nAdultos) {
        if (isDisplayed(agregarAdultoLocator) == false) {
            click(seleccionViajeroLocator);
        }
        if (nAdultos == 1) {
            click(agregarAdultoLocator);
        } else {
            for (int i = 1; i < nAdultos; i++) {
                click(agregarAdultoLocator);
            }
        }
        click(cierreSeleccionViajeroLocator);
    }

    public void agregarNino(String dato) {
        click(seleccionViajeroLocator);
        click(seleccionNinoLocator);

        click(By.xpath("//li[normalize-space()='" + dato + "']"));
        click(cierreSeleccionViajeroLocator);
    }

    public void escalasIda(String escalaIda) {//opciones disponibles, "1 escala" , "2 o mas"
        WebElement escalas = findElement(esperaEscalasLocator);
        WebDriverWait esperar = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
        esperar.until(ExpectedConditions.visibilityOf(escalas));

        if (isDisplayed(sinResultadosPorCriterioDeBusquedaLocator) == false) {
            if (escalaIda == "ninguna") {
                if (isDisplayed(ningunaEscalaIda) == true) {
                    click(ningunaEscalaIda);
                }
            }
            if (escalaIda == "1 escala") {
                if (isDisplayed(unaEscalaIdaLocator) == true) {
                    click(unaEscalaIdaLocator);
                }
            }
            if (escalaIda == "2 o mas") {
                if (isDisplayed(dosEscalasIdaLocator) == true) {
                    click(dosEscalasIdaLocator);
                }
            }
        }
    }

    public void escalasVuelta(String escalaVuelta) {//opciones disponibles, "ninguna", "1 escala" , "2 o mas"
        if (isDisplayed(sinResultadosPorCriterioDeBusquedaLocator) == false) {
            if (escalaVuelta == "ninguna") {
                if (isDisplayed(ningunaEscalaVuelta) == true) {
                    click(ningunaEscalaVuelta);
                }
            }
            if (escalaVuelta == "1 escala") {
                if (isDisplayed(unaEscalaVueltaLocator) == true) {
                    click(unaEscalaVueltaLocator);
                }
            }
            if (escalaVuelta == "2 o mas") {
                if (isDisplayed(dosEscalasVueltaLocator) == true) {
                    click(dosEscalasVueltaLocator);
                }
            }
        }
    }

    public void mejorBaratoRaido(String filto) {//opciones disponibles son El mejor, Más barato y Más rápido

        if (isDisplayed(sinResultadosPorCriterioDeBusquedaLocator) == false) {
            if (filto == "El mejor") {
                click(elMejorLocator);
            } else if (filto == "Más barato") {
                click(masBaratoLocator);
            } else {
                click(masRapidoLocator);
            }
        }
    }

    public void navegarAlHome() {
        navigateTo(BASE_URL_AUT);
    }

    public void scrollPage(int horizontal, int vertical) {
        scroll(horizontal, vertical);
    }

    public void buscaridaYVuelta(int diaIda, int mesIda, int anhoida, int diaVuelta, int mesVuelta, int anhoVuelta) {
        seleccionFechaIda(diaIda, mesIda, anhoida, diaVuelta, mesVuelta, anhoVuelta, siguienteMesLocator);
    }

    public void clickTopCiudades() {
        click(topDestinosVuelosLocator);
    }

    public void buscarTopCiudad(String ciudad) throws InterruptedException {
        buscarCiudadTop(ciudad);
    }

    public void buscarIdaViajeTop(String ciudad) {
        click(idaLocator);
        click(origenVueloLocato2);
        clear(origenVueloLocato2);
        write(ciudad, origenVueloLocato2);
    }

    public void clickearAropuerto() {
        click(opcionChile);
    }

    public void agregarPersonas(int Adultos, int ninos, int bebes) throws InterruptedException {
        int numeroDeClicksAdultos = Adultos;
        int numeroDeClicksninos = ninos;
        int numeroDeClicksbebes = bebes;

        click(pestanaPersonasLocator);
        if (Adultos > 0) {
            for (int i = 1; i < numeroDeClicksAdultos; i++) {
                click(adultosTopLocator);
            }

        }
        if (ninos > 0) {
            for (int i = 0; i < numeroDeClicksAdultos - 1; i++) {
                click(ninosTopLocator);
            }
        }
        if (bebes > 0) {
            for (int i = 0; i < numeroDeClicksAdultos - 1; i++) {
                click(bebesTopLocator);
            }
        }
    }

    public void modificarFechaIda(int dia, int mes, int anho) {
        click(fechaIdaCalendarioLocator);
        seleccionarfechaIda(dia, mes, anho, siguienteMesTopLocator);
    }

    public void buscar() {
        click(buscarTopLocator);
    }

    public void seleccionarMasBarato() {
        click(masBaratoTopLocator);
    }

    public void bajarPrecio() {
        bajarPreciosTop();
    }

    public void bajarEscalaTop() {
        bajarEscalasTop();
    }

    public void limpiarFiltros() {
        click(limpiarFiltrosLocator);
    }

    public void informacion() {
        click(informacionLocator);
    }

    public void cambiarIframe() throws InterruptedException {
        cambiarAIframe();
    }

    public void informacionYClick() throws InterruptedException {
        mouseEncima();
    }

    public void clickearPrecio() {
        clickearPrecio(precioLocalizador);
    }

    public void seleccionarSoloIda(){
click(seleccionarSoloIdaLocator);

    }

    public void seleccionarDestino(String destino){
        click(destinoVueloLocator);
        clear(destinoVueloLocator);
        write(destino, destinoVueloLocator);
        click(primeraOpcionDestinoLocator);
    }
    }



