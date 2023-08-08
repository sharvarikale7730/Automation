package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharv\\Desktop\\My Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		WebElement element = driver.findElement(By.xpath("//div[@class='col']/child::button[@id='promtButton']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element); 
		element.click();
		
		//driver.findElement(By.xpath("//div[@class='col']/child::button[@id='promtButton']")).click();
		
		Thread.sleep(2000);
	
		Alert alert = driver.switchTo().alert();

		System.out.println("Alert message says :" + alert.getText());
		
		Thread.sleep(2000);
		
		alert.sendKeys("Sharvari Kale");
		
		Thread.sleep(2000);
		
		alert.accept();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
