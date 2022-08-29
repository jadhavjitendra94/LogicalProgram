package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://is.rediff.com/signup/register");
		WebElement tagname = driver.findElement(By.xpath("//input[@id=\"college\"]"));
		System.out.println(tagname.getAttribute("name"));
		System.out.println(tagname.getAttribute("tagname"));
		System.out.println(tagname.getAttribute("tagname"));
		System.out.println(tagname.getDomAttribute("name"));
		System.out.println(tagname.getAttribute("id"));
		System.out.println(tagname.getAttribute("type"));
		WebElement location=driver.findElement(By.xpath("//input[@name=\"city\"]"));
		System.out.println(location.isDisplayed());
		Thread.sleep(2000);
		System.out.println(location.isSelected());
		Thread.sleep(2000);
		System.out.println(location.isEnabled());
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
