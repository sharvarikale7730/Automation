package demo;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CloseMultipleWindows 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharv\\Desktop\\My Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String parentwindowHandle = driver.getWindowHandle();
		System.out.println("Parent window handle is : "+ parentwindowHandle);
		
		WebElement newWindow = driver.findElement(By.xpath("//button[@id='windowButton']"));
		
		for (int i=1 ; i<=5 ; i++)
		{
			Thread.sleep(1000);
			newWindow.click();
			Thread.sleep(1000);
		}
		
		Set<String> listofHandles = driver.getWindowHandles();
		System.out.println("All Windows includind child windows : "+listofHandles);
		
		for (String handle:listofHandles)
		{
			if (!handle.equalsIgnoreCase(parentwindowHandle))
			{
				driver.switchTo().window(handle);
				driver.get("https://www.google.com/");
				Thread.sleep(1000);
				driver.close();
			}
		}
		

	}

}
