package testCases;

import org.testng.annotations.Test;
import objectRepo.FormfillEC;
import objectRepo.ECHomePageOR;
import utilitlies.BaseClassEC;

public class TC5ec extends BaseClassEC {
	@Test(priority = 1)
	public void preSetup() {
		openBrowser("chrome");
		driver.manage().window().maximize();
		openbaseurl();
		}
	@Test(priority=2)
	public void Ecom() {	
		ECHomePageOR.ecom("Ecommerece");
		}
	@Test(priority=3)
	public void navigatetoFormfillEC() {
		FormfillEC.FF("adithiyan", "parthiban","maalathi@mail.com", "malathi123456", "Malathi225227");		
   }
     }