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
    void funcionalidadPagoFraccionadoBH001() {//funcionando
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
    void encontrarAlojamientoDisponiblesBH002()  {//ok funcionando,
        rumboHomePageHotel = new RumboHomePageHotel(DriverFactory.getDriver());
        rumboHomePageHotel.navegarAlHome();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.selectorHotel();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.buscarAlojamientoEn("Buenos Aires");
        rumboHomePageHotel.buscaridaYVuelta(10,11,2022,13,11,2022);
        rumboHomePageHotel.agregarNino("5 años");
        rumboHomePageHotel.buscarHotel();
        rumboHomePageHotel.filtroEstrellas(4);
    }

    @Test
    void registrarFechaDeEntradaBH003() {
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
