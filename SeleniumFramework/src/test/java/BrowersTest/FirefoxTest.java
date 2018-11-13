package BrowersTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

public static void main(String[] args)
{
 String ProjectPath= System.getProperty("user.dir");
System.out.println("Project Path is:" +ProjectPath);
System.setProperty("webdriver.gecko.driver", "E:/SeleniumFramework/Drivers/geckodriver/geckodriver.exe");	
	
WebDriver driver = new FirefoxDriver();
driver.get("http://youtube.com/");


	}

}
