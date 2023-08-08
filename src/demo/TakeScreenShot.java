package demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class TakeScreenShot 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharv\\Desktop\\My Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		Utilities.captureScreenshot(driver, "Step1_Launch Site");
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement uploadFile =driver.findElement(By.id("uploadfile_0"));
		uploadFile.sendKeys("C:\\Users\\sharv\\Documents\\Sharvari\\QA Study Material\\Sandeep Study Material\\Manual Testing _Software Testing Techniques.pdf");
		Thread.sleep(2000);
		Utilities.captureScreenshot(driver, "Step2_Upload File");
		
		Thread.sleep(2000);
		
		WebElement checkbox= driver.findElement(By.id("terms"));
		Thread.sleep(2000);
		checkbox.click();
		Thread.sleep(2000);
		Utilities.captureScreenshot(driver, "Step3_CheckBox");
		
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.id("submitbutton"));
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(2000);
		Utilities.captureScreenshot(driver, "Step4_Submit");
		driver.close();
		
	}

}
