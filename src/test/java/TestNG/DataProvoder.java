package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvoder {
	
	
@DataProvider	
public Object[][] getdata() {
	Object[][] a=new Object[3][2];
	a[0][0]="sasi";
	a[0][1]="kala";
	
	a[1][0]="selenium";
	a[1][1]="trainer";
	
	a[2][0]="Q Spider";
	a[2][1]="Banglore";
	
	return a;
	
}	
	@Test(dataProvider="getdata")
	public void demo(String username,String password) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// for maximizing
		driver.manage().window().maximize();
		// implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		
		
	}
	
}


