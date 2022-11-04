package aut.funcional.rumbo.testcases;

import aut.funcional.rumbo.pages.RumboHomePageHotel;
import aut.funcional.rumbo.pages.RumboHomePageVuelo;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelTest extends SeleniumTestBase {

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
    void registrarFechaDeEntradaBH003(){
    }

    @Test
    void buscarHotelBH004() {
        rumboHomePageHotel = new RumboHomePageHotel(DriverFactory.getDriver());


    }

    @Test
    void verMejoresOfertasEnHotelesBH005() throws InterruptedException {
        rumboHomePageHotel = new RumboHomePageHotel(DriverFactory.getDriver());
        rumboHomePageHotel.navegarAlHome();
        Thread.sleep(2000);
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.selectorHotel();
        rumboHomePageHotel.seleccionHotelesRurales();
        Thread.sleep(4000);
        cambiarPag();
        rumboHomePageHotel.seleccionHotelFincaLosLlanos();
        //Thread.sleep(4000);
        //rumboHomePageHotel.elegirTipoHabitacion();
        //Thread.sleep(2000);
        //rumboHomePageHotel.aplicarFiltrosHabitacion();
        //Thread.sleep(2000);
        //rumboHomePageHotel.detallesHabitacion();
    }


    @Test
    void reservarHotelesQueAdmitenPerrosBH006() {
    }
}
