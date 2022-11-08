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

public class RumboHomePageHotel extends SeleniumWrapper {

    public RumboHomePageHotel(WebDriver driver) {
        super(driver);
    }

    //locators
    By btnAceptarCookiesLocator = By.xpath("//button[@class='iubenda-cs-accept-btn iubenda-cs-btn-primary']");
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

    By tipoHabitacionLocator = By.xpath("document.querySelector(\".Button-sc-1bbve8d-0.bsSjVP.SubNavigation___StyledScrollToIdButton-sc-1sfp8me-7.jThHsW\")");

    By HabitacionDoubleLocator = By.xpath("(//span[normalize-space()='Solo habitación'])[1]");

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
    By valoracionBuenoLocator = By.xpath("//span[@class='ReviewsSummary__TrustYouLinkText-sc-by8rko-3 jxUPZX']");
    By excelenteLocator = By.xpath("//div[@class='sc-dPyBCJ kmZvLO filter-rating-label-excellent']");
    By muyBuenoLocator = By.xpath("//div[@class='sc-dPyBCJ kmZvLO filter-rating-label-very-good']");
    By buenoLocator = By.xpath("//div[@class='sc-dPyBCJ kmZvLO filter-rating-label-good']");
    By filtroRegimenLocator = By.xpath("//span[normalize-space()='Régimen']");
    By todoIncluidoLocator = By.xpath("//*[name()='path' and contains(@d,'M0.333496 ')]");
    By chipreLocator = By.xpath("//div[@class='sc-BeQoi gVBHRE openx-ui-card-content']");
    By limpiarTodosLocator = By.xpath("//button[normalize-space()='Limpiar todos']");
    By avanzarFotosLocator = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/img[1]");

    By verMasLocator = By.xpath("(//a[@class='sc-bZnhIo gcujSs show-more'][normalize-space()='Ver más'])[1]");
    By parejasLocator = By.xpath("/html/body/header/div/section[2]/div[10]/ul/li[2]");
    By familiasLocator = By.xpath("/html/body/header/div/section[2]/div[10]/ul/li[3]");
    By elegirTipoHabitacionLocator = By.xpath("//button[normalize-space()='Elegir tipo de habitación']");
    By aplicarFiltroSoloAlojamientoLocator = By.xpath("//button[normalize-space()='Solo alojamiento']");
    By aplicarFiltroDesayunoInLocator = By.xpath("//button[normalize-space()='Desayuno incluido']");
    By verDetallesHabitacionLocator = By.xpath("(//div[normalize-space()='Ver detalles'])[1]");
    By ocultarDetallesHabitacionLocator = By.xpath("(//div[normalize-space()='Ocultar detalles'])[1]");
    By iframeHotelLocalizador = By.xpath("(//iframe[@id='iFrameResizer0'])[1]");
    By punto1Locator = By.xpath("(//button[@type='button'])[14]");
    By punto2Locator = By.xpath("(//button[@type='button'])[15]");
    By punto3Locator = By.xpath("(//button[@type='button'])[16]");
    By punto4Locator = By.xpath("(//button[@type='button'])[17]");
    By elejirTipoHabitacion = By.xpath("//button[@class='Button-sc-1bbve8d-0 bsSjVP SubNavigation___StyledScrollToIdButton-sc-1sfp8me-7 jThHsW']");
    By hotelesQueAdmitenPerrosLocator = By.xpath("(//a[contains(@data-kind,'hub-anchor')])[60]");
    By hotelCivisJaimeILocator = By.xpath("//span[normalize-space()='Hotel Civis Jaime I']");
    By fotosHotelCivisJaimeLocator = By.xpath("//body/div[@id='__next']/div[@class='BrandedPageLayout___StyledDiv-sc-1x8t0fu-2 cTKbIy']/div[@class='Hero__HeroStyled-sc-1pqg2ch-8 mZMqZ']/div[@class='Hero__Gallery-sc-1pqg2ch-10 cEoXF']/div[@class='HeroGallery___StyledDiv3-sc-1k5pun7-8 ldFqfm']/div[1]");
    By navegarFotosCivisJaimeLocator = By.xpath("//div[@class='ImageGalleryModal___StyledDiv4-sc-1ayv6ho-11 ctrivU']//button[1]");
    By cierreFotosCivisJaemeLocator = By.xpath("//*[name()='path' and contains(@d,'M47.41406,')]");
    By verTodosLosServiciosHotelLocator = By.xpath("//span[normalize-space()='Ver todos los servicios']");
    By elegirTipoDeHabitacionLocator = By.xpath("//button[normalize-space()='Elegir tipo de habitación']");
    By soloAlojamientoLocator = By.xpath("//button[normalize-space()='Solo alojamiento']");
    By mejorPrecioHotelLocator = By.xpath("//span[normalize-space()='¡Mejor precio!']");
    By cancelacionDeHotelCovid19 = By.xpath("//label[@class='toggle-password-container']//span[@class='check']");
    By ingresoRegistroLocator = By.xpath("//div[contains(@class,'widget-wrapper widget-wrapper--contact')]");

