package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practise 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharv\\Desktop\\My Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		//explicit wait
		
		
		WebElement shirtLink = driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt"));
		
		shirtLink.click();
		
		WebElement addcartButton = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
		WebDriverWait wait = new WebDriverWait(driver, 55);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-sauce-labs-bolt-t-shirt")));
		
		//Thread.sleep(5000);
		
		addcartButton.click();

	}

}
