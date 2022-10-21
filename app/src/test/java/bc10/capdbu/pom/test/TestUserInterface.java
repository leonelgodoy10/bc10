package bc10.capdbu.pom.test;

import bc10.capdbu.pom.base.TestBase;
import bc10.capdbu.pom.pages.GatlingHomePage;
import org.junit.jupiter.api.Test;

public class TestUserInterface extends TestBase {

    GatlingHomePage gatlingHomePage;

    @Test
    public void test1(){
        gatlingHomePage = new GatlingHomePage(super.driver);
        gatlingHomePage.redimensionar(800,600);
        gatlingHomePage.irAHomePage();
        gatlingHomePage.validateBtns();
        gatlingHomePage.validateColumns();
    }
}

