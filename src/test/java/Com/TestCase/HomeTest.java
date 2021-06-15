package Com.TestCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Com.Base.TestBase;
import Com.Pages.HomePage;

public class HomeTest extends TestBase
{
	@BeforeSuite
	public void setUp() 
	{
		initialization();
		homepage = new HomePage();
		}
	@Test
	public void homepagetest() throws Exception {
		checkout=homepage.homePage();
	}
}
