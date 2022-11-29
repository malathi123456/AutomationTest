package utilitlies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClassEC {
	public static WebDriver driver;
	
	public static void openBrowser(String browserName)  {
			
			if(browserName.equalsIgnoreCase("chrome"))
		
			{
				System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\drivers\\\\Chromedriver106.exe");
				driver=new ChromeDriver();
				System.out.println(browserName+ "browser is up and running");
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.firefox.driver","\"C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe\"");
			driver=new FirefoxDriver();
			System.out.println(browserName+ "browser is up and running");
			
				}		
			else if(browserName.equalsIgnoreCase("internetExplore"))
			{
				System.setProperty("webdriver.internetExplore.driver","\"C:\\Program Files\\Internet Explorer\\iexplore.exe\"");
			driver=new InternetExplorerDriver();
			System.out.println(browserName+"browser is up and running");
			
		}
			else
			{
				System.out.println("unable to launch"+browserName+":- invalid input!");
				
			}
			
		}


	public static void openbaseurl() {
		try
		{
		driver.get("https://themeforest.net/category/ecommerce");
				System.out.println("your application is running");
		}catch(Exception e) {
			System.out.println("unable to open url"+e.getMessage());
		}
			
			
		}

	public static  void navigateURL(String url) {
		try
		{
		driver.get(url);
				System.out.println(" application is up and running");
		}catch(Exception e) {
			System.out.println("unable to open url"+e.getMessage());
		}
		
	}

	public static void shutdown() {


			driver.quit();
			System.out.println("shutdown the driver");	
		}

	public static void waitImplicit(int time) {
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}

	public static void urlvalidation(String expectedURL) {
		String actualURL=driver.getCurrentUrl();
		System.out.println("Current URl is:"+actualURL);
		System.out.println("Expected URl is:"+expectedURL);
		boolean result=actualURL.equalsIgnoreCase(expectedURL);
		System.out.println("validation result is:"+result);
	}

	public static void titlevalidation(String expectedTitle) {
		String actualtitle=driver.getTitle();
		System.out.println("Current URl is:"+actualtitle);
		System.out.println("Expected URl is:"+expectedTitle);
		boolean result=actualtitle.equalsIgnoreCase(expectedTitle);
		System.out.println("validation result is:"+result);
	}

	public static  void click( String locValue) {
			try {
				driver.findElement(By.xpath(locValue)).click();
				System.out.println("click element-locvalue"+locValue);
			}
			catch(Exception e) {
			System.out.println(" unable to click element-locvalue"+locValue);
		}
		}

	public static  void click( By locValue) {

			try {
				driver.findElement(locValue).click();
				System.out.println("click element-locvalue"+locValue);
			}
			catch(Exception e) {
			System.out.println(" unable to click element-locvalue"+locValue);
		}
		}

	public static  void click(WebElement element) {

			try {
				element.click();
				System.out.println("click element-locvalue"+element);
			}
			catch(Exception e) {
			System.out.println(" unable to click element-locvalue"+element);
		}
		}

	public static void EnterTxt(String locValue,String data) {
			try {
				driver.findElement(By.xpath(locValue)).clear();
				driver.findElement(By.xpath(locValue)).sendKeys(data);
				System.out.println("enter the data"+data +"-into the text box have the locvalue"  +locValue);
			}
			catch(Exception e) {
			System.out.println(" unable to enter element-locvalue"+locValue);
		}	
		}

	public static void EnterTxt(By locValue,String data) {
			try {
				driver.findElement(locValue).clear();
				driver.findElement(locValue).sendKeys(data);
				System.out.println("enter the data"+data +"-into the text box have the locvalue"  +locValue);
			}
			catch(Exception e) {
			System.out.println(" unable to element-locvalue"+locValue);
		}
			
		}

	public static  void EnterTxt(WebElement element,String data) {

		try {
			element.clear();
			element.sendKeys(data);
			System.out.println("enter the data"+data +"-into the text box have the locvalue"  +data);
		}
		catch(Exception e) {
		System.out.println(" unable to enter"+data);
	}
	}

	public static void select(By locName, String data) {
		try {
			new Select(driver.findElement(locName)).selectByVisibleText(data);
			System.out.println("select the data"+data +"Using:"  +locName);
			}
			catch(Exception e) {
			System.out.println(" unable to select the data"+data +"Using:"  +locName);
			
		}
			
		}

	public static void select(By locName, int indexno) {
		try {
			new Select(driver.findElement(locName)).selectByIndex(indexno);
			System.out.println("select the option of index position"+indexno+"Using:"  +locName);
			}
			catch(Exception e) {
			System.out.println(" unable to select the option of index position"+indexno +"Using:"  +locName);
			
		}	
	}

	public static void alertAction(String action) {
		try {
			if(action.equalsIgnoreCase("ok")) {
				System.out.println("thanks for submitting the information");
				driver.switchTo().alert().accept();
			}
				else if(action.equalsIgnoreCase("cancel"))	{
					driver.switchTo().alert().dismiss();
				}}
		catch(Exception e) {
			System.out.println(" error is performing the alert box"+action);
		}
									
					
				}

}
