package bc10.shlc.pom.test;

import bc10.shlc.pom.base.TestBase;
import bc10.shlc.pom.page.GatlingHomePage;
import org.junit.jupiter.api.Test;

public class Test1 extends TestBase {

    GatlingHomePage gatlingHomePage;
    @Test
    public void test1(){
        gatlingHomePage = new GatlingHomePage(driver);
        gatlingHomePage.irAHomePAge();
        gatlingHomePage.validarDespliegeWebElement();
        gatlingHomePage.validarColumnas();
    }
}
