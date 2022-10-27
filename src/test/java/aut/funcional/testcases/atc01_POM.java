package aut.funcional.testcases;

import aut.funcional.pages.GoogleHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.FuncionalTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class atc01_POM extends FuncionalTestBase {

    GoogleHomePage googleHomePage;

    @Test
    void busquedaGoogle(){
        googleHomePage = new GoogleHomePage(DriverFactory.getDriver());
        googleHomePage.navegarAlHome();
        googleHomePage.buscarConBotonBuscar("Tsoft");
        Assertions.assertEquals("Tsoft - Buscar con Google",googleHomePage.getTitle());
    }
}
