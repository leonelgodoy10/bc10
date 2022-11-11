package bc10.jjmn.pom.pages;
import bc10.jjmn.pom.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GatlingHomePage extends SeleniumBase {

    String urlHome = "https://computer-database.gatling.io/computers";
    By btnAddNewComputerloc = By.xpath("//a[@id='add']");

    By searchBoxLOC = By.xpath("//input[@id='searchbox']");
    By btnHomeloc = By.xpath("//a[normalize-space()='Computer database']");

    By btnComputerNameloc = By.xpath("//a[normalize-space()='Computer database']");
    By btnDiscontinuedloc = By.xpath("//a[normalize-space()='Discontinued']");
    By btnCompanyloc = By.xpath("//a[normalize-space()='Company']");

    public GatlingHomePage(WebDriver driver) {super(driver);}
    public void irAHomePage(){navegarAPagina(urlHome);}
    public void cambiartamanhopage(){cambiarTamanhoDriver(800,600);}
    public void obtenWidth(){obtenerWidth();}
    public void obtenHeigth(){obtenerHeight();}

    public String validarPlaceholder(){
        return obtenerAtributo(searchBoxLOC,"placeholder");
    }
    public String validarbtnAddComputer(){return validarTitulo(btnAddNewComputerloc);}
    public String validarbtnHome(){return validarTitulo(btnHomeloc);}
    public String validarbtnComputerName(){return validarTitulo(btnComputerNameloc);}
    public String validarbtnDiscontinued(){return validarTitulo(btnDiscontinuedloc);}
    public String validarrbtnComany(){return validarTitulo(btnCompanyloc);}

//ctrl shift r

}
