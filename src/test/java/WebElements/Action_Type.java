package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Type {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        //for maximizing
        driver.manage().window().maximize();
        //implicit
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("adfg");
        Thread.sleep(3000);
        email.clear();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        
	}

}
