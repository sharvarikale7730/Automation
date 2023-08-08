package demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAutomation 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", Utilities.getValue("ChromeDriverPath"));

		// Start the browser
		WebDriver driver = new ChromeDriver();
		 driver.get(Utilities.getValue("appURL2"));
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		 
		 WebElement fullnameField = driver.findElement(By.id("userName"));
		 fullnameField.sendKeys(Utilities.readXcelcellValue(2, 2));
		 
		 WebElement emailField = driver.findElement(By.id("userEmail"));
		 emailField.sendKeys(Utilities.readXcelcellValue(2, 3));
		 
		 WebElement currentaddressField = driver.findElement(By.id("currentAddress"));
		 currentaddressField.sendKeys(Utilities.readXcelcellValue(2, 4));
		 
		 WebElement permanentAddressField = driver.findElement(By.id("permanentAddress"));
		 permanentAddressField.sendKeys(Utilities.readXcelcellValue(2, 5));
		 
		 Thread.sleep(5000);
		 
		 WebElement submitButton = driver.findElement(By.id("submit"));
		 submitButton.click();
		 
		 Thread.sleep(5000);
		 
		 driver.close();
		
	}

}
