
package DropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiselect_Dropdown {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// for maximizing
		driver.manage().window().maximize();
		// implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement dD = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s=new Select(dD);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("199");
		Thread.sleep(2000);
		//s.selectByVisibleText("More Than INR 500 ( 55 ) ");
		Thread.sleep(2000);
		System.out.println(s.isMultiple());
		s.deselectByIndex(0);
		Thread.sleep(2000);
		s.deselectByValue("199");
		Thread.sleep(2000);
		//s.deselectByVisibleText("More Than INR 500 ( 55 ) ");
		List<WebElement> selectedValues = s.getAllSelectedOptions();
		for(WebElement b:selectedValues) {
			System.out.println(b.getText());
		}
		
		
		
		
	}

}
