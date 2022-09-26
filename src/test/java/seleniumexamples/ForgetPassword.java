package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgetPassword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SACHIN\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']/p")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//button")).click();
	     String url=driver.getCurrentUrl();
	     Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     System.out.println("Actual result = Expected result");
	        
		

	}

}
