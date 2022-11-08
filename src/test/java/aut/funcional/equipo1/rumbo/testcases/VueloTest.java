package aut.funcional.equipo1.rumbo.testcases;

import aut.funcional.equipo1.rumbo.pages.RumboHomePageVuelo;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VueloTest extends SeleniumTestBase {

    RumboHomePageVuelo rumboHomePageHomeVuelo;

    @Test
    void buscaVueloVacioBV001() {
        rumboHomePageHomeVuelo = new RumboHomePageVuelo(DriverFactory.getDriver());
        rumboHomePageHomeVuelo.navegarAlHome();
        rumboHomePageHomeVuelo.aceptarCookie();
        rumboHomePageHomeVuelo.selectorVuelos();
        rumboHomePageHomeVuelo.aceptarCookie();
        rumboHomePageHomeVuelo.buscarVuelo();
        Assertions.assertEquals("Introduce ciudad o aeropuerto de destino", rumboHomePageHomeVuelo.mensajesDeErrores());
        Assertions.assertEquals("Vuelos baratos | Buscador de vuelos | Rumbo", rumboHomePageHomeVuelo.textoUrlTitulo());
    }

    @Test
    void compraDeVueloTopMasBaratoBV002() throws InterruptedException {

        rumboHomePageHomeVuelo = new RumboHomePageVuelo(DriverFactory.getDriver());
        rumboHomePageHomeVuelo.navegarAlHome();
        rumboHomePageHomeVuelo.aceptarCookie();
        rumboHomePageHomeVuelo.selectorVuelos();
        rumboHomePageHomeVuelo.aceptarCookie();
        Assertions.assertEquals("Vuelos baratos | Buscador de vuelos | Rumbo",rumboHomePageHomeVuelo.textoUrlTitulo());
        rumboHomePageHomeVuelo.scroll(0, 4000);
        rumboHomePageHomeVuelo.esperaMillis(2000);
        rumboHomePageHomeVuelo.clickTopCiudades();
        rumboHomePageHomeVuelo.buscarCiudadTop("Bruselas");
        rumboHomePageHomeVuelo.buscarIdaViajeTop("chile");
        rumboHomePageHomeVuelo.clickearAropuerto();
        rumboHomePageHomeVuelo.agregarPersonas(4, 3, 2);
        rumboHomePageHomeVuelo.modificarFechaIda(20, 3, 2023);
        rumboHomePageHomeVuelo.buscar();
        rumboHomePageHomeVuelo.seleccionarMasBarato();
        rumboHomePageHomeVuelo.esperaMillis(5000);
        rumboHomePageHomeVuelo.bajarPrecio();
        rumboHomePageHomeVuelo.esperaMillis(3000);
        rumboHomePageHomeVuelo.bajarEscalaTop();
        rumboHomePageHomeVuelo.esperaMillis(3000);
        rumboHomePageHomeVuelo.limpiarFiltros();
        Assertions.assertEquals("Rumbo vuelos baratos Santiago - Bruselas",rumboHomePageHomeVuelo.textoUrlTitulo());


    }

    @Test
    void busquedaDeVueloFamiliarBV003() {//Funcionando OK, probar y dar visto bueno
        rumboHomePageHomeVuelo = new RumboHomePageVuelo(DriverFactory.getDriver());
        rumboHomePageHomeVuelo.navegarAlHome();
        rumboHomePageHomeVuelo.aceptarCookie();
        rumboHomePageHomeVuelo.selectorVuelos();
        rumboHomePageHomeVuelo.aceptarCookie();
        Assertions.assertEquals("Vuelos baratos | Buscador de vuelos | Rumbo",rumboHomePageHomeVuelo.textoUrlTitulo());
        rumboHomePageHomeVuelo.origenDestinoSeleccion("arturo merino", "mendoza");
        rumboHomePageHomeVuelo.buscaridaYVuelta(7, 11, 2022, 30, 11, 2022);
        rumboHomePageHomeVuelo.agregarAdultos(1);
        rumboHomePageHomeVuelo.agregarNino("10 años");
        rumboHomePageHomeVuelo.agregarAdultos(1);
        rumboHomePageHomeVuelo.agregarNino("Bebé, 0-11 meses");
        rumboHomePageHomeVuelo.selectorDeClase("Turista");
        rumboHomePageHomeVuelo.buscarVuelo();
        rumboHomePageHomeVuelo.escalasIda("ninguna");
        rumboHomePageHomeVuelo.escalasVuelta("2 o mas");
        rumboHomePageHomeVuelo.mejorBaratoRaido("Más barato");
        Assertions.assertEquals("Rumbo vuelos baratos Santiago - Mendoza",rumboHomePageHomeVuelo.textoUrlTitulo());
    }

    @Test
    void viajeEnPrimeraClaseBV004() {//Funcionando OK, probar y dar visto bueno--> Quedó Joshaaa Leo, Ya tu sabes pa':)
        rumboHomePageHomeVuelo = new RumboHomePageVuelo(DriverFactory.getDriver());
        rumboHomePageHomeVuelo.navegarAlHome();
        rumboHomePageHomeVuelo.aceptarCookie();
        rumboHomePageHomeVuelo.selectorVuelos();
        rumboHomePageHomeVuelo.aceptarCookie();
        Assertions.assertEquals("Vuelos baratos | Buscador de vuelos | Rumbo",rumboHomePageHomeVuelo.textoUrlTitulo());
        rumboHomePageHomeVuelo.origenDestinoSeleccion("cancun", "egipto");
        rumboHomePageHomeVuelo.buscaridaYVuelta(21, 11, 2022, 27, 11, 2022);
        rumboHomePageHomeVuelo.agregarAdultos(3);
        rumboHomePageHomeVuelo.selectorDeClase("Primera");
        rumboHomePageHomeVuelo.buscarVuelo();
    }

    @Test
    void funcionalidadMultidestinoBV005() throws InterruptedException {
        rumboHomePageHomeVuelo = new RumboHomePageVuelo(DriverFactory.getDriver());
        rumboHomePageHomeVuelo.navegarAlHome();
        rumboHomePageHomeVuelo.aceptarCookie();
        rumboHomePageHomeVuelo.selectorVuelos();
        rumboHomePageHomeVuelo.aceptarCookie();
        Assertions.assertEquals("Vuelos baratos | Buscador de vuelos | Rumbo",rumboHomePageHomeVuelo.textoUrlTitulo());
        rumboHomePageHomeVuelo.seleccionVuelaEuropa();
        rumboHomePageHomeVuelo.seleccionMultidestino();
        rumboHomePageHomeVuelo.borrarTodoMultiDestino();
        rumboHomePageHomeVuelo.seleccionMultiOrigenDestino("Santiago de Chile", "Miami", "Buenos Aires", "Barcelona");
        rumboHomePageHomeVuelo.buscarMultivuelo();
        rumboHomePageHomeVuelo.cerrarMultiDestinoCookie();
        rumboHomePageHomeVuelo.verFiltro();
        rumboHomePageHomeVuelo.deseleccionarTransporte("Autobús");
        rumboHomePageHomeVuelo.deseleccionarTransporte("Tren");
        rumboHomePageHomeVuelo.verFiltro();

    }

    @Test
    void cantidadDePasajerosMasBebeBV006()  {
        rumboHomePageHomeVuelo = new RumboHomePageVuelo(DriverFactory.getDriver());
        rumboHomePageHomeVuelo.navegarAlHome();
        rumboHomePageHomeVuelo.aceptarCookie();
        rumboHomePageHomeVuelo.selectorVuelos();
        rumboHomePageHomeVuelo.aceptarCookie();
        Assertions.assertEquals("Vuelos baratos | Buscador de vuelos | Rumbo",rumboHomePageHomeVuelo.textoUrlTitulo());
        rumboHomePageHomeVuelo.seleccionarSoloIda();
        rumboHomePageHomeVuelo.agregarNino("Bebé, 0-11 meses");
        rumboHomePageHomeVuelo.agregarNino("Bebé, 0-11 meses");
        rumboHomePageHomeVuelo.seleccionarDestino("Buenos aires");
        Assertions.assertEquals("El número de bebés (edad 0-1) no puede ser superior al de adultos.",rumboHomePageHomeVuelo.errorMensajeNinho());
        rumboHomePageHomeVuelo.buscarVuelo();
        Assertions.assertEquals("Vuelos baratos | Buscador de vuelos | Rumbo",rumboHomePageHomeVuelo.textoUrlTitulo());
    }


}