package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XcelFileRead 
{

	public static void main(String[] args) throws IOException 
	{
		// open the file in read mode
		
		File objfile = new File("C:\\Users\\sharv\\Desktop\\Evidences\\TestData.xlsx");
		
		//Read the file
		
		FileInputStream objfis = new FileInputStream(objfile);
		
		// Read the sheet from the book and then read the cell from the Row Apache POI class
		
		Workbook objbook  =  new XSSFWorkbook(objfis);
		
		String cellText = objbook.getSheet("Sheet1").getRow(3).getCell(2).toString();
		System.out.println(cellText);

	}

}
