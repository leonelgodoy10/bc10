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

public class RumboHomePageCrucero extends SeleniumWrapper {

    public RumboHomePageCrucero(WebDriver driver) {
        super(driver);
    }

    //locators
    By BtnaceptarCookiesLocator = By.xpath("//button[@class='iubenda-cs-accept-btn iubenda-cs-btn-primary']");
    By verMasLocator = By.xpath("//body/div/div[contains(@class,'e19fnmvl0 display-r41hps-HubRow-withBoxModel-withBoxModel e1gf7ux32')]/div[contains(@class,'mobile e1gf7ux30 display-bpt8tl-Container-HubRow eg3h3jz0')]/div[contains(@class,'e5okb9y0 hub-no-gutters display-j4ga9b-Row-styles e1sskiuc0')]/div[contains(@class,'hub-col-md-12 hub-col-12 hub-col display-1k9w8js-Column-styles-Column-styles e1i8mjyc0')]/div[contains(@class,'e19fnmvl0 content-wrapper display-9axkc6-HubColumn-styles-withBoxModel-withBoxModel e1151aq91')]/div[contains(@class,'notranslate e19fnmvl0 display-14wpwcp-HubNavigation-styled-HubNavigation-styled-withBoxModel-withBoxModel e1k86xxr1')]/div[contains(@class,'display-kixg3l-HubNavigation-styled e1k86xxr0')]/div[contains(@class,'display-1dpcy4y-HubNavigationMenu-styled e10w470p3')]/div[contains(@class,'display-1dsq6h9-HubNavigationMenu-styled e10w470p2')]/ul[contains(@class,'display-5ue5gp-HubNavigationMenu-styled e10w470p1')]/li[contains(@class,'display-1eyezhb-HubNavigationMenu-styled-HubNavigationMenu-styled e10w470p0')]/div[1]");
    By crucerosLocator = By.xpath("//div[contains(@class,'display-1dpcy4y-HubNavigationMenu-styled e10w470p3')]//a[contains(@title,'Cruceros')][normalize-space()='Cruceros']");
    By navegarOfertasLocator = By.xpath("//body/div[@class='container container-home']/crs-home-offers/section[@class='crs-offers']/header[@class='crs-offers__header']/div[@class='crs-offers__utils']/crs-btn[@classname='crs-offers-btn-next']/button[@class='crs-btn crs-btn--secondary crs-btn--small crs-btn--outline crs-btn--icon crs-offers-btn-next ng-star-inserted']/span[@class='crs-icon ng-star-inserted']/*[1]//*[name()='svg']");
    By verTodasLasOfertasLocator = By.xpath("//a[@title='Ver todas las ofertas']");
    By buscarLocator = By.xpath("//span[normalize-space()='Buscar']");
    By destinoCruceroLocator = By.xpath("//div[@class='p-multiselect-label ng-tns-c52-3 p-placeholder']");
    By cualquierDestinoBusquedaLocator = By.xpath("//input[@role='textbox']");
    By cualquierPeriodoLocator = By.xpath("//span[normalize-space()='Cualquier periodo']");
    By cualquierDuracionLocator = By.xpath("//span[@id='pr_id_1_label']");
    By cualquierCompaniaLocator = By.xpath("//div[@class='ng-tns-c52-5 crs_field--cruiseline p-multiselect p-component']");
    By companiaTextBoxLocator = By.xpath("//input[@role='textbox']");
    By cualquierPuertoLocator = By.xpath("//crs-multi-select[@formcontrolname='ports']");
    By puertoTextBoxLocator = By.xpath("//input[@role='textbox']");
    By pasajerosLocator = By.xpath("//crs-occupancy-dd-selector[@formcontrolname='occupancy']");
    By agregarAdultoLocator = By.xpath("(//button[contains(text(),'+')])[1]");
    By agregarJuniorLocator = By.xpath("(//button[contains(text(),'+')])[2]");
    By agregarNinoLocator = By.xpath("(//button[contains(text(),'+')])[3]");
    By agregarBebeLocator = By.xpath("(//button[contains(text(),'+')])[4]");
    By cierrePasajerosLocator = By.xpath("//div[@class='crs-field-dd-occupancy crs_field--occupancy']//div[@class='p-dropdown p-component']");
    By mscCrucerosLocator = By.xpath("//div[@id='merchandise-1-msc-cruceros']//div[@class='text-price']");
    By verMasCruceroMscLocator = By.xpath("//span[@class='btn btn-exp']");
    By crucerosPorElMediterraneoLocator = By.xpath("//a[normalize-space()='cruceros por el Mediterráneo']");
    By crucerosDevolverLocator = By.xpath("//a[normalize-space()='cruceros']");
    By costaCrucerosLocator = By.xpath("//span[@class='date'][normalize-space()='Costa Cruceros']");
    By cruceroPorIslasGriegas = By.xpath("//a[@title='crucero islas griegas ofertas']");
    By reiniciarBusquedaLocator = By.xpath("//span[normalize-space()='Reiniciar búsqueda']");

