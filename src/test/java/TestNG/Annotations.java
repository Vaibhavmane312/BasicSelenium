package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations {
	WebDriver driver;
	@Test
	public void fb() {
	driver.get("https://www.facebook.com/");	
	}
	@Test
	public void amazon() {
	driver.get("https://www.amazon.in/");	
	}
@BeforeMethod
public void opening() {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	// for maximizing
	driver.manage().window().maximize();
	// implicit
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@AfterMethod
public void quit() throws Throwable {
	Thread.sleep(3000);
	driver.close();
}




}
