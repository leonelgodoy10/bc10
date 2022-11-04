package bc10.capdbu.pom.pages;
import org.openqa.selenium.By;
import bc10.capdbu.pom.base.SeleniumBase;
import org.openqa.selenium.WebDriver;
public class GatlingHomePage  extends SeleniumBase {

    public GatlingHomePage(WebDriver driver) {
        super(driver);
    }
    String url = "https://computer-database.gatling.io/";
    //Localizadores
    By inputBlank = By.xpath("//input[@id='searchbox']");
    By btnFBNLocator = By.xpath("//*[@id='searchsubmit']");
    By btnAddLocator = By.xpath("//*[@id='add']");
    By computerLocator = By.xpath("//*[@id='main']/form/fieldset/div[1]/label");
    By discontinuedLocator = By.xpath("//*[@id='main']/form/fieldset/div[3]/label");
    By introducedLocator = By.xpath("//*[@id='main']/form/fieldset/div[2]/label");
    By companyLocator = By.xpath("//*[@id='main']/form/fieldset/div[4]/label");
    public void irAHomePage(){
        navigateToPage(url);
    }
    public void redimensionar(int width, int height){
        modifySizeDriver(width, height);
    }

    public void validateBtns(){
        isDisplayed(btnFBNLocator);
        isDisplayed(btnAddLocator);
    }

    public void validateColumns(){
        isDisplayed(computerLocator);
        isDisplayed(companyLocator);
        isDisplayed(introducedLocator);
        isDisplayed(discontinuedLocator);
    }

    public void escribirEnBarraBusqueda(String palabra){
        type(palabra, inputBlank);
    }

}
