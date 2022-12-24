package seleniumBasic;  //17-8-2020
//Implicitly wait 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\TESTING_FOLDER\\VELOCITY\\SOFTWARES\\chromedriver_Version 85.0.4183.83\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://paytm.com/");
		
		//Implicit wait provided
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[@data-reactid='64']")).click();
	
	
		//to check weather Radio button element is selected or not 
		WebElement check = driver.findElement(By.xpath("//input[@id='radio1']"));

		boolean result = check.isSelected();  
		//isSelected is Web element Operational method
		System.out.println(result);
		
		if (result== true) {
			System.out.println("Postpaid Radion button is Selected");
		}
		else {
			System.out.println(" Postpaid Radion button is Not Selected");
		}
	}

}
