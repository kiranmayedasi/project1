package Packagetwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchHotel {
	 public static WebDriver driver;
	 
	 @Given("^username$")
	 public void log()
	 {
		 System.out.println("kiranmaye");
	 }
@Given("^Enter the url of the application$") 
public void show() {
	driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/index.php");
	driver.manage().window().maximize();
}
@And("^It shows login page$")
public void display() {
	 WebElement w= driver.findElement(By.id("username"));
	 w.isDisplayed();
	 System.out.println("done");
}
@When("^User enters valid credentials and click on login$")
public void login() {
driver.findElement(By.id("username")).sendKeys("rameshadepu");
driver.findElement(By.id("password")).sendKeys("ramesh11");
driver.findElement(By.id("login")).click();
}
@And("^Displays home page$")
public void homepage() {
	WebElement l2=driver.findElement(By.xpath("//select[@id='location']"));
	l2.isDisplayed();
	System.out.println("Done2");
}
@Then("^Search hotel functionality$")
public void searchhotel() {
	Select s=new Select(driver.findElement(By.xpath("//select[@id='location']")));
	s.selectByIndex(5);
	Select s1=new Select(driver.findElement(By.id("hotels")));
	s1.selectByIndex(2);
	Select s2=new Select(driver.findElement(By.id("room_type")));
	s2.selectByIndex(2);
	Select s3=new Select(driver.findElement(By.xpath("//select[@id='room_nos']")));
	s3.selectByVisibleText("5 - Five");
	driver.findElement(By.id("datepick_in")).clear();
	driver.findElement(By.id("datepick_in")).sendKeys("02/07/2021");
	driver.findElement(By.id("datepick_out")).clear();
	driver.findElement(By.id("datepick_out")).sendKeys("04/07/2021");
	Select s4=new Select(driver.findElement(By.id("adult_room")));
	s4.selectByIndex(2);
	Select s5=new Select(driver.findElement(By.id("adult_room")));
	s5.selectByIndex(2);
	Select s6=new Select(driver.findElement(By.xpath("//select[@id='room_nos']")));
	s6.selectByIndex(2);
	driver.findElement(By.xpath("//input[@id='Submit']")).click();
}
@And("^logout from the application$")
public void logout() {
	driver.findElement(By.linkText("Logout")).click();
}

		

}