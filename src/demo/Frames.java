package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharv\\Desktop\\My Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.switchTo().frame("a077aa5e");
		WebElement jmeter = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		jmeter.click();
		
		driver.switchTo().defaultContent();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='philadelphia-field-email']"));
		email.sendKeys("sharvarikale@gmail.com");
		
		

	}

}
