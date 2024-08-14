package listners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginLisTest {
	
	@Test (enabled=false)
	public void loginbyEmail()
	{
		System.out.println("login by email");
		Assert.assertEquals("admin", "admin"); //true
	}
	@Test
	public void loginbyFacebbok()
	{
		System.out.println("login by facebook");
		Assert.assertEquals("admin@", "admin@"); //true
	}

}
