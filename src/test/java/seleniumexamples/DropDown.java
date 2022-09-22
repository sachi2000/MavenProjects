package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SACHIN\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sachin"); 
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("M B");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("mbsachin2000@gmail.com"); 
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("mbsachin2000@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Sac@12mb");
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		WebElement day= driver.findElement(By.xpath("birthday_day"));
		Select select= new Select(day);
		select.selectByVisibleText("11");
		WebElement month= driver.findElement(By.name("birthday_month"));
		Select select1= new Select(month);
		select1.selectByVisibleText("Feb");
		WebElement Year= driver.findElement(By.name("birthday_year"));
		Select select2= new Select(Year);
		select2.selectByVisibleText("2000");
		//driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		
	
	}

}






