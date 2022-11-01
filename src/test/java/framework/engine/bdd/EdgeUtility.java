package framework.engine.bdd;

import framework.engine.selenium.SeleniumBase;
import org.openqa.selenium.WebDriver;

public class EdgeUtility implements DriverApi {

    public void launchEdge(){
        System.out.println("launching Edge!!");
    }

    @Override
    public WebDriver getDriver() {
        return null;
    }

    @Override
    public String getBrowserName() {
        return null;
    }
}