    By buscarCruceroLocator = By.xpath("//span[normalize-space()='Buscar']");
    By recomendadosLocator = By.xpath("//span[@class='p-dropdown-trigger-icon ng-tns-c43-8 pi pi-chevron-down']");
    By ratingLocator = By.xpath("//li[@aria-label='Rating']");
    By cargarMasResultado = By.xpath("//span[normalize-space()='Cargar más resultados']");
    By volverArribaLocator = By.xpath("//span[normalize-space()='Volver arriba']");
    By selectorMoverLocator = By.xpath("//crs-carousel[@class='crs-card-departure-dates__carousel swiper-initialized swiper-horizontal swiper-pointer-events swiper-free-mode']//div[@class='crs-card-departure-date crs-card-departure-date--active']");
    By descubreElItinirerioLocator = By.xpath("//span[@class='crs-label ng-star-inserted'][normalize-space()='descubre el itinerario']");
    By dia1 = By.xpath("//button[@aria-label='Expand or collapse itinerary day 1']");
    //By dia2 = By.xpath("");
    By dia3 = By.xpath("//button[@aria-label='Expand or collapse itinerary day 3']");
    By dia4 = By.xpath("//button[@aria-label='Expand or collapse itinerary day 4']");
    By dia5 = By.xpath("//button[@aria-label='Expand or collapse itinerary day 5']");
    By dia6 = By.xpath("//button[@aria-label='Expand or collapse itinerary day 6']");
    By dia7 = By.xpath("//button[@aria-label='Expand or collapse itinerary day 7']");
    By dia9 = By.xpath("//button[@aria-label='Expand or collapse itinerary day 9']");
    By companhiaLocator = By.xpath("//span[normalize-space()='Compañia']");
    By solicitarPresupuesto = By.xpath("//button[@class='crs-btn crs-btn--cta crs-btn--contain crs-btn--block ng-star-inserted']//span[@class='crs-label ng-star-inserted'][normalize-space()='Solicitar presupuesto']");
    By barraInsertaNombreLocator = By.xpath("//input[@id='firstname_1667603166336']");
    By barraApellidoLocator = By.xpath("//input[@id='lastname_1667603166336']");
    By barraEmailLocator = By.xpath("//input[@id='email_1667603166336']");
    By seleccionPeriodoLocator = By.xpath("//div[@class='crs-field-dd-calendar ng-star-inserted']");
    By botonSiguienteAñoLocator = By.xpath("//span[@class='p-datepicker-next-icon pi pi-chevron-right ng-tns-c56-10']");
    By seleccionMesJunioLocator = By.xpath("(//span[@class='p-ripple p-element p-monthpicker-month ng-tns-c56-12 ng-star-inserted'])[6]");
    By casillerolocator = By.xpath("//span[@class='p-multiselect-trigger-icon ng-tns-c52-6 pi pi-chevron-down']");
    By barcelocator = By.xpath("//li[@aria-label='Barcelona']");
    //By casillerolocator = By.xpath("//span[@class=\"p-multiselect-trigger-icon ng-tns-c52-6 pi pi-chevron-down\"]");
    //By barcelocator = By.xpath("//li[@aria-label=\"Barcelona\"]");
    By cuadroDeOcupantes = By.xpath("//div[@class='crs-op-occupancy__content']");

