package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartChrome
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharv\\Desktop\\My Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		// Start the browser
		WebDriver driver = new ChromeDriver();
		 driver.get("https://google.com/");
		 Thread.sleep(5000);
		 
		 driver.get("https://www.w3schools.com/sql/sql_select.asp");
		 Thread.sleep(2000);
		
		 driver.close();
	}

}
