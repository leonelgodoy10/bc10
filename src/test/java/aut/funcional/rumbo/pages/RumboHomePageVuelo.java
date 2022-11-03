package aut.funcional.rumbo.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
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
    By masRapidoLocator = By.xpath("//div[contains(@class,'listing-sorting-container')]//div[contains(@class,'sorting-tabs-view__amount')][contains(text(),'903,99 €')]");

    By unaEscalaIdaLocator = By.xpath("//div[contains(@class,'stops-filter-container--way0')]//span[contains(@class,'checkboxlist-filter-view__desc desc')][normalize-space()='1 escala']");
    By dosEscalasIdaLocator = By.xpath("//div[contains(@class,'stops-filter-container--way0')]//span[contains(@class,'checkboxlist-filter-view__desc desc')][normalize-space()='2 escalas o más']");
    By ningunaEscalaVuelta = By.xpath("");
    By unaEscalaVueltaLocator = By.xpath("");
    By dosEscalasVueltaLocator = By.xpath("");

    By seleccionMultidestinoLocator = By.xpath("//a[@class='display-1h4wa6k-FlightTab-styled-ToggleGroup-ToggleGroup-FlightTab-styled']");

    By seleccionVuelaEuropaLocator = By.xpath("(//p[normalize-space()='Ver las ofertas >'])[1]");
    //methods

    By santiagoChileLocator = By.xpath("(//div[normalize-space()='Santiago de Chile, Chile'])[2]");

    By miamiLocator = By.xpath("(//div[normalize-space()='Miami, Estados Unidos'])[1]");

    By origenMultiVueloLocator = By.xpath("(//input[@class='SearchFieldstyled__SearchFieldInput-sc-1f3jsso-5 furDfp'])[1]");

    By destinoMultiVueloLocator = By.xpath("(//input[@class='SearchFieldstyled__SearchFieldInput-sc-1f3jsso-5 furDfp'])[2]");

    By origen2MultiVueloLocator = By.xpath("(//input[@class='SearchFieldstyled__SearchFieldInput-sc-1f3jsso-5 furDfp'])[4]");

    By destino2MultiVueloLocator = By.xpath("(//input[@class='SearchFieldstyled__SearchFieldInput-sc-1f3jsso-5 furDfp'])[5]");

    By seleccionPrimeraOpcMultiLocator = By.xpath("(//div[@class='Stack__StyledStack-sc-oaff2v-0 ecPQEH'])[1]");

    By cerrarMultiDestinoCookieLocator = By.xpath("(//div[@class='ButtonPrimitiveIconContainer__StyledButtonPrimitiveIconContainer-sc-8rx3cv-0 fxbcmo'])[1]");

    By borrarTodoMultiDestinoLocator = By.xpath("//div[contains(text(),'Borrar todos')]");

    By buscarMultivueloLocator = By.xpath("(//div[@class='ButtonPrimitiveContentChildren__StyledButtonPrimitiveContentChildren-sc-1m4y8u8-0 jiqdNk'])[7]");


    public void aceptarCookie() {
        click(BtnaceptarCookiesLocator);
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

    public void agregarNino(String dato) throws InterruptedException {
        click(seleccionViajeroLocator);
        click(seleccionNinoLocator);
        Thread.sleep(1000);
        click(By.xpath("//li[normalize-space()='" + dato + "']"));
        click(cierreSeleccionViajeroLocator);
    }

    public void escalasIda(String escalaIda) {//opciones disponibles, "1 escala" , "2 o mas"
        if (isDisplayed(sinResultadosPorCriterioDeBusquedaLocator) == false) {
            if (escalaIda == "1 escala") {
                click(unaEscalaIdaLocator);
            }
            if (escalaIda == "2 o mas") {
                click(dosEscalasIdaLocator);
            }
        }
    }
    public void escalasVuelta(String escalaVuelta){//opciones disponibles, "ninguna", "1 escala" , "2 o mas"
        if (isDisplayed(sinResultadosPorCriterioDeBusquedaLocator) == false) {
            if (escalaVuelta == "ninguna") {
                click(ningunaEscalaVuelta);
            }
            if (escalaVuelta == "1 escala") {
                click(unaEscalaVueltaLocator);
            }
            if (escalaVuelta == "2 o mas") {
                click(dosEscalasVueltaLocator);
            }
        }
    }

    public void mejorBaratoRaido(String filto) {//opciones disponibles son El mejor, Más barato y Más rápido

        if (isDisplayed(sinResultadosPorCriterioDeBusquedaLocator) == false) {
            if (filto != "El mejor") {
                if (filto == "Más barato") {
                    click(masBaratoLocator);
                } else {
                    click(masRapidoLocator);
                }
            }
        }
    }

    public void navegarAlHome() {
        navigateTo(BASE_URL_AUT);
    }

    public void scrollPage(int horizontal, int vertical) {
        scroll(horizontal, vertical);
    }


    public void clickearFechaIda() {
        click(By.xpath("(//button[@class='display-q24bix-DateInput-styled'])[1]"));

    }

    public void buscaridaYVuelta(int diaIda, int mesIda, int anhoida, int diaVuelta, int mesVuelta, int anhoVuelta) {
        seleccionFechaIda(diaIda, mesIda, anhoida, diaVuelta, mesVuelta, anhoVuelta, siguienteMesLocator);
    }

    public void seleccionVuelaEuropa(){
    click(seleccionVuelaEuropaLocator);
    }

    public void seleccionMultidestino(){
        click(seleccionMultidestinoLocator);

    }

    public void seleccionMultiOrigenDestino(String origen1, String destino1, String origen2, String destino2) throws InterruptedException {

        click(origenMultiVueloLocator);
        clear(origenMultiVueloLocator);
        write(origen1, origenMultiVueloLocator);
        Thread.sleep(3000);
        click(seleccionPrimeraOpcMultiLocator);

        click(destinoMultiVueloLocator);
        clear(destinoMultiVueloLocator);
        write(destino1, destinoMultiVueloLocator);
        Thread.sleep(3000);
        click(seleccionPrimeraOpcMultiLocator);

        click(origen2MultiVueloLocator);
        clear(origen2MultiVueloLocator);
        write(origen2, origen2MultiVueloLocator);
        Thread.sleep(3000);
        click(seleccionPrimeraOpcMultiLocator);

        click(destino2MultiVueloLocator);
        clear(destino2MultiVueloLocator);
        write(destino2, destino2MultiVueloLocator);
        Thread.sleep(3000);
        click(seleccionPrimeraOpcMultiLocator);
    }

    public void borrarTodoMultiDestino(){
        click(borrarTodoMultiDestinoLocator);
    }

    public void cerrarMultiDestinoCookie(){
        click(cerrarMultiDestinoCookieLocator);
    }

    public void buscarMultivuelo(){
        click(buscarMultivueloLocator);
    }
    public void seleccionOrigenSantiagoChile() throws InterruptedException {
        click(origenVueloLocator);
        write("Santiago",origenVueloLocator);
        Thread.sleep(1000);
        click(santiagoChileLocator);
    }

    public void seleccionDestinoMiami() throws InterruptedException {
        click(destinoVueloLocator);
        write("Miami",destinoVueloLocator);
        Thread.sleep(1000);
        click(miamiLocator);
    }


}

