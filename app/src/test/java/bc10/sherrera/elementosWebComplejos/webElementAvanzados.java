package bc10.sherrera.elementosWebComplejos;

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

import java.time.Duration;
import java.util.List;

public class webElementAvanzados {
    WebDriver driver;
    @FindBy(id = "dropdown")
    WebElement dropdown;

    @FindBy(id = "ui-id-3")
    WebElement btnEnable;

    @FindBy(id = "ui-id-4")
    WebElement btnDownload;

    @FindBy(id = "ui-id-5")
    WebElement btnPDF;

    @FindBy(xpath = "//input[1]")
    WebElement checkbox1;

    @FindBy(xpath = "//input[2]")
    WebElement checkbox2;

    @FindBy(id = "tinymce")
    WebElement text1;



    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        PageFactory.initElements(driver, this);

    }

    @Test
    public void dropdown(){
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");

        // Clsee para trabajar con los elementos <select>
        Select manejoDropdown = new Select(dropdown);

        // Funcionalidades Select
        manejoDropdown.selectByValue("1");
        manejoDropdown.selectByValue("2");
        manejoDropdown.selectByValue("");

        manejoDropdown.selectByVisibleText("Option 1");
        manejoDropdown.selectByVisibleText("Option 2");

    }

    @Test
    public void dropDownDiamico(){
        driver.navigate().to("https://the-internet.herokuapp.com/jqueryui/menu#");
        btnEnable.click();
        btnDownload.click();
        btnPDF.click();
        Assertions.assertEquals("PDF",btnPDF.getText());

    }

    @Test
    public void checkbox(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        checkbox1.click();
        boolean estClickeado = checkbox1.isSelected();

        checkbox2.click();
        estClickeado = checkbox1.isSelected();


    }
    @Test
    public void iframe (){
        driver.navigate().to("https://the-internet.herokuapp.com/iframe");

        //obtener todos los webElement que contangen el tag iframe
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));

         //Cambiar a iframe
        driver.switchTo().frame(iframes.get(0));

        //ya cambiado al iframe, obtendremos objetos de esta pagina
        text1.clear();
        text1.sendKeys("Hola saludos cabros :)");

    }
    @Test
    public void webTables (){
        driver.navigate().to("https://the-internet.herokuapp.com/tables");
        // ejercicio tabla 1 : ordenar la tabla por deuda de mayor a menor

        //Lista de de webtables en la pagina
        List<WebElement> webTables = driver.findElements(By.tagName("table"));

        WebElement tabla1 = webTables.get(0);
        //1. cuantas filas y columnas tiene?
        List<WebElement> filas = tabla1.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
        System.out.println(filas.size());
        List<WebElement> columnas = tabla1.findElement(By.tagName("thead")).findElements(By.tagName("th"));
        System.out.println(columnas.size());

        //Obtener el webElement due y presionarlo 2 veces para ordenar la tabla
        if (columnas.get(3).getText().contains("Due")){
            columnas.get(3).click();
            columnas.get(3).click();
        }

        // obtener el nombre, apellido y valro de la deuda de la primer a fila
        String nombre = filas.get(0).findElement(By.xpath("//td[2]")).getText();
        String apellido = filas.get(0).findElement(By.xpath("//td[1]")).getText();
        String deuda = filas.get(0).findElement(By.xpath("//td[4]")).getText();

        System.out.println("El usuario con mayor deuda actuaal es: "+nombre+" "+apellido+" "+deuda);
     }

    @Test
    public void webTables1 () throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/tables");
        //Lista de de webtables en la pagina
        /*List<WebElement> webTables = driver.findElements(By.id("table2"));
        WebElement tabla = webTables.get(0);*/
        List<WebElement> webTables = driver.findElements(By.tagName("table"));
        WebElement tabla = webTables.get(1);
        //1. cuantas filas y columnas tiene?
        List<WebElement> filas = tabla.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
        System.out.println(filas.size());
        List<WebElement> columnas = tabla.findElement(By.tagName("thead")).findElements(By.tagName("th"));
        System.out.println(columnas.size());
        //Obtener el webElement due y presionarlo 2 veces para ordenar la tabla
       if (columnas.get(1).getText().contains("First Name")){
            Thread.sleep(2000);
            columnas.get(1).click();
        }
        for (int i = 0; i < filas.size() ; i++) {

                String nombre = filas.get(i).findElement(By.xpath("//table[2]/tbody[1]/tr["+(i+1)+"]/td[2]")).getText();
                String apellido = filas.get(i).findElement(By.xpath("//table[2]/tbody[1]/tr["+(i+1)+"]/td[1]")).getText();
                String deuda = filas.get(i).findElement(By.xpath("//table[2]/tbody[1]/tr["+(i+1)+"]/td[4]")).getText();
                System.out.println("El usuario : "+nombre+" "+apellido+" Deuda : "+deuda);
        }
        //table[2]/tbody[1]/tr[1]/td[1]
        // obtener el nombre, apellido y valro de la deuda de la primer a fila
       /*     String nombre = filas.get(0).findElement(By.xpath("//table[2]/tbody[1]/tr[1]/td[2]")).getText();
            String apellido = filas.get(0).findElement(By.xpath("//table[2]/tbody[1]/tr[1]/td[1]")).getText();
            String deuda = filas.get(0).findElement(By.xpath("//table[2]/tbody[1]/tr[1]/td[4]")).getText();
            System.out.println("El usuario : "+nombre+" "+apellido+" "+deuda);
            String nombre2 = filas.get(1).findElement(By.xpath("//table[2]/tbody[1]/tr[2]/td[2]")).getText();
            String apellido2 = filas.get(1).findElement(By.xpath("//table[2]/tbody[1]/tr[2]/td[1]")).getText();
            String deuda2 = filas.get(1).findElement(By.xpath("//table[2]/tbody[1]/tr[2]/td[4]")).getText();
            System.out.println("El usuario : "+nombre2+" "+apellido2+" "+deuda2);
            String nombre3 = filas.get(2).findElement(By.xpath("//table[2]/tbody[1]/tr[3]/td[2]")).getText();
            String apellido3 = filas.get(2).findElement(By.xpath("//table[2]/tbody[1]/tr[3]/td[1]")).getText();
            String deuda3 = filas.get(2).findElement(By.xpath("//table[2]/tbody[1]/tr[3]/td[4]")).getText();
            System.out.println("El usuario : "+nombre3+" "+apellido3+" "+deuda3);
            String nombre4 = filas.get(3).findElement(By.xpath("//table[2]/tbody[1]/tr[4]/td[2]")).getText();
            String apellido4 = filas.get(3).findElement(By.xpath("//table[2]/tbody[1]/tr[4]/td[1]")).getText();
            String deuda4 = filas.get(3).findElement(By.xpath("//table[2]/tbody[1]/tr[4]/td[4]")).getText();
            System.out.println("El Usuario : "+nombre4+" "+apellido4+" "+deuda4);
*/
    }

    @AfterEach
    void clean()
    {
        driver.close();
    }

}

