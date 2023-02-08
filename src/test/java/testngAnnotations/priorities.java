package testngAnnotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class priorities {
	@Test(priority =1)
	void login()
	{
		System.out.println("Login code");
	}
	
	@Test(priority=0)
	void registerAccount()
	{
		System.out.println("Register account code");
	}
	@Test(priority=2)
	void sendEmail()
	{
		System.out.println("Send email code");
	}
	@Test(enabled=false)
	void HrmLogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		SoftAssert softassert=new SoftAssert();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		String expectedResult="Dashboard";
		String actualResult=driver.findElement(By.linkText("Dashboard")).getText();
		softassert.assertEquals(actualResult, expectedResult);

}
}
