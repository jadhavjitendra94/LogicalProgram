package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggaation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in/");
		WebElement Search=driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		Search.sendKeys("narendra");
		List<WebElement> Auto = driver.findElements(By.xpath("//div[@class=\"mkHrUc\"]//ul//li"));
		System.out.println(Auto.size());
		for(int a=0;a<Auto.size();a++)
		{
			System.out.println(Auto.get(a).getText());
			String act="Narendra Modi\n"
					+ "Prime Minister of India";
			String exp=Auto.get(a).getText();
			if(act.equals(exp))
			{
				Auto.get(a).click();
				break;
				
			}
		}
		driver.close();
	}

}
