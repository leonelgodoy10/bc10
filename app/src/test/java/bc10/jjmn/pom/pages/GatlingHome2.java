package bc10.jjmn.pom.pages;

import bc10.jjmn.pom.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GatlingHome2 extends SeleniumBase {

    String urlHome = "https://computer-database.gatling.io/computers";
    By btnAddNewComputerloc = By.xpath("//a[@id='add']");
    By btnCreateThisComputerloc = By.xpath("//input[@value='Create this computer']");
    By mensajeloc = By.xpath("//span[contains(text(),'Failed to refine type : Predicate isEmpty() did no')]");

    public GatlingHome2(WebDriver driver) {super(driver);}
    public void irAHomePage() {navegarAPagina(urlHome);}
    public void maximizar() {maximizarTamanhoDriver();}
    public void clickearBtnAddNewComputer(){clickear(btnAddNewComputerloc);}
    public void clickearBtnNewComputer() {clickear(btnCreateThisComputerloc);}
    public String validarTexto(){return obtenerTexto(mensajeloc);}
}
