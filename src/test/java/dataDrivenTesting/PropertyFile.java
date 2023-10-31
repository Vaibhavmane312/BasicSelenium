package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFile {

	public static void main(String[] args) throws Throwable {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
		p.load(fis);
		String appUrl = p.getProperty("url");
		String user = p.getProperty("username");
		String pass = p.getProperty("password");
		String brow = p.getProperty("browser");
		WebDriver driver;
		if(brow.equals("edge")) {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalam\\OneDrive\\Desktop\\Batches\\QCO-SOEJVD\\QCO_SOEJVD_M11\\src\\main\\resources\\chromedriver.exe");
	         driver=new ChromeDriver();
		}
// for maximizing
		driver.manage().window().maximize();
// implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(appUrl);
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.name("pass")).sendKeys(pass);
		
		
		
		
		
		
	}

}
