package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        //for maximizing
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //address of email text field using xpath attribute
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("asdf");
//address of password textfield
        driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("asdfg");
	//address of create a page using x path text
        //driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
        
      //address of create a page using x path  contains text
        driver.findElement(By.xpath("//a[contains(text(),'Create a ')]")).click();
	
	}

}
