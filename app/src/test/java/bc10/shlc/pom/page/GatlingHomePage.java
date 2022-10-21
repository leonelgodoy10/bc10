package bc10.shlc.pom.page;

import bc10.shlc.pom.base.SeleniumBase;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GatlingHomePage extends SeleniumBase {

    public GatlingHomePage(WebDriver driver) {
        super(driver);
    }

    //Localizadores
    String urlHome = "https://computer-database.gatling.io";
    By btnFilterNameLoc = By.xpath("//input[@id='searchsubmit']");
    By btnNewComputerLoc = By.xpath("//a[@id='add']");
    By tablaLoc = By.xpath("//table[@class='computers zebra-striped']");
    By btnCreateComputerLoc = By.xpath("//input[@value='Create this computer']");
    By mensajeErrorLoc = By.xpath("//span[contains(text(),'Failed to refine type : Predicate isEmpty() did no')]");
    By escribirNameLoc = By.xpath("//input[@id='name']");
    By mensajeNombreLoc = By.xpath("//div[@class='alert-message warning']");
    By computerName = By.xpath("//a[normalize-space()='Computer name']");
    By introduced = By.xpath("//a[normalize-space()='Introduced']");
    By discontinued = By.xpath("//a[normalize-space()='Discontinued']");
    By company = By.xpath("//a[normalize-space()='Company']");


    //Funciones o acciones que podemos desarrollar en la Pagina
    public void irAHomePAge(){
        navegarAPagina(urlHome);
    }

    public void redimencionar(int width, int height){
        cambiarResolucionDriver(width,height);
    }

    public void validarDespliegeWebElement(){
        isDisplayed(btnFilterNameLoc);
        isDisplayed(btnNewComputerLoc);
    }

    public void validarColumnas(){
        getText(computerName);
        getText(introduced);
        getText(discontinued);
        getText(company);
    }

}
