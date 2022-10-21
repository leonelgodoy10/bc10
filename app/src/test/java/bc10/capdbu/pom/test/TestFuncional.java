package bc10.capdbu.pom.test;

import bc10.capdbu.pom.base.TestBase;
import bc10.capdbu.pom.pages.GatlingHomePageNew;
import org.junit.jupiter.api.Test;

public class TestFuncional extends TestBase {
    GatlingHomePageNew ghpNew;

    @Test
    void test1(){
        ghpNew = new GatlingHomePageNew(super.driver);
        ghpNew.navigateToHomePage();
        ghpNew.validateBtnAdd();
        ghpNew.clickBtnAdd();
        ghpNew.validateBtnCreate();
        ghpNew.clickCreateBtn();
        ghpNew.validateAlertMessageCreateComputer();
    }

    @Test
    void test2(){
        ghpNew = new GatlingHomePageNew(super.driver);
        ghpNew.navigateToHomePage();
        ghpNew.clickBtnAdd();
        ghpNew.escribirEnBarraComputerName("BC10_CAPDBU");
        ghpNew.clickCreateBtn();
        ghpNew.validateSuccessMessageCreateComputer();
    }
}
