package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String appUrl = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// for maximizing
		driver.manage().window().maximize();
		// implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(appUrl);
		String title = driver.getTitle();
		System.out.println(title);
		wb.getSheet("Sheet1").createRow(6).createCell(0).setCellValue(title);
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
		wb.write(fos);
	}

}
