package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharv\\Desktop\\My Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement uploadFile =driver.findElement(By.id("uploadfile_0"));
		Thread.sleep(2000);
		uploadFile.sendKeys("C:\\Users\\sharv\\Documents\\Sharvari\\QA Study Material\\Sandeep Study Material\\Manual Testing _Software Testing Techniques.pdf");
		
		Thread.sleep(2000);
		
		WebElement checkbox= driver.findElement(By.id("terms"));
		Thread.sleep(2000);
		checkbox.click();
		
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.id("submitbutton"));
		Thread.sleep(2000);
		submit.click();
		
		
	}

}
