package seleniumexamples;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MethodOverloadingHrm {
	WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SACHIN\\chromedriver.exe");
		MethodOverloadingHrm obj=new MethodOverloadingHrm();
		obj.login();
	    obj.search("Admin");
		obj.search("Admin","Paul Collings");
	}
	void login() 
	{	   
		    driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS) ;
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			driver.findElement(By.xpath("//span")).click();		
	}
	void search (String username)
	{
		driver.findElement(By.xpath("//form/div/div/div/div/div/input")).sendKeys(username);
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	}
	void search (String username,String empname)
	{  
		driver.findElement(By.xpath("//span")).click();
		driver.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(empname);
		driver.findElement(By.xpath("//button[@type='submit']")).click();		
	}
	
}
