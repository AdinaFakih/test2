package Example2;
import org.testng.annotations.Test;
//import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
public class jojo {
	
	public static WebDriver driver;
	
	@Test
	public void loginTest()
	{
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		System.out.println("Login successful");
		
	}
//	@Test(priority=2,description="This is a logout test")
	public void logout() {
		System.out.println("Logout successful");
		
	}
}