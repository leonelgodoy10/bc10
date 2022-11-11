package bc10.jjmn.pom.test;

import bc10.jjmn.pom.base.TestBase;
import bc10.jjmn.pom.pages.GatlingHome3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NuevoTest3 extends TestBase {

    GatlingHome3 gatlingHomePage;


    @Test
    public void test1() throws InterruptedException {

        gatlingHomePage = new GatlingHome3(super.driver);
        gatlingHomePage.irHome();
        gatlingHomePage.encontrarBtnAddNewComputer();
        gatlingHomePage.maximizarPantalla();
        gatlingHomePage.enviarInformacion();
        gatlingHomePage.seleccionarIndex();
        gatlingHomePage.crearPC();
        Assertions.assertEquals("Done ! Computer BC10_JJMN has been created",gatlingHomePage.validarMensaje());

    }

}
