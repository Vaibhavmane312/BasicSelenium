package Autosuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// for maximizing
		driver.manage().window().maximize();
		// implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("phone");
		Thread.sleep(3000);
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//li[@data-view-type='1']"));
		Thread.sleep(3000);
		for (WebElement b : autoSuggestions) {
			System.out.println(b.getText());
		}
	}

}
