package objectRepo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import utilitlies.BaseClassEC;

public class FormfillEC extends BaseClassEC{
	public static By fname = By.xpath("//input[@id='firstName']");
	public static By lname =By.xpath("//input[@id='lastName']");
	public static By email=By.xpath("//input[@id='email']");
	public static By un=By.xpath("//input[@id='username']");
	public static By pw=By.xpath("//input[@id='password']");
	public static By ca=By.xpath("//span[contains(text(),'Create account & continue')]");
	
public static void FF(String Fname,String Lname,String Email,String UN,String PW)  {
	EnterTxt(fname,Fname);
	EnterTxt(lname,Lname);
    EnterTxt(email,Email);
    EnterTxt(un,UN);
    EnterTxt(pw,PW);
    click(ca);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
	}
}
