package bc10.shlc_v2.pom.test;

import bc10.shlc_v2.pom.base.TestBase;
import bc10.shlc_v2.pom.pages.GatlingHomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test2 extends TestBase {

    GatlingHomePage gatlingHomePage;
    @Test

    void test2(){
        gatlingHomePage = new GatlingHomePage(super.driver);
        gatlingHomePage.irAHomePage();
        gatlingHomePage.clickearNewComputer();
        gatlingHomePage.clickearCreateComputer();
        gatlingHomePage.validarTextoError();
        Assertions.assertTrue(true);
    }
}
