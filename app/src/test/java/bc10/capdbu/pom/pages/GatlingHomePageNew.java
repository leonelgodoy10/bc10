package bc10.capdbu.pom.pages;

import bc10.capdbu.pom.base.SeleniumBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GatlingHomePageNew extends SeleniumBase {
    public GatlingHomePageNew(WebDriver driver) {
        super(driver);
    }
    String urlHome ="https://computer-database.gatling.io/";
    String urlAddNew = "https://computer-database.gatling.io/computers/new";
    String alertCreateComputer = "Failed to refine type : Predicate isEmpty() did not fail.";
    String succesMessage = "Done ! Computer BC10_CAPDBU has been created";

    //Atributos
    By btnAddLocator = By.xpath("//*[@id='add']");
    By btnCreateLocator = By.xpath("//input[@value='Create this computer']");
    By labelCLocator = By.xpath("//*[@id='main']/form/fieldset/div[1]/div/span");
    By inputNameLocator = By.id("name");
    By alertSuccessLocator = By.xpath("//*[@class='alert-message warning']");

    //Funciones
    public void navigateToHomePage(){
        navigateToPage(urlHome);
    }

    public void redimensionar(int width, int height){
        modifySizeDriver(width, height);
    }
    public void validateBtnAdd (){
        isDisplayed(btnAddLocator);
    }
    public void clickBtnAdd(){
        click(btnAddLocator);
    }
    public void clickCreateBtn(){
        click(btnCreateLocator);
    }
    public void validateBtnCreate (){
        isDisplayed(btnCreateLocator);
    }
    public void validateAlertMessageCreateComputer(){
        validateMessage(alertCreateComputer, labelCLocator);
    }
    public void escribirEnBarraComputerName(String palabra){
        type(palabra, inputNameLocator);
    }
    public void  validateSuccessMessageCreateComputer(){
        validateMessage(succesMessage, alertSuccessLocator);
    }
}
