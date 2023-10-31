package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class snapdeal {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// for maximizing
		driver.manage().window().maximize();
		// implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a = new Actions(driver);
		a.moveToElement(signIn).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='login']")).click();
		// handling a frame through id attribute
		// driver.switchTo().frame("loginIframe");

		// handling a frame through name attribute
		driver.switchTo().frame("iframeLogin");

		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("sdfgh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='close-pop']")).click();
		//handling normal web page
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("cclothes");
	}

}
