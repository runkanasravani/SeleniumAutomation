package seleniumexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
public class WebTable {

	public static void main(String[] args) {
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
