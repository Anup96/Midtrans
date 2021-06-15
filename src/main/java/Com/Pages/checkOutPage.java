package Com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.Base.TestBase;

public class checkOutPage extends TestBase
{

@FindBy(xpath="//div[text()='Credit/Debit Card']")
WebElement creditcard;
@FindBy(xpath="//input[@name='cardnumber']")
WebElement cardno;
@FindBy(xpath="//input[@placeholder='MM / YY']")
WebElement expirydate;
@FindBy(xpath="//input[@inputmode='numeric']")
WebElement cvv;
@FindBy(xpath="//iframe[@id='snap-midtrans']")
WebElement frame;



public  checkOutPage()
{
		PageFactory.initElements(driver, this);

}
public PaymentPage checkoutpage()
{
	
	creditcard.click();
	cardno.sendKeys(" 4811 1111 1111 1114");
	expirydate.sendKeys("0522");
	cvv.sendKeys("124");
	
	//driver.switchTo().frame(frame);
	WebDriverWait wait=new WebDriverWait(driver,120);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button-main-content']"))).click();
	
	return new PaymentPage();
}
}
