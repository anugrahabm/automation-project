package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {

	 WebDriver driver;
		
		@FindBy(xpath="//*[@id=\"shoptimizerCartDrawer\"]/button")
		WebElement closecartbutton;
		@FindBy(xpath="//*[@id=\"menu-item-22091\"]/a/div")
		WebElement checkout;
		@FindBy(xpath="//*[@id=\"billing_first_name\"]")
		WebElement firstname;
		@FindBy(xpath="//*[@id=\"billing_last_name\"]")
		WebElement lastname;
		@FindBy(xpath="//*[@id=\"billing_address_1\"]")
		WebElement address;
		@FindBy(xpath="//*[@id=\"billing_city\"]")
		WebElement city;
		@FindBy(xpath="//*[@id=\"billing_postcode\"]")
		WebElement pincode;
		@FindBy(xpath="//*[@id=\"billing_phone\"]")
		WebElement phoneno;
		@FindBy(xpath="//*[@id=\"billing_email\"]")
		WebElement email;
		@FindBy(xpath="//*[@id=\"ship-to-different-address-checkbox\"]")
		WebElement shipaddress;
		@FindBy(xpath="//*[@id=\"payment\"]/ul/li[4]/label")
		WebElement payment;
		@FindBy(xpath="//*[@id=\"terms\"]")
		WebElement termsandcondition;
		@FindBy(xpath="//*[@id=\"place_order\"]")
		WebElement placeorder;
		
		
		public Checkoutpage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		public void checkoutclick()
		{
			closecartbutton.click();
			checkout.click();
		}
		
		public void setvalues(String fname,String lname,String Address,String City, String Pin, String no,String mailid)
		{
			firstname.clear();
			firstname.sendKeys(fname);
			lastname.clear();
			lastname.sendKeys(lname);
			address.clear();
			address.sendKeys(Address);
			city.clear();
			city.sendKeys(City);
			pincode.clear();
			pincode.sendKeys(Pin);
			phoneno.clear();
			phoneno.sendKeys(no);
			email.clear();
			email.sendKeys(mailid);
			
		}
		
		
		
		public void ordercompletion() throws InterruptedException
		{
			 JavascriptExecutor js1 = (JavascriptExecutor) driver;

			   
			    if (shipaddress.isSelected()) {
			        js1.executeScript("arguments[0].click();", shipaddress);
			    }

			JavascriptExecutor js = (JavascriptExecutor) driver;
			 
		    js.executeScript("arguments[0].scrollIntoView(true);", termsandcondition);
		    Thread.sleep(1000);
		    js.executeScript("arguments[0].click();", termsandcondition);

		    
		    js.executeScript("arguments[0].scrollIntoView(true);", placeorder);
		    Thread.sleep(1000);
		    js.executeScript("arguments[0].click();", placeorder);
		}
		
	
}
