package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksClick 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharv\\Desktop\\My Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		// Start the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");
		
		//WebElement homeLink = driver.findElement(By.linkText("Home"));
		WebElement homeLink = driver.findElement(By.partialLinkText("ome"));
		
		homeLink.click();
		
		 Thread.sleep(3000);
		//driver.close();	
		 driver.quit();
		 //driver.get("https://www.gainwelltechnologies.com/");
		 
		 

	}

}
