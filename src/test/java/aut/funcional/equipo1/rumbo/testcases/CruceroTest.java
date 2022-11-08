package aut.funcional.equipo1.rumbo.testcases;

import aut.funcional.equipo1.rumbo.pages.RumboHomePageCrucero;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CruceroTest extends SeleniumTestBase {
    RumboHomePageCrucero rumboHomePageCrucero;

    @Test
    void despliegueBarraDeslizanteBC001() throws InterruptedException {
        rumboHomePageCrucero = new RumboHomePageCrucero(DriverFactory.getDriver());
        rumboHomePageCrucero.navegarAlHome();
        rumboHomePageCrucero.aceptarCookie();
        rumboHomePageCrucero.seleccionarVerMas();
        rumboHomePageCrucero.seleccionarCrucero();
        Assertions.assertEquals("Cruceros. Ofertas de cruceros baratos. Tu crucero en Rumbo", rumboHomePageCrucero.textoUrlTitulo());
        rumboHomePageCrucero.scrollPage(0, 1200);
        rumboHomePageCrucero.navegarOfertas();
        rumboHomePageCrucero.verTodasLasOfertas();
        Assertions.assertEquals("Cruceros", rumboHomePageCrucero.textoUrlTitulo());
    }

    @Test
    void busquedaCruceroUnaPersonaAdultaBC002()   {
        rumboHomePageCrucero = new RumboHomePageCrucero(DriverFactory.getDriver());
        rumboHomePageCrucero.navegarAlHome();
        rumboHomePageCrucero.aceptarCookie();
        rumboHomePageCrucero.seleccionarVerMas();
        rumboHomePageCrucero.seleccionarCrucero();
        Assertions.assertEquals("Cruceros. Ofertas de cruceros baratos. Tu crucero en Rumbo",rumboHomePageCrucero.textoUrlTitulo());
        rumboHomePageCrucero.seleccionarDestinoCrucero("Mediterráneo");
        rumboHomePageCrucero.seleccionPeriodo(2023, "jun");
        rumboHomePageCrucero.cualquierDuracion("más de 9 días");
        rumboHomePageCrucero.cualquierCompania("Costa Cruceros");
        rumboHomePageCrucero.cualquierPuerto("Barcelona");
        rumboHomePageCrucero.agregarAdultos(1);
        rumboHomePageCrucero.buscarCrucero();
        Assertions.assertEquals("Cruceros",rumboHomePageCrucero.textoUrlTitulo());
    }

    @Test
    void reservaDeCruceroBC003()   {
        rumboHomePageCrucero = new RumboHomePageCrucero(DriverFactory.getDriver());
        rumboHomePageCrucero.navegarAlHome();
        rumboHomePageCrucero.aceptarCookie();
        rumboHomePageCrucero.seleccionarVerMas();
        rumboHomePageCrucero.seleccionarCrucero();
        Assertions.assertEquals("Cruceros. Ofertas de cruceros baratos. Tu crucero en Rumbo",rumboHomePageCrucero.textoUrlTitulo());
        rumboHomePageCrucero.seleccionarDestinoCrucero("Mediterráneo");
        rumboHomePageCrucero.seleccionPeriodo(2023, "feb");
        rumboHomePageCrucero.cualquierDuracion("De 6 a 9 días");
        rumboHomePageCrucero.cualquierCompania("Costa Cruceros");
        rumboHomePageCrucero.cualquierPuerto("Barcelona");
        rumboHomePageCrucero.agregarAdultos(1);
        rumboHomePageCrucero.buscarCrucero();
        Assertions.assertEquals("Cruceros",rumboHomePageCrucero.textoUrlTitulo());


    }

    @Test
    void reservaDeCruceroMaximaCantidadDePersonasDisponiblesBC004()   {//ok funcionando, probar
        rumboHomePageCrucero = new RumboHomePageCrucero(DriverFactory.getDriver());
        rumboHomePageCrucero.navegarAlHome();
        rumboHomePageCrucero.aceptarCookie();
        rumboHomePageCrucero.seleccionarVerMas();
        rumboHomePageCrucero.seleccionarCrucero();
        Assertions.assertEquals("Cruceros. Ofertas de cruceros baratos. Tu crucero en Rumbo",rumboHomePageCrucero.textoUrlTitulo());
        rumboHomePageCrucero.seleccionarDestinoCrucero("Mediterráneo");
        rumboHomePageCrucero.seleccionPeriodo(0, "0");//Significa cualquier destino
        rumboHomePageCrucero.cualquierDuracion("Cualquier duración");
        rumboHomePageCrucero.cualquierCompania("Celebrity Cruises");
        rumboHomePageCrucero.cualquierPuerto("Ravenna");
        rumboHomePageCrucero.agregarAdultos(15);
        rumboHomePageCrucero.agregarJunior(14);
        rumboHomePageCrucero.agregarNinos(14);
        rumboHomePageCrucero.agregarBebes(14);
        rumboHomePageCrucero.buscarCrucero();
        Assertions.assertEquals("Cruceros",rumboHomePageCrucero.textoUrlTitulo());
    }

    @Test
    void cotizacionDeUnCruceroParaUnaFamiliaBC005()   {//ok, funcionando, probar
        rumboHomePageCrucero = new RumboHomePageCrucero(DriverFactory.getDriver());
        rumboHomePageCrucero.navegarAlHome();
        rumboHomePageCrucero.aceptarCookie();
        rumboHomePageCrucero.seleccionarVerMas();
        rumboHomePageCrucero.seleccionarCrucero();
        Assertions.assertEquals("Cruceros. Ofertas de cruceros baratos. Tu crucero en Rumbo",rumboHomePageCrucero.textoUrlTitulo());
        rumboHomePageCrucero.seleccionarDestinoCrucero("Sudamérica");
        rumboHomePageCrucero.seleccionPeriodo(2023, "ene");
        rumboHomePageCrucero.cualquierDuracion("De 6 a 9 días");
        rumboHomePageCrucero.cualquierCompania("MSC Cruceros");
        rumboHomePageCrucero.cualquierPuerto("Buenos Aires");
        rumboHomePageCrucero.agregarJunior(1);
        rumboHomePageCrucero.buscarCrucero();
    }

    @Test
    void navegacionCrucerosEnOfertaBC006() throws InterruptedException {//algo cambio

        rumboHomePageCrucero = new RumboHomePageCrucero(DriverFactory.getDriver());
        rumboHomePageCrucero.navegarAlHome();
        rumboHomePageCrucero.aceptarCookie();
        rumboHomePageCrucero.seleccionarVerMas();
        rumboHomePageCrucero.seleccionarCrucero();
        Assertions.assertEquals("Cruceros. Ofertas de cruceros baratos. Tu crucero en Rumbo",rumboHomePageCrucero.textoUrlTitulo());
        rumboHomePageCrucero.bscCruceros();
        rumboHomePageCrucero.costaCruceros();
        rumboHomePageCrucero.filtrarRating();
        rumboHomePageCrucero.ingresarOpcion();
        rumboHomePageCrucero.carnivalHorizon();
        rumboHomePageCrucero.botonesDesplegables();
        rumboHomePageCrucero.seleccionarCompanhia();
        rumboHomePageCrucero.seleccionarPresupuesto();
        Assertions.assertEquals("Crucero Islas del Caribe de Miami, Estados Unidos | Carnival Horizon | Carnival | Rumbo",rumboHomePageCrucero.textoUrlTitulo());

    }

}
