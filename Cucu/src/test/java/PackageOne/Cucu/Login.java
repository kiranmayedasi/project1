package PackageOne.Cucu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import gherkin.ast.Background;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	public static WebDriver driver;
	
   
   
	@Given("^User present in Adactin Login page$")
	public void openlogin() {
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\ra21005\\Desktop\\Selenium
	//file\\chromedriver_win32 (2)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
	driver.manage().window().maximize();
	}
   
	@When("^User Enter Username$")
	public void Enterun() {
	driver.findElement(By.name("username")).sendKeys("rameshadepu");
	}
	@And("^User Enter Password$")
	public void Enterpwd() {
	driver.findElement(By.id("password")).sendKeys("ramesh11")
	;
	}
	@And("^User Click on Login Button$")
	public void clicklogin() {
	driver.findElement(By.id("login")).click();
	}
	@Then("^User navigate to login page$")
	public void Home() {
	driver.close();
	}

	
}
