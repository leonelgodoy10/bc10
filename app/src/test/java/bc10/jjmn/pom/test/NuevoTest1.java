package bc10.jjmn.pom.test;
import bc10.jjmn.pom.base.TestBase;
import bc10.jjmn.pom.pages.GatlingHomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NuevoTest1 extends TestBase {

    GatlingHomePage gatlingHomePage;

    @Test
    public void test1(){

        gatlingHomePage = new GatlingHomePage(super.driver);
        gatlingHomePage.irAHomePage();
        gatlingHomePage.cambiartamanhopage();
        Assertions.assertEquals(800,gatlingHomePage.obtenerWidth());
        Assertions.assertEquals(600,gatlingHomePage.obtenerHeight());
        Assertions.assertEquals("Filter by computer name...",gatlingHomePage.validarPlaceholder());
        Assertions.assertEquals("Computers database",gatlingHomePage.validarbtnAddComputer());
        Assertions.assertEquals("Computers database",gatlingHomePage.validarbtnHome());
        Assertions.assertEquals("Computers database",gatlingHomePage.validarbtnDiscontinued());
        Assertions.assertEquals("Computers database",gatlingHomePage.validarbtnComputerName());
        Assertions.assertEquals("Computers database",gatlingHomePage.validarrbtnComany());

    }
}
