package bc10.jjmn.pom.test;

import bc10.jjmn.pom.base.TestBase;
import bc10.jjmn.pom.pages.GatlingHome2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NuevoTest2 extends TestBase {

    GatlingHome2 gatlingHomePage;

    @Test
    public void segundoTest() {

        gatlingHomePage = new GatlingHome2(super.driver);
        gatlingHomePage.irAHomePage();
        gatlingHomePage.clickearBtnAddNewComputer();
        gatlingHomePage.maximizar();
        gatlingHomePage.clickearBtnNewComputer();
        Assertions.assertEquals("Failed to refine type : Predicate isEmpty() did not fail.",gatlingHomePage.validarTexto());



    }


}
