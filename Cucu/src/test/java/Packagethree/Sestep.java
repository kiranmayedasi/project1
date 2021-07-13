package Packagethree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Sestep {
    public static WebDriver driver;
    
    
    
    @Given("^name of username$")
    public void user() {
        System.out.println("this is ramesh adepu");
    }
    @Given("^launch Adactin Application$")
    public void launchApp() throws InterruptedException
    {
        driver=new ChromeDriver();
        driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
    
    @Given("^enter username ([^\"]*)$")
    public void username(String username) throws InterruptedException
    {
        driver.findElement(By.name("username")).sendKeys(username);
        Thread.sleep(2000);
    }
    
    @When("^enter password ([^\"]*)$")
    public void password(String password)
    {
        driver.findElement(By.name("password")).sendKeys(password);    
    }
    
    @When("^click on login button$")
    public void loginbutton() {
        driver.findElement(By.name("login")).click();
        
    }
    @And("^Search hotel depends on requirement$")
    public void searchHotel() throws InterruptedException
    {
        System.out.println("entered into search hotel");
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='location']"));
        Select ss = new Select(dropdown);
        ss.selectByVisibleText("Paris");
        WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='room_nos']"));
        Select ss1 = new Select(dropdown1);
        System.out.println(ss1);
        ss1.selectByIndex(1);
        WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='adult_room']"));
        Select ss2 = new Select(dropdown2);
        System.out.println(ss2);
        ss2.selectByIndex(2);
        
    }
    @And("^click on search button$")
    public void searchButton()
    {
        driver.findElement(By.id("Submit")).click();
    }
    
}
 

