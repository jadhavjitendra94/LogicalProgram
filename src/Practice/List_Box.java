package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Box {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://is.rediff.com/signup/register");
		
		  WebElement day = driver.findElement(By.xpath("//select[@name=\"date_day\"]"));
		  day.click();
		 
		  Select d=new Select(day);
		
		  System.out.println(day.isDisplayed());
		  System.out.println(day.isSelected());
		  System.out.println(day.isEnabled());
		  List< WebElement >option=d.getOptions();
		 List<WebElement > data=d.getAllSelectedOptions();
		 for(int a=0;a<data.size();a++)
		 {
			 System.out.println(data.get(a).getText());
		 }
		  for(int a=0;a<option.size();a++)
		  {
			  
			  System.out.println(option.get(a).getText());
		  }
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		

	}

}
