package Com.TestCase;

import org.testng.annotations.Test;

import Com.Base.TestBase;

public class CheckOutTest extends TestBase
{
	/*
	 * @BeforeMethod public void setUp() { initialization(); checkout = new
	 * checkOutPage(); }
	 */
	@Test
	public void checkouttest() 
	{
		checkout.checkoutpage();
	}
}
