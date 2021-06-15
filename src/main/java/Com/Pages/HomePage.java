package Com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.Base.TestBase;

public class HomePage extends TestBase
{
@FindBy(xpath="//a[text()='BUY NOW']")
WebElement BuyNow;

@FindBy(xpath="//input[contains(@data-reactid,'.3.0.0.0.1')]")
WebElement name;
@FindBy(xpath="//input[contains(@data-reactid,'.3.0.0.1.1')]")
WebElement email;
@FindBy(xpath="//input[contains(@data-reactid,'.3.0.0.2.1')]")
WebElement phonenumber;
@FindBy(xpath="//input[contains(@data-reactid,'.3.0.0.3.1')]")
WebElement city;
@FindBy(xpath="//textarea[@data-reactid='.0.0.1.0.3.0.0.4.1.0']")
WebElement address;
@FindBy(xpath="//input[contains(@data-reactid,'.3.0.0.5.1')]")
WebElement postalcode;
@FindBy(xpath="//div[text()='CHECKOUT']")
WebElement checkout;
@FindBy(xpath="//iframe[@id='snap-midtrans']")
WebElement contin;

public  HomePage()
{
		PageFactory.initElements(driver, this);

}
public checkOutPage homePage() throws Exception
{
	BuyNow.click();
	name.clear();
	name.sendKeys("Budi");
	email.clear();
	email.sendKeys("budi@utomo.com");
	phonenumber.clear();
	phonenumber.sendKeys("081808466410");
	city.clear();
	city.sendKeys("jakarta");
	address.clear();
	address.sendKeys("MidPlaza 2, 4th Floor Jl.Jend.Sudirman Kav.10-11");
	postalcode.clear();
	postalcode.sendKeys("10220");
	checkout.click();
	driver.switchTo().frame(contin);
	WebDriverWait wait=new WebDriverWait(driver,120);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button-main-content']"))).click();
	
	//wait.until(ExpectedConditions.elementToBeClickable(contin));
    
  
	
	
	 
	 // Utility.jsScrollIntoView(driver, quantity);
	  //addToCart.click();

	  return new checkOutPage();
}
}
