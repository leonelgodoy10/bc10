package aut.funcional.rumbo.pages;

import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;
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
    By seleccionarSpaLocator = By.xpath("//h4[normalize-space()='Hoteles con spa']");
    By seleccionarMiroLocator = By.xpath("//span[normalize-space()='Hotel Miró']");
    By tipoHabitacionLocator = By.xpath("//*[@id=\"__next\"]/div[3]/div[8]/nav/div/button");
    By HabitacionDoubleLocator = By.xpath(("//span[normalize-space()='Cancelación gratuita'])[1]"));
    By seleccionHotelesRuralesLocator = By.xpath("//h4[normalize-space()='Hoteles rurales']");
    By seleccionHotelFincaLosLlanosLocator = By.xpath("//span[normalize-space()='Hotel Finca Los Llanos']");
    By btnBuscar = By.xpath("//button[@type='submit']");
    By siguienteMesLocator = By.xpath("//button[contains(@aria-label,'Next month')]//*[name()='svg']");
    By seleccionViajeroLocator = By.xpath("//button[@class='display-vu9q0w-Dropdown-styled']");
    By agregarAdultoLocator = By.xpath("//button[@aria-label='Aumentar el número de adultos']//*[name()='svg']");
    By seleccionNinoLocator = By.xpath("//button[@aria-label='Aumentar el número de niños']");
    By cierreSeleccionViajeroLocator = By.xpath("//button[contains(@class,'display-1ug1iap-Dropdown-styled')]");
    By filtroEstrellasLocator = By.xpath("//span[normalize-space()='Estrellas']");
    By cualquierDestino = By.xpath("//li[@id='mui-1-option-0']");
    By filtroPrecio = By.xpath("//span[normalize-space()='Precio']");
    By ceroA300 = By.xpath("//div[normalize-space()='0 - 300']");
    By aplicarLocator = By.xpath("//button[normalize-space()='Aplicar']");
    By casaLocator = By.xpath("//span[normalize-space()='Tipo de alojamiento']");
    By casa2 = By.xpath("//span[normalize-space()='Casas']");
    By filtrocancelacionGratuita = By.xpath("//div[contains(text(),'Cancelación gratuita')]");
    By filtrowifiGratisLocator = By.xpath("//div[contains(text(),'Wifi gratis')]");
    By filtroValoracionLocator = By.xpath("//div[@id='container_full_width']//div[4]//div[1]//*[name()='svg']");
    By excelenteLocator = By.xpath("//div[@class='sc-dPyBCJ kmZvLO filter-rating-label-excellent']");
    By muyBuenoLocator = By.xpath("//div[@class='sc-dPyBCJ kmZvLO filter-rating-label-very-good']");
    By buenoLocator = By.xpath("//div[@class='sc-dPyBCJ kmZvLO filter-rating-label-good']");
    By filtroRegimenLocator = By.xpath("//span[normalize-space()='Régimen']");
    By todoIncluidoLocator = By.xpath("//*[name()='path' and contains(@d,'M0.333496 ')]");
    By chipreLocator = By.xpath("//div[@class='sc-BeQoi gVBHRE openx-ui-card-content']");
    By limpiarTodosLocator = By.xpath("//button[normalize-space()='Limpiar todos']");
    By avanzarFotosLocator = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/img[1]");
    By verMasLocator = By.xpath("(//a[@class='sc-bZnhIo gcujSs show-more'][normalize-space()='Ver más'])[1]");
    By parejasLocator = By.xpath("/html/body/header/div/section[2]/div[10]/ul/li[2]/a/span/span[1]");
    By familiasLocator = By.xpath("/html/body/header/div/section[2]/div[10]/ul/li[3]/a/span/span[1]");
    By elegirTipoHabitacionLocator = By.xpath("//button[@class='Button-sc-1bbve8d-0 bsSjVP SubNavigation___StyledScrollToIdButton-sc-1sfp8me-7 jThHsW']");
    By aplicarFiltroSoloAlojamientoLocator = By.xpath("//button[normalize-space()='Solo alojamiento']");
    By aplicarFiltroDesayunoInLocator = By.xpath("//button[normalize-space()='Desayuno incluido']");
    By verDetallesHabitacionLocator = By.xpath("(//div[normalize-space()='Ver detalles'])[1]");
    By ocultarDetallesHabitacionLocator = By.xpath("(//div[normalize-space()='Ocultar detalles'])[1]");


    public void aceptarCookie() {
        if (isDisplayed(BtnaceptarCookiesLocator) == true) {
            WebElement esperaCookie = findElement(BtnaceptarCookiesLocator);
            WebDriverWait esperar = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
            esperar.until(ExpectedConditions.elementToBeClickable(esperaCookie));
            click(BtnaceptarCookiesLocator);
        }
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

    public void buscarHotel() {
        click(btnBuscar);
    }

    public void navegarAlHome() {
        navigateTo(BASE_URL_AUT);
    }

    public void buscarAlojamientoEn(String dato) {
        WebElement esperarAlojamiento = findElement(buscarAlojamientoEnLocator);
        WebDriverWait esperar = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
        esperar.until(ExpectedConditions.elementToBeClickable(esperarAlojamiento));
        click(buscarAlojamientoEnLocator);
        write(dato, buscarAlojamientoEnLocator);
        click(primeraOpcionDespAlojamientolegadaLocator);
    }


    public void seleccionarhotelSpa() {
        click(seleccionarSpaLocator);
    }

    public void seleccionarhotelMiro() {
        click(seleccionarMiroLocator);
    }

    public void seleccionarTipoHabitacion() {
        click(tipoHabitacionLocator);
    }

    public void seleccionarSoloHabitacionDouble() {
        click(HabitacionDoubleLocator);
    }


    public void fechaCalendario(int i, int s) throws InterruptedException {
        click(fechadeEntradaLocator);
        click(seleccionFechaDeEntradaLocator10102022);
        click(fechaDeSalidaLocator);
        click(seleccionFechaDeSalidaLocator13102022);
    }

    public void buscaridaYVuelta(int diaIda, int mesIda, int anhoida, int diaVuelta, int mesVuelta, int anhoVuelta) {
        WebElement esperaFecha = findElement(fechadeEntradaLocator);
        WebDriverWait esperar = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
        esperar.until(ExpectedConditions.elementToBeClickable(esperaFecha));
        seleccionFechaIda(diaIda, mesIda, anhoida, diaVuelta, mesVuelta, anhoVuelta, siguienteMesLocator);
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
        if (isDisplayed(By.xpath("//span[@class='display-rm8ly8-Room-styled']")) == false) {
            click(seleccionViajeroLocator);
        }
        WebElement esperarNino = findElement(seleccionNinoLocator);
        WebDriverWait esperar = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
        esperar.until(ExpectedConditions.elementToBeClickable(esperarNino));
        click(seleccionNinoLocator);
        click(By.xpath("//li[normalize-space()='" + dato + "']"));
        click(cierreSeleccionViajeroLocator);
    }

    public void filtroEstrellas(int nEstrellas) {
        WebElement esperarEstrella = findElement(filtroEstrellasLocator);
        WebDriverWait esperar = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
        esperar.until(ExpectedConditions.elementToBeClickable(esperarEstrella));
        click(filtroEstrellasLocator);
        int nRespaldo = 0;
        if (nEstrellas == 5) {
            nRespaldo = 1;
        }
        if (nEstrellas == 4) {
            nRespaldo = 2;
        }
        if (nEstrellas == 3) {
            nRespaldo = 3;
        }
        if (nEstrellas == 2) {
            nRespaldo = 4;
        }
        if (nEstrellas == 1) {
            nRespaldo = 5;
        }
        click(By.xpath("//body/div[contains(@class,'sc-bhVIhj ioZiXt custom-overlay-portal')]/div[@class='sc-eGAhfa dMYIUp']/div[" + nRespaldo + "]/div[1]"));
    }

    public void ningunDestino() {

        click(buscarAlojamientoEnLocator);
        click(cualquierDestino);

    }

    public void filtroDinero() {
        click(filtroPrecio);
        click(ceroA300);
        click(aplicarLocator);
    }

    public void filtroAlojamiento() {
        click(casaLocator);
        click(casa2);
        click(aplicarLocator);


    }

    public void filtroCancelacionGratuita() {

        click(filtrocancelacionGratuita);
    }

    public void seleccionHotelesRurales() {
        click(seleccionHotelesRuralesLocator);
    }

    public void seleccionHotelFincaLosLlanos() {
        click(seleccionHotelFincaLosLlanosLocator);

    }

    public void elegirTipoHabitacion() {
        click(elegirTipoHabitacionLocator);
    }

    public void aplicarFiltrosHabitacion() {
        click(aplicarFiltroSoloAlojamientoLocator);
        click(aplicarFiltroDesayunoInLocator);
    }

    public void detallesHabitacion() {
        click(verDetallesHabitacionLocator);
        click(ocultarDetallesHabitacionLocator);
    }

    public void filtrowifiGratis() {

        click(filtrowifiGratisLocator);
    }

    public void filtroValoracion() {
        click(filtroValoracionLocator);
        click(excelenteLocator);
        click(muyBuenoLocator);
        click(buenoLocator);
        click(aplicarLocator);

    }

    public void filtroRegimen() {
        click(filtroRegimenLocator);
        click(todoIncluidoLocator);
        click(aplicarLocator);

    }

    public void seleccionarPais() throws InterruptedException {
        click(chipreLocator);
        Thread.sleep(5000);
    }

    public void limpiarFiltro() throws InterruptedException {
        click(limpiarTodosLocator);
        Thread.sleep(1000);


    }

    public void seleccionarHotel() {

        click(avanzarFotosLocator);
        click(avanzarFotosLocator);
        click(avanzarFotosLocator);
        click(avanzarFotosLocator);
        click(verMasLocator);

    }

    public void valoraciones() throws InterruptedException {
        navigateTo("https://hotel.rumbo.es/details/hotel/1681696/hotel-only?search.rooms%5B0%5D.adults=3&search.rooms%5B0%5D.children=1&search.rooms%5B0%5D.childrenAge%5B0%5D=2&openx=true&search.departureIntervals=20221120-20221202&search.type=OSE&search.businessProfileId=HOLIDAYSRUMBOES_OSS&search.destinationTag=CIPRO&bf_subsource=S07RRTL0S07PD03&search.accomodationOnly=true&search.checkin=202211-20&search.checkout=202212-02&mealplan=ALL_INCLUSIVE&extReferenceId=2v4rb7n9gdmtfib5pi&extReferenceType=OPENX&hdpSearchId=2v4rb7n9gdmtfib5pi&searchId=589226389&referenceEventId=oss_qprwa9r6wfmarnru2g&sessionId=6994790290714818560");
        By iframeLocalizador = By.xpath("(//iframe[@id='iFrameResizer0'])[1]");
        cambiarseIframe(iframeLocalizador);
        System.out.println(getUrlTitle());
        click(parejasLocator);
        click(familiasLocator);

    }


}

