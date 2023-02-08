package seleniumexamples;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoboClass {

		public static void main(String[] args) throws AWTException, InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/");	
	        driver.findElement(By.name("email")).clear();
	        driver.findElement(By.name("email")).sendKeys("runkana sravani");
	        driver.findElement(By.name("pass")).clear();
	        driver.findElement(By.name("pass")).sendKeys("9515415969");
	        Robot robot = new Robot();  // Robot class throws AWT Exception	
	        Thread.sleep(2000); // Thread.sleep throws InterruptedException	
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	    // press enter key of keyboard to perform above selected action

		}

	}





