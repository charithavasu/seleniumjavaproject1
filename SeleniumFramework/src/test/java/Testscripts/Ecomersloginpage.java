package Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ecomersloginpage
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.gecko.driver","E:/SeleniumFramework/Drivers/geckodriver/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
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
}