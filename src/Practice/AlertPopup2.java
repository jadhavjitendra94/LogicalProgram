package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement AlertWithOk=driver.findElement(By.xpath("//a[@href=\"#OKTab\"]"));
		AlertWithOk.click();
		WebElement okButton = driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
		okButton.click();
		Alert popup=driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.accept();
		WebElement AlertWithOkButton = driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]"));
		AlertWithOkButton.click();
		WebElement button2 = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]"));
		button2.click();
		Alert popup2 = driver.switchTo().alert();
		System.out.println(popup2.getText());
		popup2.accept();
		WebElement alertwithText = driver.findElement(By.xpath("//a[@href=\"#Textbox\"]"));
		alertwithText.click();
		WebElement button3 = driver.findElement(By.xpath("//button[text()=\"click the button to demonstrate the prompt box \"]"));
		button3.click();
		Alert popup3 = driver.switchTo().alert();
		popup3.sendKeys("jitendra");
		System.out.println(popup.getText());
		popup3.accept();
		WebElement message = driver.findElement(By.xpath("//p[@id=\"demo1\"]"));
		System.out.println(message.getText());
		driver.close();
		
	}

}
