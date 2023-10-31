package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class css_selector {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        //for maximizing
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //address of email text field using css selecctor
        driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("asdf");
//address of password text field
        driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("asdf");
	}

}
