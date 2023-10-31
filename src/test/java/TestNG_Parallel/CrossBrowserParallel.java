package TestNG_Parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserParallel {
	@Parameters({"browsername"})//write this once after converting to suite file
	@Test
	public void fb(String browser) {
		WebDriver driver;
		if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalam\\OneDrive\\Desktop\\Batches\\QCO-SOEJVD\\QCO_SOEJVD_M11\\src\\main\\resources\\chromedriver.exe");
	         driver=new ChromeDriver();
		}
		else  {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\kalam\\OneDrive\\Desktop\\Batches\\QCO-SOEJVD\\QCO_SOEJVD_M11\\src\\main\\resources\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		// implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

}
