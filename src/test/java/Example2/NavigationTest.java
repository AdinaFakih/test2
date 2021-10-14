package Example2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;
//import io.github.bonigarcia.wdm.WebDriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationTest {

    public static WebDriver driver;

    @BeforeTest
    public void beforeMethod() {

    	//ChromeOptions options = new ChromeOptions();
        // set path of Chromedriver executable
        //System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
//    	//WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver(options);
        // initialize new WebDriver session
//    	WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        
        WebDriverManager.chromedriver().setup();
		// initialize new WebDriver session
        driver = new ChromeDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
    }

    @Test
    public void navigateToAUrl() {
        // navigate to the web site
        driver.get("https://react-redux.realworld.io/#/login?_k=uzmkku");
        // Validate page title
        Assert.assertEquals(driver.getTitle(), "Conduit");
    }
    
    @AfterTest
    public void afterMethod() {
        // close and quit the browser
     driver.quit();
    }
}