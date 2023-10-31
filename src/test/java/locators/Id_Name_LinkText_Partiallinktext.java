package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Name_LinkText_Partiallinktext {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        //for maximizing
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //address of email textfield
        driver.findElement(By.id("email")).sendKeys("sasi");
        Thread.sleep(3000);
        //address of password webelement
        driver.findElement(By.name("pass")).sendKeys("kala");
        Thread.sleep(3000);
        //address of forgetten password
        //driver.findElement(By.linkText("Forgotten password?")).click();
        driver.findElement(By.partialLinkText("Forgotten")).submit();

	}
}
