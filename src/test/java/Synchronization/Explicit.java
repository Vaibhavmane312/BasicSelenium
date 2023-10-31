package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit {

	public static void main(String[] args) {
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalam\\OneDrive\\Desktop\\Batches\\QCO-SOEJVD\\QCO_SOEJVD_M11\\src\\main\\resources\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
		
		// for maximizing
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//explicit
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://www.facebook.com/");
		WebElement emailTf = driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOf(emailTf));
		emailTf.sendKeys("asdfg");
       driver.findElement(By.id("pass")).sendKeys("sdfgh");
       
       WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
       wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
       loginBtn.click();
	}

}
