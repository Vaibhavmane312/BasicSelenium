package locators;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//fetch all the links in a webpage
public class tagName {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 Thread.sleep(3000);
		 for(WebElement b:allLinks) {
			 System.out.println(b.getText());
		 }
		
	}

}
