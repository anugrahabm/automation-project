package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Basecls;
import pagepkg.Loginpage;

public class Logintest extends Basecls {

	
	@Test
	public void test()
	{
		Loginpage ob=new Loginpage(driver);
		ob.setvalues("aass@gmail.com", "Asdfghj@1234");
		ob.login();
	}
	
	public void testurl()
	{
		String exp="https://www.keralaspicesonline.com/my-account/";
		String actual=driver.getCurrentUrl();
		Assert.assertEquals(actual, exp,"incorrect url");
	}
	
	
}
