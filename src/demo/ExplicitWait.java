package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharv\\Desktop\\My Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement timerbutton = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
		timerbutton.click();
		
		WebElement textElement = driver.findElement(By.id("demo"));
		
		WebDriverWait explicitwait = new WebDriverWait(driver,20);
		
		explicitwait.until(ExpectedConditions.textToBePresentInElement(textElement, "WebDriver"));
		
		System.out.println("Text is : "+textElement.getText());

	}

}
