package testngAnnotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
  @BeforeSuite
  void method1()
  {
	  System.out.println("inside before suite");
  }
  @AfterSuite
  void method2()
  {
	  System.out.println("Inside after suite");
  }
  @BeforeTest()
  void method3()
  {
	  System.out.println("Inside before test");
  }
  @AfterTest()
  void method4()
  {
	  System.out.println("Inside after test");
  }
  @BeforeGroups
  void method5()
  {
	  System.out.println("Inside before groups");
  }
  @AfterGroups
  void method6()
  {
	System.out.println("Inside after groups"); 
  }
  @BeforeClass
    void method7()
    {
	  
	  System.out.println("Inside before class");
    }
  @AfterClass
  void method8()
  {
	  
	  System.out.println("Inside after class");
  }
  @BeforeMethod
    void beforeMethod()
    {
	  System.out.println("Inside before method");
    }
  @AfterMethod
  void afterMethod()
  {
	  System.out.println("Inside after method");
  }
  @Test(enabled=false)
  void HRMLogin()
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
  
	  
  @Test
  void HrmForgotPassword()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']")).click();
		//driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
  }
}
