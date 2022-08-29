package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Selenium2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://is.rediff.com/signup/register");
		System.out.println(driver.getTitle());
		String act="Rediff.com";
		String exp=driver.getTitle();
		if(act.equals(exp))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("test case failed");
		}
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.close();
		

	}

}
