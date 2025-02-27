package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"nav-menu-item-5614\"]/a/span")
	WebElement home;
	@FindBy(xpath="//*[@id=\"nav-menu-item-22088\"]/a")
	WebElement productcategory;
	@FindBy(xpath="//*[@id=\"nav-menu-item-5635\"]/a/span")
	WebElement dryfruits;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/ul/li[1]/div[2]/a")
	WebElement product1;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/ul/li[2]/div[2]/a") 
	WebElement product2;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/ul/li[3]/div[2]/a")
	WebElement product3;
	@FindBy(xpath="//*[@id=\"masthead\"]/div[2]/nav[2]/div/a/span[2]")
	WebElement cart;
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void home() 
	{
		home.click();
	}
	public void category()
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(productcategory).perform();
	}
	
	public void products() throws InterruptedException
	{
		dryfruits.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)","");
		 product1.click();
		 product2.click();
		 product3.click();
	}
	public void cartopen()
	{
		cart.click();
	}
	
	
	
	
}
