package BrowersTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver","E:/SeleniumFramework/Drivers/IEdriver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://youtube.com/");
		Thread.sleep(3000);
		driver.close();

	}

}
