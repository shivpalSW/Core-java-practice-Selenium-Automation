package seleniumBasic;
//Use of isEnabled Method
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\TESTING_FOLDER\\VELOCITY\\SOFTWARES\\chromedriver_Version 85.0.4183.83\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/r.php");
		// Implicit wait provided
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.xpath("//input[@id= 'u_0_n']"));
		
		boolean result = ele.isEnabled();
		System.out.println(result);
		
		if(result== true) {
			ele.sendKeys("Zuckerberg");
		}
		else {
			System.out.println("Element Not Displayed");
		}
		
	}

}
