package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPaths 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharv\\Desktop\\My Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		// Start the browser
		WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/text-box");
		 
		 WebElement fullnameField = driver.findElement(By.xpath("//input[@id='userName']"));
		 fullnameField.sendKeys("Sharvari Kale");
		 
		 WebElement emailField = driver.findElement(By.xpath("//input[@id='userEmail']"));
		 emailField.sendKeys("sharvari@gmail.com");
		 
		 WebElement currentaddressField = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		 currentaddressField.sendKeys("Monroe Township USA");
		 
		 WebElement permanentAddressField = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		 permanentAddressField.sendKeys("New Jersey USA");
		 
		 Thread.sleep(5000);
		 
		 WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
		 submitButton.click();
		 
		 Thread.sleep(5000);
		 
		 driver.close();
		 

	}

}
