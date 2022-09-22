package seleniumexamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SACHIN\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp ");
		String Company=driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]")).getText();
		System.out.println("Company : "+Company);
		String contact=driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText();
		System.out.println("Contact : "+contact);
		String country=driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]")).getText();
		System.out.println("Country : "+country);
		
		

	}

}
