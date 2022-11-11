package bc10.shlc_v2.pom.test;

import bc10.shlc_v2.pom.base.TestBase;
import bc10.shlc_v2.pom.pages.GatlingHomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test3 extends TestBase {

    GatlingHomePage gatlingHomePage;
    @Test
    void test3(){
        gatlingHomePage = new GatlingHomePage(super.driver);
        gatlingHomePage.irAHomePage();
        gatlingHomePage.clickearNewComputer();
        gatlingHomePage.escribirBarraTexto("BC10_SELU");
        gatlingHomePage.clickearCreateComputer();
        gatlingHomePage.validarMensajeDeNombre();
        Assertions.assertTrue(true);
    }
}
