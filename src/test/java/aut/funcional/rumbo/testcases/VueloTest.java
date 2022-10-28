package aut.funcional.rumbo.testcases;

import aut.funcional.rumbo.pages.RumboHomePageVuelo;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VueloTest extends SeleniumTestBase {

    RumboHomePageVuelo rumboHomePageHomeVuelo;

    @Test
    void buscaVueloVacioBV001(){
        rumboHomePageHomeVuelo = new RumboHomePageVuelo(DriverFactory.getDriver());
        rumboHomePageHomeVuelo.navegarAlHome();
        rumboHomePageHomeVuelo.aceptarCookie();
        rumboHomePageHomeVuelo.selectorVuelos();
        rumboHomePageHomeVuelo.aceptarCookie();
        rumboHomePageHomeVuelo.buscarVuelo();
        Assertions.assertEquals("Introduce ciudad o aeropuerto de destino",rumboHomePageHomeVuelo.mensajesDeErrores());
        Assertions.assertEquals("Vuelos baratos | Buscador de vuelos | Rumbo",rumboHomePageHomeVuelo.textoUrlTitulo());

    }
    @Test
    void compraDeVueloTopMasBaratoBV002(){
    }
    @Test
    void comprarDeVueloTopMasBaratoBV003(){
        rumboHomePageHomeVuelo = new RumboHomePageVuelo(DriverFactory.getDriver());
        rumboHomePageHomeVuelo.navegarAlHome();
        rumboHomePageHomeVuelo.aceptarCookie();
        rumboHomePageHomeVuelo.selectorVuelos();
        rumboHomePageHomeVuelo.aceptarCookie();
    }
    @Test
    void viajeEnPrimeraClaseBV004() throws InterruptedException {
        rumboHomePageHomeVuelo = new RumboHomePageVuelo(DriverFactory.getDriver());
        rumboHomePageHomeVuelo.navegarAlHome();
        rumboHomePageHomeVuelo.aceptarCookie();
        rumboHomePageHomeVuelo.selectorVuelos();
        rumboHomePageHomeVuelo.aceptarCookie();
        Thread.sleep(2000);
        rumboHomePageHomeVuelo.origenDestinoSeleccion("la paz","mendoza");
        //rumboHomePageHomeVuelo.agregarAdultos(3);
        rumboHomePageHomeVuelo.agregarNino("2 años");
        rumboHomePageHomeVuelo.selectorDeClase("Primera");
        Thread.sleep(3000);

    }
    @Test
    void funcionalidadMultidestinoBV005(){}
    @Test
    void cantidadDePasajeroMasBebeBV006(){}
}
