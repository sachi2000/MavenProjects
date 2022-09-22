package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SACHIN\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:/Training/WebTable.html");
		//below code excute the checkbox of selenium in 5 row and 1 column
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]/input")).click();

	}

}
