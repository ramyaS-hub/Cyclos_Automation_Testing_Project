package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass 

{
	public static WebDriver driver;
	 @BeforeClass
	    public void setup() throws Exception 
	 {

	        WebDriverManager.chromedriver().setup();

	        driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.get("https://demo.cyclos.org/ui/home");
	 }

	        @AfterClass
	        
	        public void tearDown() throws Exception
	        {
	        
	        Thread.sleep(3000);
	        
	        driver.quit();
	    }

	 } 
	
	
	