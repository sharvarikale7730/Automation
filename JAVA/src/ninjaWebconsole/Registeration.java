package ninjaWebconsole;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registeration 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharv\\Desktop\\My Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println("Browser open");
		driver.navigate().to("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement myAccount = driver.findElement(By.xpath("//span[@class='caret']"));
		myAccount.click();
		
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='input-firstname']"));
		firstname.sendKeys("William");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@id='input-lastname']"));
		lastname.sendKeys("Turner");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='input-email']"));
		email.sendKeys("williamturner@gmail.com");
		
		WebElement contactnum = driver.findElement(By.xpath("//input[@id='input-telephone']"));
		contactnum.sendKeys("9997642847");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.sendKeys("W!lliam32");
		
		WebElement confirmpassword = driver.findElement(By.xpath("//input[@id='input-confirm']"));
		confirmpassword.sendKeys("W!lliam32");
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@name='agree']"));
		checkbox.click();
		
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
	
		Thread.sleep(2000);
		
		driver.close();
	}

}
