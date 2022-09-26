package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgExample {
	private static WebDriver driver = null;
	

	
  @Test(priority=0)
  public void login() throws InterruptedException {
	  
	    System.setProperty("webdriver.chrome.driver", "C:\\SACHIN\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(1000);
			
			
			
  }
  @Test(priority=1)
  public void search() throws InterruptedException
  {
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    
        driver.findElement(By.xpath("//div[2]/input")).click();
        driver.findElement(By.xpath("//div[2]/input")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Ranjitha");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  @Test(priority=2)
  public void apply() throws InterruptedException {
	  
	  
	  driver.findElement(By.linkText("Leave")).click();
	  driver.findElement(By.linkText("Apply")).click();
      driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
      driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
      driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys("2022-04-25");
      driver.findElement(By.xpath("//textarea")).sendKeys("work from home");
      driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
      Thread.sleep(1000);
		  
  }
  
  
  
  @Test(priority=3)
  public void logout() throws InterruptedException {
	  driver.findElement(By.xpath("//li//span[@class='oxd-userdropdown-tab']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.linkText("Logout")).click();
	      
  }
  
}


