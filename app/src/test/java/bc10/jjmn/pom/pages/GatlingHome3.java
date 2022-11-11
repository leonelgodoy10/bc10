package bc10.jjmn.pom.pages;

import bc10.jjmn.pom.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GatlingHome3 extends SeleniumBase {


    String urlHome = "https://computer-database.gatling.io/computers";
    String nombrePC = "BC10_JJMN";
    String introduced = "2022-10-23";
    String discontinued = "2022-10-24";
    By btnAddNewComputerloc = By.xpath("//a[@id='add']");
    By searchboxComputerNameloc = By.xpath("//input[@id='name']");
    By searchboxIntroducedloc = By.xpath("//input[@id='introduced']");
    By searchboxDiscontinuedloc = By.xpath("//input[@id='discontinued']");
    By selectCompanyloc = By.xpath("//select[@id='company']");
    By msjeloc = By.xpath("//div[@class='alert-message warning']");
    By btnCreateThisComputerloc = By.xpath("//input[@value='Create this computer']");

    public GatlingHome3(WebDriver driver) {
        super(driver);
    }


    public void irHome(){navegarAPagina(urlHome);}
    public void encontrarBtnAddNewComputer(){
        encontrarElemento(btnAddNewComputerloc);
        clickear(btnAddNewComputerloc);
    }
    public void maximizarPantalla(){maximizarTamanhoDriver();}

    public void enviarInformacion(){
        enviarDatos(searchboxComputerNameloc,nombrePC);
        enviarDatos(searchboxIntroducedloc,introduced);
        enviarDatos(searchboxDiscontinuedloc,discontinued);
    }
    public void seleccionarIndex() throws InterruptedException {cambiarIndex(selectCompanyloc,42);}
    public void crearPC(){clickear(btnCreateThisComputerloc);}
    public String validarMensaje(){return obtenerTexto(msjeloc);}
}

