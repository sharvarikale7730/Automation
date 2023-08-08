package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Utilities 
{

		public static void captureScreenshot(WebDriver driver,String fileName) throws IOException {
		
		TakesScreenshot objshot = (TakesScreenshot) driver;

		// Capture screenshhot in the form of java object

		File objSourceFile = objshot.getScreenshotAs(OutputType.FILE);

		// Creating the file at local

		File objTargetFile = new File("C:\\Users\\sharv\\Desktop\\Evidences\\" + fileName + ".png");

		// Copy captured source image tonewly created file

		Files.copy(objSourceFile, objTargetFile);
		

	}
		public static String readXcelcellValue (int rowno, int cellno) throws IOException
		{
			File objfile = new File("C:\\Users\\sharv\\Desktop\\Evidences\\TestData.xlsx");
			
			//Read the file
			
			FileInputStream objfis = new FileInputStream(objfile);
			
			// Read the sheet from the book and then read the cell from the Row Apache POI class
			
			Workbook objbook  =  new XSSFWorkbook(objfis);
			
			String cellText = objbook.getSheet("Sheet1").getRow(rowno).getCell(cellno).toString();
			
			return cellText;
		}
		
		public static String getValue(String key) throws IOException
		{
			//open file
			File openFile = new File("C:\\Users\\sharv\\workspace\\MYSeleniumProject1\\AppConfig\\config.properties");
			
			//Read the file
			FileInputStream objread = new FileInputStream(openFile);
			
			//Read properties
			Properties properties = new Properties();
			
			properties.load(objread);
			
			return properties.getProperty(key);
		}

}
