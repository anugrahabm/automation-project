package testpkg;

import org.testng.annotations.Test;

import basepkg.Basecls;
import pagepkg.Checkoutpage;

public class Checkouttest extends Basecls {

	@Test
	public void test() throws InterruptedException
	{
		Checkoutpage ob=new Checkoutpage(driver);
		ob.checkoutclick();
		ob.setvalues("aabs", "bk", "kochi", "kochi","682001", "9497754732", "abc@gmail.com");
	    ob.ordercompletion();
	}
	
	
}
