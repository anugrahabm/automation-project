package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {


WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"menu-item-22089\"]/a")
	WebElement myaccount;
	@FindBy(xpath="//*[@id=\"post-22031\"]/div/div/nav/ul/li[7]/a")
	WebElement logout;
	
	public Logoutpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateback()
	{

		driver.navigate().back();
		driver.navigate().back();
	}
	public void logout()
	{
		myaccount.click();
		logout.click();
	}
	
	
	
}
