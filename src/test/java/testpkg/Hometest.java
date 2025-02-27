package testpkg;

import org.testng.annotations.Test;

import basepkg.Basecls;
import pagepkg.Homepage;

public class Hometest extends Basecls{

	
	@Test
	public void test() throws InterruptedException
	{
		Homepage ob=new Homepage(driver);
		ob.home();
		ob.category();
		ob.products();
		ob.cartopen();
		
				
	}
	
	
	
	
	
	
	
	
	
	
	
}
