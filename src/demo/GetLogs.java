package demo;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLogs 
{

	public static void main(String[] args) 
	{
		PropertyConfigurator.configure("C:\\Users\\sharv\\workspace\\MYSeleniumProject1\\AppConfig\\log4j.properties");
		Logger objlog = Logger.getLogger("devpinoyLogger");
		
		objlog.info("Starting the Chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharv\\Desktop\\My Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		objlog.info("Start Google");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		objlog.info("Maximise the windows");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		objlog.info("Close the webbrowser");
		driver.close();

	}

}
