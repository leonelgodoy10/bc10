package bc10.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class ComputerDataBase {

    WebDriver driver;

    By btnFilterNameloc = By.xpath("//input[@id='searchsubmit']");

    By btnAddNewComputerloc = By.xpath("//a[@id='add']");

    By btnHomeloc = By.xpath("//a[normalize-space()='Computer database']");

    By btnComputerNameloc = By.xpath("//a[normalize-space()='Computer database']");
    By btnDiscontinuedloc = By.xpath("//a[normalize-space()='Discontinued']");
    By btnCompanyloc = By.xpath("//a[normalize-space()='Company']");
    By btnCreateThisComputerloc = By.xpath("//input[@value='Create this computer']");
    By mensajeloc = By.xpath("//span[contains(text(),'Failed to refine type : Predicate isEmpty() did no')]");

    By searchboxComputerNameloc = By.xpath("//input[@id='name']");
    By searchboxIntroducedloc = By.xpath("//input[@id='introduced']");
    By searchboxDiscontinuedloc = By.xpath("//input[@id='discontinued']");
    By selectCompanyloc = By.xpath("//select[@id='company']");
    By msjeloc = By.xpath("//div[@class='alert-message warning']");


    @BeforeEach
    void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://computer-database.gatling.io");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }


    @Test
    void Test1() throws InterruptedException {

        driver.manage().window().setSize(new Dimension(800,600));

        Dimension dimension = driver.manage().window().getSize();

        int widht = dimension.getWidth();
        int heigth = dimension.getHeight();

        Thread.sleep(2000);
        // valida las dimensiones
        Assertions.assertEquals(800,widht);
        Assertions.assertEquals(600,heigth);


        WebElement btnFilterName = driver.findElement(btnFilterNameloc);

        // valida que no se pueda entrar a menos que se haya escrito algo
        String palabra = driver.findElement(By.xpath("//input[@id='searchbox']")).getAttribute("placeholder");
        Assertions.assertEquals("Filter by computer name...",palabra);
        btnFilterName.click();
        //Boton nuevo computador
        WebElement btnAddNewComputer = driver.findElement(btnAddNewComputerloc);
        btnAddNewComputer.click();
        Assertions.assertEquals("Computers database",driver.getTitle());

        //Regresa a la home
        WebElement btnHome = driver.findElement(btnHomeloc);
        btnHome.click();

        //Computer name
        WebElement btnComputerName = driver.findElement(btnComputerNameloc);
        btnComputerName.click();
        Assertions.assertEquals("Computers database",driver.getTitle());
        //Discontinued
        WebElement btnDiscontinued = driver.findElement(btnDiscontinuedloc);
        btnDiscontinued.click();
        Assertions.assertEquals("Computers database",driver.getTitle());
        //Company
        WebElement btnCompany = driver.findElement(btnCompanyloc);
        btnCompany.click();
        Assertions.assertEquals("Computers database",driver.getTitle());

    }

    @Test
    void test2(){

        WebElement btnAddNewComputer = driver.findElement(btnAddNewComputerloc);
        btnAddNewComputer.click();

        driver.manage().window().maximize();

        WebElement btnCreateNewComputer = driver.findElement(btnCreateThisComputerloc);
        btnCreateNewComputer.click();

        WebElement mensaje = driver.findElement(mensajeloc);

        Assertions.assertEquals("Failed to refine type : Predicate isEmpty() did not fail.",mensaje.getText());


    }

    @Test
    void Test3(){

        WebElement btnAddNewComputer = driver.findElement(btnAddNewComputerloc);
        btnAddNewComputer.click();
        driver.manage().window().maximize();

        WebElement searchboxCompuerName = driver.findElement(searchboxComputerNameloc);
        searchboxCompuerName.sendKeys("BC10_JJMN");

        WebElement searchboxIntroduced = driver.findElement(searchboxIntroducedloc);
        searchboxIntroduced.sendKeys("2022-10-23");

        WebElement searchboxDiscontinued = driver.findElement(searchboxDiscontinuedloc);
        searchboxDiscontinued.sendKeys("2022-10-24");

        WebElement selectCompany = driver.findElement(selectCompanyloc);
        selectCompany.click();

        Select company = new Select(selectCompany);
        company.selectByIndex(42);


        WebElement btnCreateNewComputer = driver.findElement(btnCreateThisComputerloc);
        btnCreateNewComputer.click();

        WebElement msje = driver.findElement(msjeloc);


        Assertions.assertEquals("Done ! Computer BC10_JJMN has been created",msje.getText());

    }



    @AfterEach
    void quit(){
        driver.quit();
    }

}

