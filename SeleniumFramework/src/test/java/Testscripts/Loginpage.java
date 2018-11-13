package Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.setProperty("webdriver.gecko.driver","E:/SeleniumFramework/Drivers/geckodriver/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();	
			
		}

	}

}
