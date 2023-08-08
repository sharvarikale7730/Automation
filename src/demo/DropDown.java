package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharv\\Desktop\\My Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		// Start the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement countrydropdown = driver.findElement(By.xpath("//select[@name='country']"));
		Select objcountry = new Select(countrydropdown);
		Thread.sleep(3000);
		
		objcountry.selectByVisibleText("UNITED STATES");
		
		for (WebElement options:objcountry.getOptions() )
		{
			System.out.println(options.getText());
		}
		driver.close();
	}

}
