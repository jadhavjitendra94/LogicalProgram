package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		WebElement openpopup = driver.findElement(By.xpath("//input[@value=\"Open Popup\"]"));
		openpopup.click();
		Set<String> window = driver.getWindowHandles();
		System.out.println(window.size());
		Iterator itr=window.iterator();
		String win[]=new String[5];
		for(int a=0;a<window.size();a++)
		{
			win[a]=(String) itr.next();
			System.out.println(win[a]);
			
		}
		driver.switchTo().window(win[0]);
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.switchTo().window(win[1]);
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
	}

}
