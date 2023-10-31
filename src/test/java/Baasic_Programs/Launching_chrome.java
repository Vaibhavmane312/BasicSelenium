package Baasic_Programs;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launching_chrome {

	public static void main(String[] args) {
		//for 116 and 117 versions of chrome this will not work
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalam\\OneDrive\\Desktop\\Batches\\QCO-SOEJVD\\QCO_SOEJVD_M11\\src\\main\\resources\\chromedriver.exe");
         ChromeDriver driver=new ChromeDriver();
	}

}
