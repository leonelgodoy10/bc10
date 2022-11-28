package aut.funcional.equipo1.rumbo.testcases;

import aut.funcional.equipo1.rumbo.pages.BCIHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BCIPersonas extends SeleniumTestBase {
    BCIHomePage bciHomePage;


    @Test
    void ingresoBancoEnLinea() throws InterruptedException {
        bciHomePage = new BCIHomePage(DriverFactory.getDriver());
        bciHomePage.navegarAlHome();
        bciHomePage.clicBancoEnLinea();
        bciHomePage.ingresoUsuario("167981577","12345");
        Thread.sleep(1000);


    }


}
