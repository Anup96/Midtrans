package Com.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Com.Pages.HomePage;
import Com.Pages.checkOutPage;
import Com.Utility.TestUtil;



public class TestBase 
{
public static Properties prop;
public static WebDriver driver;
public static HomePage homepage;
public static checkOutPage checkout;

	public TestBase()
	{
		try 
		{
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Neosoft\\eclipse-workspace\\Midtrans\\src\\main\\java\\Com\\Configration\\Configure");
		prop.load(ip);
		}
		catch(FileNotFoundException e)
		{ e.printStackTrace();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		
		
	}
	public static void initialization()
	{
		String browserName = prop.getProperty("Browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Software\\ChromeDriver\\chromedriver.exe");	
			driver = new ChromeDriver();
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "C:\\Software\\geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("BaseUrl"));
	}	
	
}
