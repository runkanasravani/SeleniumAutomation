package testngAnnotations;

import org.testng.annotations.Test;

public class Dependency {
	@Test (dependsOnMethods = { "OpenBrowser" })
	  public void SignIn() {
		  System.out.println("SignIn code");
	  }

	  @Test
	  public void OpenBrowser() {
		  System.out.println("Open Browser Code");
	  }
	  @Test (dependsOnMethods = { "SignIn" })
	  public void LogOut() 
	  {
		  System.out.println(" In LogOut code");
	  }

 
}
