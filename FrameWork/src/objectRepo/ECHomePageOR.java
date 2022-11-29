package objectRepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import utilitlies.BaseClassEC;

public class ECHomePageOR extends BaseClassEC{
	public static By website=By.xpath("//input[@placeholder='Search within this category']");
	public static By search =By.xpath("//button[@aria-label='Search']");
	public static By shop=By.xpath("//a[contains(text(),'Shopify')]");
	public static By HandB= By.xpath("//a[contains(text(),'Health & Beauty (148)')]");
	public static By Org1=By.xpath("//img[@title='Organica - Cosmetic, Food, Organic, Beauty Shopify Theme - Sections Ready']");
	public static By ac= By.xpath("//strong[contains(text(),'Add to Cart')]");
	public static By check=By.xpath("//input[@value='Go to Checkout']");

	public static void ecom (String Website) {
		EnterTxt(website,Website);
		click(search);
		click(shop);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		click(HandB);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		click(Org1);
		click(ac);
		click(check);
		}
}	