    //methods
    public void aceptarCookie() {
        if (isDisplayed(BtnaceptarCookiesLocator) == true) {
            WebElement esperaCookie = findElement(BtnaceptarCookiesLocator);
            WebDriverWait esperar = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
            esperar.until(ExpectedConditions.elementToBeClickable(esperaCookie));
            click(BtnaceptarCookiesLocator);
        }
    }

    public void seleccionarVerMas() {
        esperaPorClick(verMasLocator,15);
        click(verMasLocator);
    }

    public void seleccionarCrucero() {
        esperaPorClick(crucerosLocator,15);
        click(crucerosLocator);
    }

    public String textoUrlTitulo() {
        return getUrlTitle();
    }

    public void navegarOfertas() throws InterruptedException {
        esperaPorClick(navegarOfertasLocator, 15);
        for (int i = 0; i < 3; i++) {
            esperaMillis(200);
            click(navegarOfertasLocator);
        }
    }

    public void verTodasLasOfertas() {
        esperaPorClick(verTodasLasOfertasLocator, 15);
        click(verTodasLasOfertasLocator);
    }

    public void buscarCrucero() {
        esperaPorClick(buscarLocator, 15);
        click(buscarLocator);
    }

    public void scrollPage(int horizontal, int vertical) {
        scroll(horizontal, vertical);
    }

    public void seleccionarDestinoCrucero(String cruceroDestino) {
        esperaPorClick(destinoCruceroLocator, 15);
        click(destinoCruceroLocator);
        clear(cualquierDestinoBusquedaLocator);
        write(cruceroDestino, cualquierDestinoBusquedaLocator);
        click(By.xpath("//li[@aria-label='" + cruceroDestino + "']"));
    }

    public void seleccionPeriodo(int anio, String mes) {
        esperaPorClick(cualquierPeriodoLocator, 15);
        click(cualquierPeriodoLocator);
        if (anio == 0) {
            click(By.xpath("//span[normalize-space()='Cualquier periodo']"));
        }
        if (anio == 2022) {
            click(By.xpath("//span[normalize-space()='" + mes + "'][2]"));
        }
        if (anio == 2023) {
            click(By.xpath("//button[contains(@class,'p-datepicker-next')]"));
            click(By.xpath("//span[normalize-space()='" + mes + "'][2]"));
        }
    }

    public void cualquierDuracion(String duracionViaje) {
        esperaPorClick(cualquierDuracionLocator, 15);
        click(cualquierDuracionLocator);
        click(By.xpath("//li[@aria-label='" + duracionViaje + "']"));
    }

    public void cualquierCompania(String nombreCompania) {
        esperaPorLocator(cualquierCompaniaLocator, 15);
        click(cualquierCompaniaLocator);
        click(companiaTextBoxLocator);
        clear(companiaTextBoxLocator);
        write(nombreCompania, companiaTextBoxLocator);
        click(By.xpath("//li[@aria-label='" + nombreCompania + "']"));

    }


    public void cualquierPuerto(String nombrePuerto)  {
        esperaPorClick(cualquierPuertoLocator, 40);
        click(cualquierPuertoLocator);
        esperaPorLocator(By.xpath("//div[@class='ng-trigger ng-trigger-overlayAnimation ng-tns-c52-6 p-multiselect-panel p-component ng-star-inserted']"),30);
        if (isDisplayed(puertoTextBoxLocator) == true) {
            click(puertoTextBoxLocator);
            clear(puertoTextBoxLocator);
            write(nombrePuerto, puertoTextBoxLocator);
            click(By.xpath("//li[@aria-label='" + nombrePuerto + "']"));
        }
    }


    public void agregarAdultos(int nAdultos) {
        if (nAdultos > 1) {
            if (isDisplayed(cuadroDeOcupantes) == false) {
                click(pasajerosLocator);
            }
            esperaPorLocator(cuadroDeOcupantes, 15);
            for (int i = 2; i < nAdultos; i++) {

                click(agregarAdultoLocator);
            }
        }
    }

    public void agregarJunior(int nJunior) {
        if (nJunior > 1) {
            if (isDisplayed(cuadroDeOcupantes) == false) {
                click(pasajerosLocator);
            }
            esperaPorLocator(cuadroDeOcupantes, 15);
            for (int i = 0; i < nJunior; i++) {
                click(agregarJuniorLocator);
            }
        }
    }

