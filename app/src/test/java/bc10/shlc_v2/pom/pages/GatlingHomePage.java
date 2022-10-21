package bc10.shlc_v2.pom.pages;

import bc10.shlc_v2.pom.base.SeleniumBase;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GatlingHomePage extends SeleniumBase {

    public GatlingHomePage(WebDriver driver) {
        super(driver);
    }

    //Localizadores
    String url = "https://computer-database.gatling.io/computers";
    By btnCreateComputerLoc = By.xpath("//input[@value='Create this computer']");
    By btnFilterNameLoc = By.xpath("//input[@id='searchsubmit']");
    By btnNewComputerLoc = By.xpath("//a[@id='add']");
    By computerName = By.xpath("//a[normalize-space()='Computer name']");
    By introduced = By.xpath("//a[normalize-space()='Introduced']");
    By discontinued = By.xpath("//a[normalize-space()='Discontinued']");
    By company = By.xpath("//a[normalize-space()='Company']");
    By escribirNameLoc = By.xpath("//input[@id='name']");
    By mensajeErrorLoc = By.xpath("//span[contains(text(),'Failed to refine type : Predicate isEmpty() did no')]");

    By tablaLoc = By.xpath("//table[@class='computers zebra-striped']");
    By theadLoc = By.tagName("thead");
    By thLoc = By.tagName("th");

    By mensajeNombreLoc = By.xpath("//div[@class='alert-message warning']");

    //Funciones

    public void irAHomePage(){
        navegarAPagina(url);
    }


    public void validadBotones(){
        estaDesplegado(btnFilterNameLoc);
        estaDesplegado(btnNewComputerLoc);

    }
    public void validarResolucion(int width, int height){

        cambiarTamanhoDriver(width,height);
        System.out.println("la resolucion de navegador es: "+width+" x "+ height);

    }
    public void validarColumnas(){
        List<WebElement> webTables = encontrarElementos(tablaLoc);
        WebElement tabla = obtenerElementoDeElementos(webTables,0);
        List<WebElement> columnas = elementosParaBuscarEnTablas(tabla, theadLoc, thLoc);
        for (int i = 0; i < columnas.size(); i++) {
            String nombre = obtenerElementoDeElementos(columnas,i).findElement(By.xpath("//th["+(i+1)+"]")).getText();
            Assertions.assertEquals(nombre, obtenerElementoDeElementos(columnas,i).getText());
        }

        /*estaDesplegado(computerName);
        estaDesplegado(introduced);
        estaDesplegado(discontinued);
        estaDesplegado(company);*/
    }


    public void validarTextoError(){
        String mensajeError =  obtenerTextoo(mensajeErrorLoc);
        Assertions.assertEquals("Failed to refine type : Predicate isEmpty() did not fail.",mensajeError);
    }
    public void clickearNewComputer(){
        clickear(btnNewComputerLoc);
    }
    public void clickearCreateComputer(){
        clickear(btnCreateComputerLoc);
    }
    public void escribirBarraTexto(String texto){
        escribir(texto,escribirNameLoc);
    }

    public void validarMensajeDeNombre(){
        String mensajeNombre =  obtenerTextoo(mensajeNombreLoc);
        Assertions.assertEquals("Done ! Computer BC10_SELU has been created",mensajeNombre);
    }
}
