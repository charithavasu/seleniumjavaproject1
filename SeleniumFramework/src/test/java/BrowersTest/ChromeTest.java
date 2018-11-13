package BrowersTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
	public static void main(String[] args) throws InterruptedException
	{
		String ProjectPath= System.getProperty("user.dir");
		System.out.println("Project Path is:" +ProjectPath);
	System.setProperty("webdriver.chrome.driver",ProjectPath+"//Drivers/chromedriver/chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("abcd");
	driver.get("http://youtube.com/");
	//Thread.sleep(3000);
	driver.close();
	
	
	
}
}