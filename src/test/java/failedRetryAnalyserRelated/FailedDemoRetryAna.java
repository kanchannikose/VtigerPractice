package failedRetryAnalyserRelated;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedDemoRetryAna {
	
	@Test
	public void test1()
	{
		System.out.println("I am inside Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("I am inside Test2");
		int i=1/0;   //for intentionally failing
	}
	/*
	@Test(retryAnalyzer = vtiger.genericUtilities.RetryAnalyzer.class)
	public void test3()
	{
		System.out.println("I am inside Test3");
	    Assert.assertTrue(0>1);   //for intentionally failing
	} 
*/

}
