package testngAnnotations;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups="Regression")
	void testCase1()
	{
		System.out.println("In Test Case 1- Regression");
	}
	@Test(groups="Smoke")
	void testCase2()
	{
		System.out.println("In Test Case 2- Smoke");
	}
	@Test(groups= {"Regression","Smoke"})
	void testCase3()
	{
		System.out.println("In Test Case 3- Regression and Smoke");
	}
	@Test(enabled=false)
	void testCase4()
	{
		System.out.println("Inside test case 4");
	}

}
