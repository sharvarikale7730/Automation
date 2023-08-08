package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveElements
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharv\\Desktop\\My Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		
		List<WebElement> delete= driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
		int countofdelete = delete.size();
		//System.out.println("Number of delete buttons : "+delete.size());
		
		for (int i=1;i<=5;i++)
			{
				WebElement add = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
				add.click();	
			}
		
		Thread.sleep(3000);
		 
		
		for (int j=delete.size() ; j<=1; j--)
			{
				if (countofdelete!=1)
				{
					WebElement deletebutton =driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
					deletebutton.click();
					countofdelete = driver.findElements(By.xpath("//button[@onclick='deleteElement()']")).size();
				}
			}
	
		System.out.println("Number of remaining buttons are : "+ countofdelete);
		Thread.sleep(3000);
		driver.close();
		
		/*WebElement text = driver.findElement(By.xpath("//div[@id='content']//following::h3"));
		System.out.println(text.getText());*/
		
		
		
	     
	}

}
