package seleniumexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SACHIN\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		//Prepare the path of excel file
		String filePath="C:\\Training";
		String fileName="Doc.xlsx";
		String sheetName="Sheet1";
		//Create an object of File class to open xlsx file

	    File file = new File(filePath+"\\"+fileName);
	    
	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook workBook = null;

	    //Find the file extension by splitting file name in substring  and getting only extension name

	    String fileExtensionName = fileName.substring(fileName.indexOf("."));

	    //Check condition if the file is xlsx file

	    if(fileExtensionName.equals(".xlsx")){

	    //If it is xlsx file then create object of XSSFWorkbook class

	    	workBook = new XSSFWorkbook(inputStream);

	    }

	    //Check condition if the file is xls file

	    else if(fileExtensionName.equals(".xls")){

	        //If it is xls file then create object of HSSFWorkbook class

	    	workBook = new XSSFWorkbook(inputStream);

	    }

	    //Read sheet inside the workbook by its name

	    Sheet sheet = workBook.getSheet(sheetName);

	    //Find number of rows in excel file

	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    System.out.println("Row count " +rowCount);

	    //Create a loop over all the rows of excel file to read it
	    Row row=sheet.getRow(1);
	    String  username=row.getCell(0).getStringCellValue();
	    String  password=row.getCell(1).getStringCellValue();
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username); 
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	    

	   
	        }

	  

}



