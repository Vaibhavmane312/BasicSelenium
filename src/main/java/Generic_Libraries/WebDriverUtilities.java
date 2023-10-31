package Generic_Libraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtilities {
	//Handling doubleClick
	public void doubleclick(WebDriver driver,WebElement ele){
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
		}
	
	//Handling RightClick
	public void rightClick(WebDriver driver,WebElement ele){
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
		}
	
//Handling Screen shots
	public void ss(WebDriver driver) throws Throwable {
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File src=ts.getScreenshotAs(OutputType.FILE); 
		 File dest=new File("./Snaps/flipkart.png");
		 FileUtils.copyFile(src,dest);
	}
	//handling Property file
	public String propertyFile(String key) throws Throwable {
		Properties p =new Properties(); 
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties"); 
		p.load(fis);
		return p.getProperty(key);
		
	}
	
	
	
	
	
	

}
