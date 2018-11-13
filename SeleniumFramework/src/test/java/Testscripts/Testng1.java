package Testscripts;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Testng1 {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUptest() {
	System.setProperty("webdriver.gecko.driver","E:/SeleniumFramework/Drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	}
	@Test
	  public void Ecomersloginpage(){
		  
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.xpath("//a[contains(text(),'eCommerce')]")).click();
	driver.findElement(By.xpath("//tbody//tr[1]//td[1]//div[1]//div[3]//a[1]")).click();
	Select dropProduct= new Select(driver.findElement(By.name("contactListId")));
	dropProduct.selectByVisibleText("New Product Annoucements");
	dropProduct.selectByIndex(2);
	
}
	@AfterTest
	  public void tearDownTest()
	  {
		  driver.close();
		  driver.quit();
	  }
}

