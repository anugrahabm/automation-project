package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Basecls;
import pagepkg.Logoutpage;

public class logouttest extends Basecls {

	@Test
	public void test()
	{
	     Logoutpage ob=new Logoutpage(driver);
	     ob.navigateback();
	     ob.logout();
	    		 
	}
	
	public void testlogout()
	{
		String exp="My Account Login";
		String actual=driver.getTitle();
		System.out.println("actual title="+actual);
		Assert.assertEquals(actual, exp,"title verification failed after logout");
	}
	
	
	
	
	
	
	
}
