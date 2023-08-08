package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardKeys 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharv\\Desktop\\My Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		
		//Mouse hover 
		
		WebElement searchmike = driver.findElement(By.xpath("//div[@aria-label='Search by voice']"));
		
		Actions objaction = new Actions(driver);
		
		Thread.sleep(5000);
		
		objaction.moveToElement(searchmike).build().perform();
		
		Thread.sleep(3000);
		
		//Keyboard function
		
		WebElement googlesearch = driver.findElement(By.name("q"));
		googlesearch.sendKeys("Selenium");
		
		for (int i=0 ; i<=9 ; i++)
		{
			Thread.sleep(1000);
			objaction.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(1000);		
		}
		for (int j=0 ; j<=9 ; j++)
		{
			Thread.sleep(1000);
			objaction.sendKeys(Keys.ARROW_UP).build().perform();
			Thread.sleep(1000);		
		}
		objaction.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		driver.close();

	}

}
