package Baasic_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation1 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        //for maximizing
        driver.manage().window().maximize();
        
        
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.in/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.close();
	}

}
