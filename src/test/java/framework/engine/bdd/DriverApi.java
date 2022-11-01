package framework.engine.bdd;

import org.openqa.selenium.WebDriver;

public interface DriverApi {

    WebDriver getDriver();
    String getBrowserName();
}
