package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTablePrint 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharv\\Desktop\\My Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		// Start the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		int noofRows = rows.size();
		System.out.println("Number of rows are : "+noofRows);
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		int noofColumns = columns.size();
		System.out.println("Number of columns are : "+noofColumns);
		
		/*WebElement tableCell = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[2]/td[4]"));
		System.out.println("The value in the cell is : "+tableCell.getText());*/
		
		for (int i=1;i<=noofRows;i++)
		{
			for (int j=1;j<=noofColumns; j++)
			{
				WebElement tablecell = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(tablecell.getText()+ "  |  ");
				
			}
			System.out.println();
		}
		
	
	}

}