    public void aceptarCookie() {
        if (isDisplayed(btnAceptarCookiesLocator) == true) {
            esperaPorClick(btnAceptarCookiesLocator,15);
            click(btnAceptarCookiesLocator);
        }
    }

    public void selectorHotel() {
        esperaPorClick(btnHotelLocator,15);
        click(btnHotelLocator);
    }

    public void selecionarFraccionado() {
        esperaPorClick(pagoFraccionadoLocator,15);
        click(pagoFraccionadoLocator);
    }

    public void echaleUnVistazo() {
        esperaPorClick(btnEchaleUnVistazoLocator,15);
        click(btnEchaleUnVistazoLocator);
    }

    public String textoUrlTitulo() {
        return getUrlTitle();
    }

    public void buscarHotel()  {
        esperaPorClick(btnBuscar,20);
        click(btnBuscar);
    }

    public void navegarAlHome() {
        navigateTo(BASE_URL_AUT);
    }

    public void buscarAlojamientoEn(String dato) {
        esperaPorClick(buscarAlojamientoEnLocator,15);
        click(buscarAlojamientoEnLocator);
        write(dato, buscarAlojamientoEnLocator);
        esperaPorClick(primeraOpcionDespAlojamientolegadaLocator,15);
        click(primeraOpcionDespAlojamientolegadaLocator);
    }


    public void seleccionarhotelSpa() {
        cambiarPestanha();
        esperaPorClick(seleccionarSpaLocator,20);
        click(seleccionarSpaLocator);
    }

    public void seleccionarhotelMiro() {
        cambiarPestanha();
        esperaPorClick(seleccionarMiroLocator,20);
        click(seleccionarMiroLocator);

    }


  /*  public void seleccionarTipoHabitacion() {
        cambiarPestanha();
        click(tipoHabitacionLocator);
    }*/

    public void seleccionarSoloHabitacionDouble()  {
        esperaPorLocator(HabitacionDoubleLocator,20);
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
        esperaPorClick(seleccionNinoLocator,15);
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
        esperaPorClick(seleccionHotelesRuralesLocator,20);
        click(seleccionHotelesRuralesLocator);
    }

    public void seleccionHotelFincaLosLlanos() {
        cambiarPestanha();
        esperaPorClick(seleccionHotelFincaLosLlanosLocator,20);
        click(seleccionHotelFincaLosLlanosLocator);

    }

    public void elegirTipoHabitacion() {
        cambiarPestanha();
        esperaPorClick(elegirTipoHabitacionLocator,20);
        click(elegirTipoHabitacionLocator);
    }

    public void aplicarFiltrosHabitacion() {
        esperaPorClick(aplicarFiltroSoloAlojamientoLocator,20);
        click(aplicarFiltroSoloAlojamientoLocator);
        esperaPorClick(aplicarFiltroDesayunoInLocator,20);
        click(aplicarFiltroDesayunoInLocator);
    }

    public void detallesHabitacion() {
        esperaPorClick(verDetallesHabitacionLocator,20);
        click(verDetallesHabitacionLocator);
        esperaPorClick(ocultarDetallesHabitacionLocator,20);
        click(ocultarDetallesHabitacionLocator);
    }

    public void filtrowifiGratis() {
        esperaPorClick(filtrowifiGratisLocator,20);
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
        esperaPorClick(chipreLocator,40);
        click(chipreLocator);
    }

    public void limpiarFiltro() throws InterruptedException {
        esperaPorClick(limpiarTodosLocator,20);
        click(limpiarTodosLocator);

    }

    public void seleccionarHotel() throws InterruptedException {

        hover(avanzarFotosLocator);
        esperaMillis(1000);

        click(avanzarFotosLocator);
        hover(avanzarFotosLocator);
        esperaMillis(1000);

        click(avanzarFotosLocator);
        hover(avanzarFotosLocator);
        esperaMillis(1000);

        click(avanzarFotosLocator);
        hover(avanzarFotosLocator);
        esperaMillis(1000);

        click(avanzarFotosLocator);
        esperaMillis(1000);

        click(verMasLocator);

    }

