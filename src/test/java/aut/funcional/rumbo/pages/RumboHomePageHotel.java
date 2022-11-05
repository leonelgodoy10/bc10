package aut.funcional.rumbo.pages;

import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumWrapper;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

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
    By btnBuscar = By.xpath("//button[@type='submit']");
    By siguienteMesLocator = By.xpath("//button[contains(@aria-label,'Next month')]//*[name()='svg']");
    By fechadeEntradaLocator = By.xpath("//div[contains(@class,'display-oti80i-DateRangePicker-styled')]//div[1]//button[1]");
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
    By valoracionesLocator = By.xpath("//a[@role='button']]");
    By parejasLocator = By.xpath("//div[@class='BrandedPageLayout___StyledDiv-sc-1x8t0fu-2 cTKbIy']");
    //methods

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
        navigateTo("https://www.mercadolibre.com.ar/");
        click(By.xpath("//a[@class='nav-menu-cp nav-menu-cp-logged']//span[@class='nav-menu-link-cp'][normalize-space()='Capital Federal']"));
        //buscarIframe(By.xpath("//a[@class='nav-menu-cp nav-menu-cp-logged']//span[@class='nav-menu-cp-send'][normalize-space()='Enviar a']"));
        cambiarseIframe(By.xpath("//a[@class='nav-menu-cp nav-menu-cp-logged']//span[@class='nav-menu-link-cp'][normalize-space()='Capital Federal']"));
        click(By.xpath("//a[@class='nav-menu-cp nav-menu-cp-logged']//span[@class='nav-menu-link-cp'][normalize-space()='Capital Federal']"));

    }



}


