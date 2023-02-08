package seleniumexamples;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium chrome\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("http://www.aptransport.org/");
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   Actions mouse=new Actions(driver);
		   driver.manage().window().maximize();
		   mouse.moveToElement(driver.findElement(By.linkText("REGISTRATION"))).build().perform();
		   Thread.sleep(1000);
		

	}

}
