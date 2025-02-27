package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {


WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"username\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"password\"]") 
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
	WebElement loginbttn;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void setvalues(String user,String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
	}
	
	public void login()
	{
		loginbttn.click();
	}
	
	
	
	
}