    public void agregarNinos(int nNinos) {
        if (nNinos > 1) {
            if (isDisplayed(cuadroDeOcupantes) == false) {
                click(pasajerosLocator);
            }
            esperaPorLocator(cuadroDeOcupantes, 15);
            for (int i = 0; i < nNinos; i++) {
                click(agregarNinoLocator);
            }
        }
    }

    public void agregarBebes(int nBebes) {
        if (nBebes > 1) {
            if (isDisplayed(cuadroDeOcupantes) == false) {
                click(pasajerosLocator);
            }
            esperaPorLocator(cuadroDeOcupantes, 15);
            for (int i = 0; i < nBebes; i++) {
                click(agregarBebeLocator);
            }
        }
    }

    public void navegarAlHome() {
        navigateTo(BASE_URL_AUT);
    }

    public void seleccionarPuertoBarce() {
        esperaPorClick(barcelocator, 15);
        click(barcelocator);
    }

    public void bscCruceros() {
        esperaPorClick(mscCrucerosLocator, 50);
        click(mscCrucerosLocator);
        esperaPorClick(verMasCruceroMscLocator, 50);
        click(verMasCruceroMscLocator);
        esperaPorClick(crucerosPorElMediterraneoLocator, 50);
        click(crucerosPorElMediterraneoLocator);
        esperaPorClick(crucerosDevolverLocator, 50);
        click(crucerosDevolverLocator);

    }

    public void costaCruceros() throws InterruptedException {
        esperaPorClick(costaCrucerosLocator,10);
        click(costaCrucerosLocator);
        esperaPorClick(verMasCruceroMscLocator,15);
        click(verMasCruceroMscLocator);
        esperaPorClick(cruceroPorIslasGriegas,15);
        click(cruceroPorIslasGriegas);
        esperaPorClick(reiniciarBusquedaLocator,15);
        click(reiniciarBusquedaLocator);
        esperaPorClick(buscarLocator,15);
        click(buscarLocator);
    }

    public void filtrarRating() throws InterruptedException {
        esperaPorLocator(recomendadosLocator, 15);
        click(recomendadosLocator);
        esperaPorLocator(ratingLocator, 15);
        click(ratingLocator);
        Thread.sleep(2000);
        esperaPorLocator(cargarMasResultado, 15);
        click(cargarMasResultado);
        //Thread.sleep(2000);
        esperaPorLocator(volverArribaLocator, 15);
        click(volverArribaLocator);
        Thread.sleep(2000);
    }

    public void ingresarOpcion() {
        esperaPorClick(selectorMoverLocator, 50);
        click(selectorMoverLocator);


    }

    public void carnivalHorizon() throws InterruptedException {

        cambiarPestanha();
        esperaPorClick(descubreElItinirerioLocator, 50);
        click(descubreElItinirerioLocator);
        //Thread.sleep(1500);
    }


    public void seleccionarCasillero() {
        esperaPorLocator(casillerolocator, 15);
        click(casillerolocator);
    }

    public void botonesDesplegables() {
        if (isDisplayed(dia1) == true) {
            esperaPorClick(dia1, 30);
            click(dia1);
            click(dia1);
        }
        if (isDisplayed(dia1) == true) {
            esperaPorClick(dia1, 30);
            click(dia1);
            click(dia1);
        }
        if (isDisplayed(dia4) == true) {
            esperaPorClick(dia4, 30);
            click(dia4);
            click(dia4);
        }
        if (isDisplayed(dia5) == true) {
            esperaPorClick(dia5, 30);
            click(dia5);
            click(dia5);
        }
        if (isDisplayed(dia6) == true) {
            esperaPorClick(dia6, 30);
            click(dia6);
            click(dia6);
        }
        if (isDisplayed(dia7) == true) {
            esperaPorClick(dia7, 30);
            click(dia7);
            click(dia7);
        }
        if (isDisplayed(dia9) == true) {
            esperaPorClick(dia9, 30);
            click(dia9);
            click(dia9);
        }
    }

    public void seleccionarCompanhia() {
        esperaPorClick(companhiaLocator, 50);
        click(companhiaLocator);

    }

    public void seleccionarPresupuesto() {
        esperaPorClick(solicitarPresupuesto, 50);
        click(solicitarPresupuesto);

    }


}
