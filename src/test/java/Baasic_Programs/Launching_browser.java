package Baasic_Programs;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Launching_browser {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		
		EdgeDriver driver=new EdgeDriver();

	}

}
