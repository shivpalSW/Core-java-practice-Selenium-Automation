package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProgram3 {
//Adding a Mobile to a cart *Amazon india*
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"F:\\TESTING_FOLDER\\VELOCITY\\SOFTWARES\\chromedriver_Version 85.0.4183.83\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Hello, Sign in' ]")).click(); // By Text Function
		Thread.sleep(2000);
		//By Attribute name
		driver.findElement(By.xpath("//input[@id ='ap_email']")).sendKeys("9975119144");
		Thread.sleep(2000);
		//By contains method
		driver.findElement(By.xpath("//input[contains(@id,'continue')]")).click();
	
		driver.findElement(By.xpath("//input[@type ='password' ]")).sendKeys("24march1988");
		
		driver.findElement(By.xpath("//input[contains(@id,'signInSubmit')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[1]//a[1]//img[1]")).click();
		//  OR    //div[3]//div[1]//div[1]//div[1]//a[1]//img[1]
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button'][@title='Add to Shopping Cart']")).click();
	}
}