    public void valoraciones() throws InterruptedException {
        cambiarPestanha();
        esperaMillis(5000);
        click(valoracionBuenoLocator);
        cambiarseIframe(iframeHotelLocalizador);
        esperaMillis(15000);
        click(parejasLocator);
        click(familiasLocator);
        esperaMillis(1500);
        volverOriginal();
        esperaMillis(2000);
        click(punto1Locator);
        esperaMillis(2000);
        click(punto2Locator);
    }

    public void navegarPerros()  {
        esperaPorClick(hotelesQueAdmitenPerrosLocator, 25);
        click(hotelesQueAdmitenPerrosLocator);
        cambiarPestanha();
        scroll(0, 500);
        esperaPorClick(hotelCivisJaimeILocator, 25);
        click(hotelCivisJaimeILocator);
        cambiarPestanha();
        esperaPorClick(fotosHotelCivisJaimeLocator,25);
        click(fotosHotelCivisJaimeLocator);
        navegarFotos(39);
        click(cierreFotosCivisJaemeLocator);
        esperaPorClick(verTodosLosServiciosHotelLocator,25);
        click(verTodosLosServiciosHotelLocator);
        despliegueDeServiciosHotel("Internet");
        despliegueDeServiciosHotel("Parking");
        despliegueDeServiciosHotel("Comida & bebida");
        despliegueDeServiciosHotel("Servicios de limpieza ");
        despliegueDeServiciosHotel("General ");
        esperaPorClick(elegirTipoDeHabitacionLocator, 30);
        click(elegirTipoDeHabitacionLocator);
        esperaPorClick(soloAlojamientoLocator, 30);
        click(soloAlojamientoLocator);
        esperaPorClick(mejorPrecioHotelLocator, 30);
        click(mejorPrecioHotelLocator);
    }

    public void navegarFotos(int nFotos) {
        for (int i = 0; i < nFotos; i++) {
            click(navegarFotosCivisJaimeLocator);
            esperaImplicitaMillis(400);
        }
    }

    public void despliegueDeServiciosHotel(String servicio)  {

        if (servicio == "Internet") {
            click(By.xpath("(//div[contains(text(),'" + servicio + "')])[1]"));
            esperaPorLocator(By.xpath("//div[normalize-space()='WiFi gratis']"),5);
            click(By.xpath("(//div[contains(text(),'" + servicio + "')])[1]"));
        }
        if (servicio == "Parking") {
            click(By.xpath("(//div[contains(text(),'" + servicio + "')])[1]"));
            esperaPorLocator(By.xpath("//div[normalize-space()='Parking privado']"),5);
            click(By.xpath("(//div[contains(text(),'" + servicio + "')])[1]"));
        }
        if (servicio == "Comida & bebida") {
            click(By.xpath("(//div[contains(text(),'" + servicio + "')])[1]"));
            esperaPorLocator(By.xpath("//div[normalize-space()='Snack-bar']"),5);
            click(By.xpath("(//div[contains(text(),'" + servicio + "')])[1]"));
        }
        if (servicio == "Servicios de limpieza ") {
            click(By.xpath("(//div[contains(text(),'" + servicio + "')])[1]"));
            esperaPorLocator(By.xpath("//div[normalize-space()='Servicio de planchado']"),5);
            click(By.xpath("(//div[contains(text(),'" + servicio + "')])[1]"));
        }
        if (servicio == "General ") {
            click(By.xpath("(//div[contains(text(),'" + servicio + "')])[1]"));
            esperaPorLocator(By.xpath("//div[normalize-space()='Prohibido fumar en todo el alojamiento']"),5);
            click(By.xpath("(//div[contains(text(),'" + servicio + "')])[1]"));
        }
    }

    public void quienReserva(String nombre, String apellido, String mail, String codePais, String nTelefono)  {
        esperaPorLocator(ingresoRegistroLocator, 30);
        write(nombre, By.xpath("//input[@name='name']"));
        write(apellido, By.xpath("//input[@name='surname']"));
        write(mail, By.xpath("//input[@id='contact-email']"));
        click(By.xpath("(//div[@class='arrow down'])[1]"));
        click(By.xpath("//div[@class='selected-dial-code']"));
        click(By.xpath("//li[@data-dial-code='" + codePais + "']"));
        write(nTelefono, By.xpath("//input[@name='phone']"));
    }

    public void husped(String nombre, String apellido) {
        click(By.xpath("//span[contains(text(),'Estoy reservando para otra persona.')]"));
        write(nombre, By.xpath("//input[@name='groups.1.travellers.1.name']"));
        write(apellido, By.xpath("//input[@name='groups.1.travellers.1.surname']"));
        scroll(0, 900);

    }


}

