package seleniumexamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium chrome\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://netbanking.hdfcbank.com/netbanking/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   driver.switchTo().frame("login_page");
		   driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]")).click();
		   Alert HdfcAlert=driver.switchTo().alert();
		   String actualResult=HdfcAlert.getText();
		   Thread.sleep(1000);
		   HdfcAlert.accept();
		   //HdfcAlert.dismiss();
		   driver.switchTo().defaultContent();
		   System.out.println(actualResult);
		   String expectedResult = "Customer ID  cannot be left blan.";
		   Assert.assertEquals(expectedResult,actualResult);
		   SoftAssert SoftAssert = new SoftAssert();
		  SoftAssert.assertEquals(actualResult, expectedResult);
		   System.out.println("after assertions");
		 	   	
   	}

}
