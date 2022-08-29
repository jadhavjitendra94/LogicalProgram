package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.switchTo().frame("iframeResult");
		WebElement button1 = driver.findElement(By.xpath("//button[@type=\"button\"]"));
		button1.click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		WebElement home = driver.findElement(By.xpath("//a[@id=\"tryhome\"]"));
		home.click();

	}

}
