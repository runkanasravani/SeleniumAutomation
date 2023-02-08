package testngAnnotations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCases {
@Test(priority=2)
void hrmLogin()
{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\Chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https:\\opensource-demo.orangehrmlive.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//driver.findElement(By.xpath("//button[@type='button']")).click();
}
@Test(priority=1)
void resetPassword()
{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\Chromedriver.exe");
	//String expectedResult="Forgot your password?";
	WebDriver driver=new ChromeDriver();
	driver.get("https:\\opensource-demo.orangehrmlive.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']")).click();
	//driver.findElement(By.xpath("//button[@type='button']")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//String actualResult=driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']")).getText();
	//Assert.assertEquals(actualResult, expectedResult);
	
}
@Test(priority=0)
void webTable()
{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\Chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\selenium programs\\WebTable.html");
	driver.manage().window().maximize();
	String before_xpath = "//table/tbody/tr[";
	String after_xpath="]/td[2]";
	List rows =driver.findElements(By.xpath("//table/tbody/tr"));
	int rowSize=rows.size();
	System.out.println("RowSize =" +rowSize);
	for(int i=2;i<=rowSize;i++)
	{
		String FirstNames=driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
		System.out.println("FirstName=" +FirstNames);
		  if(FirstNames.contains("Ashok")) {
			  driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[1]/input")).click();
			  System.out.println("candidate has been selected");
			  break;
}
}
}
}