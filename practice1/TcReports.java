package practice1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TcReports {
	@Test(priority=1,description="This is my first test case")
	public void testCase1()
	{
		System.out.println("This is test case1");
		
	}
	@Test(description="This is second test case")
	public void testCase2()
	{
		System.out.println("This is Test case2");
		Assertion A = new Assertion();
		A.assertEquals(12,13);
	}
	@Test
	public void testCase3()
	{
		System.out.println("This is Test Case3");
	}
	@AfterClass
	public void close()
	{
		System.out.println("This is close method");
	}

}




