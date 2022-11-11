package bc10.shlc.pom.test;

import bc10.shlc.pom.base.TestBase;
import bc10.shlc.pom.page.GoogleHomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGoogle extends TestBase {

    //Page
    GoogleHomePage ghp;

    @Test
    void busquedaNormal(){
        ghp = new GoogleHomePage(super.driver);
        ghp.irAlHome();
        ghp.buscarEnBarraConBotonBuscarConGoogle("Tsoft");
        Assertions.assertTrue(true);
    }

    @Test
    void busquedaSuerte(){
        ghp = new GoogleHomePage(super.driver);
        ghp.irAlHome();
        ghp.buscarConBotonVoyAtenerSuerte("Tsoft");
        Assertions.assertTrue(true);
    }
}
