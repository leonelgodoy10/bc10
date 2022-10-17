package webelements;

import bc10.earaya.webelements.WebElements;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class WebELementsAvanzados {
    WebDriver driver;

    //@FindBy(id = "dropdown")
    //WebElement dropdown;

    @FindBy(id = "ui-id-3")
    WebElement btnEnable;

    @FindBy(id = "ui-id-4")
    WebElement btnDowloands;

    @FindBy(id = "ui-id-5")
    WebElement btnPDF;

    @FindBy(xpath = "//form/input[1]")
    WebElement check1;
    @FindBy(xpath = "//form/input[2]")
    WebElement check2;


    @BeforeEach
    void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        PageFactory.initElements(driver, this);//Para crear una instancia de los elementos

    }

    /*@Test
    void dropdown(){

        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");

        // Clase para trabajar con los elementos <select>

        Select manejoDropDown = new Select(dropdown);
        //Funcionalidades de select
        manejoDropDown.selectByValue("1");
        manejoDropDown.selectByValue("2");

        manejoDropDown.selectByVisibleText("Option 1");
        manejoDropDown.selectByVisibleText("Option 2");



    }*/

    /*@Test
    public void dropDownDinamico(){

        driver.navigate().to("https://the-internet.herokuapp.com/jqueryui/menu");

        btnEnable.click();
        btnDowloands.click();
        btnPDF.click();
        Assertions.assertEquals("PDF",btnPDF.getText());




    }*/

    /*@Test
    public void checkbox(){

        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
        check1.click();
        boolean estaClickeado = check1.isSelected();

        check2.click();
        estaClickeado = check2.isSelected();

    }*/

   /*@Test
   public void iframes(){

        driver.navigate().to("https://the-internet.herokuapp.com/iframe");

        //Obtener todos los webElement que contengan el tag iframe
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));

        // Cambiar a iframe
        driver.switchTo().frame(iframes.get(0));

        // Obtener objetos de este iframe

        WebElement areaEscritura = driver.findElement(By.id("tinymce"));
        areaEscritura.clear();

        areaEscritura.sendKeys("Weno weno weno");

    }*/

    /*@Test
    public void webTables(){
        // ejercicio tabla 1: ordenar la tabla por deuda de mayor a menor
        driver.navigate().to("https://the-internet.herokuapp.com/tables");

        //Traerse la lista de las tablas en la pagina

        List<WebElement> webTables = driver.findElements(By.tagName("table"));

        WebElement tabla1 = webTables.get(0);
        // 1 :  cuantas filas y columnas tiene?

        //Lista que recibe todos los datos
        List<WebElement> filas = tabla1.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
        // Lista q recibe los titulos
        List<WebElement> columnas = tabla1.findElement(By.tagName("thead")).findElements(By.tagName("th"));

        //obtener webElement Due (Deduda) y presuonar  veces para ordenar la tabla

        if(columnas.get(3).getText().contains("Due")){

            columnas.get(3).click();
            columnas.get(3).click();
        }

        // Obtener nombre apellido y valor de deuda de la primera fila

        String nombre = filas.get(0).findElement(By.xpath("//td[2]")).getText();
        String apellido = filas.get(0).findElement(By.xpath("//td[1]")).getText();
        String eduda = filas.get(0).findElement(By.xpath("//td[4]")).getText();

        System.out.println("El usuario con mayor deuda acrual es : "+nombre+" "+apellido + " "+eduda);




    }*/

    @Test
    public void webTables2() throws InterruptedException {

        driver.navigate().to("https://the-internet.herokuapp.com/tables");
        List<WebElement> webTables = driver.findElements(By.tagName("table"));

        WebElement tabla2 = webTables.get(1);
        List<WebElement> filas2 = tabla2.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
        List<WebElement> columnas2 = tabla2.findElement(By.tagName("thead")).findElements(By.tagName("th"));

        columnas2.get(1).click();
        Thread.sleep(3000);


        String nombre = filas2.get(0).findElement(By.xpath("//table[2]//tr[1]/td[2]")).getText();
        String deuda = filas2.get(0).findElement(By.xpath("//table[2]//tr[1]/td[4]")).getText();

        String nombre2 = filas2.get(1).findElement(By.xpath("//table[2]//tr[2]/td[2]")).getText();
        String deuda2 = filas2.get(1).findElement(By.xpath("//table[2]//tr[2]/td[4]")).getText();

        String nombre3 = filas2.get(2).findElement(By.xpath("//table[2]//tr[3]/td[2]")).getText();
        String deuda3 = filas2.get(2).findElement(By.xpath("//table[2]//tr[3]/td[4]")).getText();

        String nombre4 = filas2.get(3).findElement(By.xpath("//table[2]//tr[4]/td[2]")).getText();
        String deuda4 = filas2.get(3).findElement(By.xpath("//table[2]//tr[4]/td[4]")).getText();

        System.out.println("La deuda de : "+nombre+" es igual a : "+deuda);
        System.out.println("La deuda de : "+nombre2+" es igual a : "+deuda2);
        System.out.println("La deuda de : "+nombre3+" es igual a : "+deuda3);
        System.out.println("La deuda de : "+nombre4+" es igual a : "+deuda4);






    }
    @AfterEach
    void quit(){driver.close();}

}
