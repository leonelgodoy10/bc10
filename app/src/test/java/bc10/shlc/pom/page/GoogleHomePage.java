package bc10.shlc.pom.page;

import bc10.shlc.pom.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage extends SeleniumBase {
    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    //Atributos - localizadores
    String url = "https://www.google.com/";
    By barraBusquedaLocator = By.name("q");
    By btnBuscarConGoogleLocator = By.name("btnK");
    By btnVoyAtenerSuerteLocator = By.name("btnI");


    //Funciones - metodos de pagina
    public void irAlHome(){
        navegarAPagina(url);
    }

    public void buscarEnBarraConBotonBuscarConGoogle(String texto){
        type(texto,barraBusquedaLocator);
        click(btnBuscarConGoogleLocator);
    }

    public void buscarConBotonVoyAtenerSuerte(String texto){
        type(texto,barraBusquedaLocator);
        click(btnVoyAtenerSuerteLocator);
    }

}
