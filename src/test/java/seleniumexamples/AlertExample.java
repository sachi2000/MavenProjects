package seleniumexamples;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SACHIN\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.switchTo().frame("login_page");
	
		 WebDriverWait wait = new WebDriverWait(driver,(1000));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'CONTINUE')]"))).click();
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'CONTINUE')]")));
		 Alert alert=driver.switchTo().alert();
		 String actualResult=alert.getText();
		 wait.until(ExpectedConditions.alertIsPresent());
		  alert.accept();
		 driver.switchTo().defaultContent();
		 System.out.println(actualResult);

	}

}
