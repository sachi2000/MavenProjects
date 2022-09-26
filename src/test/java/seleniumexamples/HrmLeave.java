package seleniumexamples;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HrmLeave {
	WebDriver driver = new ChromeDriver();

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SACHIN\\chromedriver.exe");
		HrmLeave obj=new HrmLeave();
		obj.login();
		obj.apply();

	}
	void login() 
	{	   
		    driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS) ;
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			driver.findElement(By.linkText("Leave")).click();
			driver.findElement(By.linkText("Apply")).click();
				
	}
	void apply() 
	{
		
		
		  driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
          // driver.findElement(By.xpath("//*[contains(text(),'CAN')]"));
           driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
           driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys("2022-04-25");
           driver.findElement(By.xpath("//textarea")).sendKeys("work from home");
           driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
           driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
       
		
	}
	

}








