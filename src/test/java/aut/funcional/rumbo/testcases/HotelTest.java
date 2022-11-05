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
    void encontrarAlojamientoDisponiblesBH002() {//ok funcionando,
        rumboHomePageHotel = new RumboHomePageHotel(DriverFactory.getDriver());
        rumboHomePageHotel.navegarAlHome();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.selectorHotel();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.buscarAlojamientoEn("Buenos Aires");
        rumboHomePageHotel.buscaridaYVuelta(10, 11, 2022, 13, 11, 2022);
        rumboHomePageHotel.agregarNino("5 años");
        rumboHomePageHotel.buscarHotel();
        rumboHomePageHotel.filtroEstrellas(4);
    }

    @Test
    void registrarFechaDeEntradaBH003() {
    }

    @Test
    void buscarHotelBH004() throws InterruptedException {
        rumboHomePageHotel = new RumboHomePageHotel(DriverFactory.getDriver());
        rumboHomePageHotel.navegarAlHome();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.selectorHotel();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.ningunDestino();
        rumboHomePageHotel.buscaridaYVuelta(20, 11, 2022, 2, 12, 2022);
        rumboHomePageHotel.agregarAdultos(3);
        rumboHomePageHotel.agregarNino("2 años");
        rumboHomePageHotel.buscarHotel();
        rumboHomePageHotel.filtroDinero();
        rumboHomePageHotel.filtroAlojamiento();
        rumboHomePageHotel.filtroCancelacionGratuita();
        rumboHomePageHotel.filtrowifiGratis();
        Thread.sleep(2000);
        rumboHomePageHotel.filtroValoracion();
        Thread.sleep(2000);
        rumboHomePageHotel.filtroRegimen();
        rumboHomePageHotel.seleccionarPais();
        rumboHomePageHotel.limpiarFiltro();
        rumboHomePageHotel.seleccionarHotel();
        rumboHomePageHotel.valoraciones();


    }

    @Test
    void verMejoresOfertasEnHotelesBH005() throws InterruptedException {

    }

    @Test
    void reservarHotelesQueAdmitenPerrosBH006() {
    }
}
