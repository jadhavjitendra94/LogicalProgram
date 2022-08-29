package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		driver.switchTo().frame(frame);
		WebElement img1=driver.findElement(By.xpath("//img[@alt=\"The peaks of High Tatras\"]"));
		WebElement img2=driver.findElement(By.xpath("//img[@alt=\"The chalet at the Green mountain lake\"]"));
		WebElement img3=driver.findElement(By.xpath("//img[@alt=\"Planning the ascent\"]"));
		WebElement img4=driver.findElement(By.xpath("//img[@alt=\"On top of Kozi kopka\"]"));
		WebElement Trash=driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(img1, Trash).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(img2, Trash).build().perform();
		Thread.sleep(2000);
		act.moveToElement(img3).clickAndHold().dragAndDrop(img3, Trash).release().build().perform();
		Thread.sleep(2000);
		act.moveToElement(img4).clickAndHold().dragAndDrop(img4, Trash).release().build().perform();
		driver.close();
	}

}
