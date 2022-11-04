package aut.funcional.rumbo.testcases;

import aut.funcional.rumbo.pages.RumboHomePageHotel;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HotelTest extends SeleniumTestBase   {

    RumboHomePageHotel rumboHomePageHotel;

    @Test
    void funcionalidadPagoFraccionadoBH001() {
        rumboHomePageHotel = new RumboHomePageHotel(DriverFactory.getDriver());
        rumboHomePageHotel.navegarAlHome();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.selectorHotel();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.selecionarFraccionado();
        rumboHomePageHotel.echaleUnVistazo();
        Assertions.assertEquals("Pago fraccionado | Rumbo", rumboHomePageHotel.textoUrlTitulo());
        rumboHomePageHotel.selectorHotel();
        Assertions.assertEquals("Hoteles | Ofertas de Hoteles baratos | Rumbo", rumboHomePageHotel.textoUrlTitulo());

    }

    @Test
    void encontrarAlojamientoDisponiblesBH002() throws InterruptedException {
        rumboHomePageHotel = new RumboHomePageHotel(DriverFactory.getDriver());
        rumboHomePageHotel.navegarAlHome();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.selectorHotel();
        rumboHomePageHotel.aceptarCookie();
        Thread.sleep(3000);
        rumboHomePageHotel.buscarAlojamientoEn("Buenos Aires");

    }

    @Test
    void registrarFechaDeEntradaBH003() throws InterruptedException {
            rumboHomePageHotel = new RumboHomePageHotel(DriverFactory.getDriver());
            rumboHomePageHotel.navegarAlHome();
            Thread.sleep(2000);
            rumboHomePageHotel.aceptarCookie();
            rumboHomePageHotel.selectorHotel();
            rumboHomePageHotel.seleccionarhotelSpa();
            Thread.sleep(4000);
        cambiarPag();
            rumboHomePageHotel.seleccionarhotelMiro();
            rumboHomePageHotel.seleccionarTipoHabitacion();
        rumboHomePageHotel.seleccionarSoloHabitacionDouble();
    }



    @Test
    void buscarHotelBH004() {
        rumboHomePageHotel = new RumboHomePageHotel(DriverFactory.getDriver());


    }

    @Test
    void verMejoresOfertasEnHotelesBH005() {
    }

    @Test
    void reservarHotelesQueAdmitenPerrosBH006() {
    }


}