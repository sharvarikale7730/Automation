package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HoverMouse 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharv\\Desktop\\My Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		
		WebElement searchmike = driver.findElement(By.xpath("//div[@aria-label='Search by voice']"));
		
		Actions objaction = new Actions(driver);
		
		Thread.sleep(5000);
		
		objaction.moveToElement(searchmike).build().perform();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
