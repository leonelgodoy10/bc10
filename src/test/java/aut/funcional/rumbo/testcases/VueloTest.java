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
    void compraDeVueloTopMasBaratoBV002() throws InterruptedException {

        rumboHomePageHomeVuelo = new RumboHomePageVuelo(DriverFactory.getDriver());
        rumboHomePageHomeVuelo.navegarYAceptarCookies();
        rumboHomePageHomeVuelo.scrollear();
        Thread.sleep(3000);
        rumboHomePageHomeVuelo.clickearTopDestinosDeVuelos();
        rumboHomePageHomeVuelo.clickearVueloABruselas();
        rumboHomePageHomeVuelo.clickearOrigenBox();
        rumboHomePageHomeVuelo.escribirChile();
        rumboHomePageHomeVuelo.clickearArturoBenitez();



    }
   /* @Test
    void comprarDeVueloTopMasBaratoBV003(){}
    @Test
    void viajeEnPrimeraClaseBV004(){}
    @Test
    void funcionalidadMultidestinoBV005(){}
    @Test
    void cantidadDePasajeroMasBebeBV006(){}*/
}
