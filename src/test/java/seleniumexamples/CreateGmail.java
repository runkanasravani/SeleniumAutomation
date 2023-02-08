package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateGmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium chrome\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[contains(.,'Create account')]")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[@class='VfPpkd-StrnGf-rymPhb-b9t22c']")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Korada");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("sravani");
        driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("koradasravani16");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sravani1234");
	    driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("sravani1234");
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	   // driver.findElement(By.linkText("Sign in instead")).click();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
	   //driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();

	}

}
