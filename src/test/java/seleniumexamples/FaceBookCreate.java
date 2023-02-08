package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FaceBookCreate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium chrome\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D20465%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiAvK2bBhB8EiwAZUbP1NPf0LjwGtYvwsab0TykHfSdKwYRtaEo8q4gHsWbwyAezJl4dkNuhBoCsnAQAvD_BwE");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("sravani");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("k");
		driver.findElement(By.name("reg_email__" )).sendKeys("runkanasravani@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("runkanasravani@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("789021");
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select sel=new Select(day);
		 sel.selectByVisibleText("16");
		 WebElement month=driver.findElement(By.name("birthday_month"));
		 Select sel2=new Select(month);
		 sel2.selectByIndex(9);
		 WebElement year=driver.findElement(By.name("birthday_year"));
		 Select sel3=new Select(year);
		 sel3.selectByVisibleText("1997");
		 
		//driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("16");
		//driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("sep");
		//driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1997");
		//driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		driver.findElement(By.name("websubmit")).click();
	}

}
