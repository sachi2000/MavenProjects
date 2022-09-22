package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignUP {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\SACHIN\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
		
		//driver.findElement(By.name("firstname")).sendKeys("Sachin");
		//driver.findElement(By.name("lastname")).sendKeys("M B");

		// Using   xpath method fetching the First name and the Surname
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sachin"); 
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("M B");
		
		
		driver.findElement(By.name("reg_email__")).sendKeys("mbsachin2000@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mbsachin2000@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Sac@12mb");
		driver.findElement(By.id("day")).sendKeys("21");
		driver.findElement(By.name("birthday_month")).sendKeys("Feb");
		driver.findElement(By.name("birthday_year")).sendKeys("2000");
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		
		
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();
		//driver.findElement(By.name("websubmit")).click();
		
		

	}

}
