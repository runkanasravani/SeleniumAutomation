package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HrmForgotPassword {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium chrome\\Chromedriver.exe");
		String expectedResult="Forgot your password?";
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']")).click();
		//driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String actualResult=driver.findElement(By.linkText("Forgot your password?")).getText();
		System.out.println(actualResult);                           
		Assert.assertEquals(actualResult, expectedResult);
		
	}

}
