package seleniumexamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
public class HrmLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium chrome\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.xpath("//button[@type='button']")).click();
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		


	}

}
