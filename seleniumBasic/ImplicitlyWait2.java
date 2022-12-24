package seleniumBasic;
//Use of isDisplayed Method
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait2 {

	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\TESTING_FOLDER\\VELOCITY\\SOFTWARES\\chromedriver_Version 85.0.4183.83\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/r.php");
		//Implicit wait provided
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String title = driver.getTitle();// getTitle method
		System.out.println(title);
		
		String url = driver.getCurrentUrl();  //getCurrentUrl method
		System.out.println(url);
		
		driver.navigate().to("https://www.yatra.com/");
		driver.navigate().back();
		Thread.sleep(3000);
		
		 WebElement logo = driver.findElement(By.xpath("(//a[@title='Go to Facebook home'])//i[1]"));
		 
		 boolean result = logo.isDisplayed();
		 
		 if (result == true) {
			 System.out.println("Facebook Logo Displayed");
		 }
		 else {
			 System.out.println("Facebook logo is not Displayed");
		 }
	}

}
