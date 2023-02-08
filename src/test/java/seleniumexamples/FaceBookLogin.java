package seleniumexamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium chrome\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("Title of the page=" +title);
		driver.findElement(By.name("email")).sendKeys("runkana sravani");
		driver.findElement(By.name("pass")).sendKeys("9515415969");
		driver.findElement(By.name("login")).click();
        //driver.findElement(By.linkText("Forgotten password?")).click();
        //driver.findElement(By.xpath("//a[@role='button']")).click();
       // driver.close();
		

	}

}
