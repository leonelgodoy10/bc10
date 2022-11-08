package aut.funcional.equipo1.rumbo.testcases;

import aut.funcional.equipo1.rumbo.pages.RumboHomePageHotel;
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
        Assertions.assertEquals("Hoteles | Ofertas de Hoteles baratos | Rumbo",rumboHomePageHotel.textoUrlTitulo());
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
        Assertions.assertEquals("Hoteles | Ofertas de Hoteles baratos | Rumbo",rumboHomePageHotel.textoUrlTitulo());
        rumboHomePageHotel.buscarAlojamientoEn("Buenos Aires");
        rumboHomePageHotel.buscaridaYVuelta(10, 11, 2022, 13, 11, 2022);
        rumboHomePageHotel.agregarNino("5 años");
        rumboHomePageHotel.buscarHotel();
        rumboHomePageHotel.filtroEstrellas(4);
        Assertions.assertEquals("Inspírate para tus viajes en 2022/2023 | lastminute.com",rumboHomePageHotel.textoUrlTitulo());
    }

    @Test
    void registrarFechaDeEntradaBH003()  {
        rumboHomePageHotel = new RumboHomePageHotel(DriverFactory.getDriver());
        rumboHomePageHotel.navegarAlHome();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.selectorHotel();
        rumboHomePageHotel.aceptarCookie();
        Assertions.assertEquals("Hoteles | Ofertas de Hoteles baratos | Rumbo",rumboHomePageHotel.textoUrlTitulo());
        rumboHomePageHotel.seleccionarhotelSpa();
        Assertions.assertEquals("Hoteles | Ofertas de Hoteles baratos | Rumbo",rumboHomePageHotel.textoUrlTitulo());
        rumboHomePageHotel.seleccionarhotelMiro();
        Assertions.assertEquals("Hoteles con spa | Rumbo",rumboHomePageHotel.textoUrlTitulo());
        rumboHomePageHotel.elegirTipoHabitacion();
        Assertions.assertEquals("Hotel Miro - Bilbao - Rumbo",rumboHomePageHotel.textoUrlTitulo());
        rumboHomePageHotel.seleccionarSoloHabitacionDouble();
        Assertions.assertEquals("Hotel Miro - Bilbao - Rumbo",rumboHomePageHotel.textoUrlTitulo());
    }


    @Test
    void buscarHotelBH004() throws InterruptedException { // algo cambio de ayer a hoy
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
        Assertions.assertEquals("Inspírate para tus viajes en 2022/2023 | lastminute.com",rumboHomePageHotel.textoUrlTitulo());
        rumboHomePageHotel.filtroAlojamiento();
        rumboHomePageHotel.filtroCancelacionGratuita();
        rumboHomePageHotel.filtrowifiGratis();
        rumboHomePageHotel.esperaMillis(2000);
        rumboHomePageHotel.seleccionarPais();
        rumboHomePageHotel.limpiarFiltro();
        rumboHomePageHotel.esperaMillis(2000);
        rumboHomePageHotel.seleccionarHotel();
        rumboHomePageHotel.valoraciones();
        Assertions.assertEquals("King Evelthon Beach Hotel & Resort - Khlorakas - Rumbo",rumboHomePageHotel.textoUrlTitulo());

    }
    @Test
    void verMejoresOfertasEnHotelesBH005()  {
        rumboHomePageHotel = new RumboHomePageHotel(DriverFactory.getDriver());
        rumboHomePageHotel.navegarAlHome();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.selectorHotel();
        rumboHomePageHotel.aceptarCookie();
        Assertions.assertEquals("Hoteles | Ofertas de Hoteles baratos | Rumbo",rumboHomePageHotel.textoUrlTitulo());
        rumboHomePageHotel.seleccionHotelesRurales();
        rumboHomePageHotel.seleccionHotelFincaLosLlanos();
        Assertions.assertEquals("Hoteles Rústicos | Rumbo",rumboHomePageHotel.textoUrlTitulo());
        rumboHomePageHotel.elegirTipoHabitacion();
        Assertions.assertEquals("Finca Los Llanos - Capileira - Rumbo",rumboHomePageHotel.textoUrlTitulo());
        rumboHomePageHotel.aplicarFiltrosHabitacion();
        rumboHomePageHotel.detallesHabitacion();
        Assertions.assertEquals("Finca Los Llanos - Capileira - Rumbo",rumboHomePageHotel.textoUrlTitulo());


    }


    @Test
    void reservarHotelesQueAdmitenPerrosBH006()  {
        rumboHomePageHotel = new RumboHomePageHotel(DriverFactory.getDriver());
        rumboHomePageHotel.navegarAlHome();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.selectorHotel();
        rumboHomePageHotel.aceptarCookie();
        Assertions.assertEquals("Hoteles | Ofertas de Hoteles baratos | Rumbo",rumboHomePageHotel.textoUrlTitulo());
        rumboHomePageHotel.scroll(0,1700);
        rumboHomePageHotel.navegarPerros();
        Assertions.assertEquals("Hotel Civis Jaime I. - Castellón de la Plana - Rumbo",rumboHomePageHotel.textoUrlTitulo());
        rumboHomePageHotel.quienReserva("Leonel","Godoy","leonelgodoy@gmail.com","56","987654321");
        rumboHomePageHotel.husped("Jordan","Jimenez");
        Assertions.assertEquals("Pago seguro - Rumbo",rumboHomePageHotel.textoUrlTitulo());

    }
}